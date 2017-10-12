package com.my_mvp_retrofit_rxjava.ui.home.post.model;

import android.text.TextUtils;
import android.util.Log;

import com.my_mvp_retrofit_rxjava.base.BaseModel;
import com.my_mvp_retrofit_rxjava.bean.home.post.PostBean;
import com.my_mvp_retrofit_rxjava.bean.home.tips.BannerBottomInfo;
import com.my_mvp_retrofit_rxjava.bean.home.tips.NewBannerInfo;
import com.my_mvp_retrofit_rxjava.bean.home.tips.PushArticleInfo;
import com.my_mvp_retrofit_rxjava.network.HttpClient;
import com.my_mvp_retrofit_rxjava.ui.home.post.presenter.PostPresenter;


import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;
import retrofit2.http.POST;


/**
 * ========================================
 * <p/>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/2/8 14:00
 * <p/>
 * 描 述：业务具体处理，包括负责存储、检索、操纵数据等
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class PostModel extends BaseModel<PostPresenter> {
    private PostPresenter mIPresenter;

    public PostModel(PostPresenter presenter) {
        super(presenter);
        mIPresenter = presenter;
    }

    public void getPostData(int page, int number, int userID) {

        new HttpClient()
                .getRectService()
                .getPostData(page, number, userID, "en")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PostBean>() {
                    @Override
                    public void accept(PostBean postBean) throws Exception {

                        if (postBean == null || postBean.getRest() == null
                                || postBean.getRest().size() <= 0) {
                            mIPresenter.showEmpty();
                        } else {
                            mIPresenter.showData(postBean.getRest());
                        }

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                        mIPresenter.showMessage(throwable.toString());
                    }
                });
    }


    public void getBannerInfo() {

        HttpClient httpClient = new HttpClient();
        Observable<NewBannerInfo> observable1 = httpClient.getRectService().getBanner(4, "en");
        Observable<PushArticleInfo> observable2 = httpClient.getRectService().getPushOfAll("en");
        Observable<PostBean> observable3 = httpClient.getRectService().getPostData(1, 10, 1024, "en");
        Observable.zip(observable1, observable2, observable3, new Function3<NewBannerInfo, PushArticleInfo, PostBean, String>() {
            @Override
            public String apply(NewBannerInfo newBannerInfo, PushArticleInfo pushArticleInfo, PostBean bannerBottomInfo) throws Exception {
                return "newBannerInfo:" + newBannerInfo.getRest().get(0).getImageUrl() + "pushArticleInfo:" + pushArticleInfo.getRest().get(0).getHtmlUrl() + "bannerBottomInfo:" + bannerBottomInfo.getRest().get(0).getContent();
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                mIPresenter.showData(s);

            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mIPresenter.showMessage(throwable.toString());
                //com.google.gson.JsonSyntaxException: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was BEGIN_ARRAY at line 1 column 2 path $
            }
        });

    }
}
