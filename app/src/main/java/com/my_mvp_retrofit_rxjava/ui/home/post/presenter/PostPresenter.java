package com.my_mvp_retrofit_rxjava.ui.home.post.presenter;


import com.my_mvp_retrofit_rxjava.base.IBasePresenter;
import com.my_mvp_retrofit_rxjava.bean.home.post.PostBean;
import com.my_mvp_retrofit_rxjava.ui.home.post.model.PostModel;

import java.util.List;

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
 * 创建日期：2017/2/7
 * <p/>
 * 描 述：View和Model的桥梁，它从Model层检索数据后，返回给View层
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class PostPresenter implements IBasePresenter<IPostView> {


    private IPostView mView;
    private PostModel mModel;

    public PostPresenter(IPostView view) {
        attachView(view);
        mModel = new PostModel(this);
    }

    @Override
    public void attachView(IPostView view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    public void showData(List<PostBean.Rest> list) {
        mView.dismiss();
        mView.showData(list);
    }
    public void showData(String s) {
        mView.dismiss();
        mView.showData(s);
    }
    public void showEmpty() {
        mView.dismiss();
        mView.showEmpty();
    }

    public void showMessage(String msg) {
        mView.showMessage(msg);
    }


    public void getPostData(int page, int number,int userID) {
        mView.showLoading();
        mModel.getPostData(page, number, userID);
    }
    public void getBanner() {
        mView.showLoading();
        mModel.getBannerInfo();
    }
}
