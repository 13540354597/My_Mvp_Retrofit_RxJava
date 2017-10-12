package com.my_mvp_retrofit_rxjava.network;


import com.my_mvp_retrofit_rxjava.bean.home.post.PostBean;
import com.my_mvp_retrofit_rxjava.bean.home.tips.BannerBottomInfo;
import com.my_mvp_retrofit_rxjava.bean.home.tips.NewBannerInfo;
import com.my_mvp_retrofit_rxjava.bean.home.tips.PushArticleInfo;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;


/**
 * Created by TR 105 on 2017/8/4.
 */

public interface HttpService {

    @GET("/GetBanner")
    Observable<NewBannerInfo> getBanner(@Query("number") int number, @Query("languageCode") String languageCode);

    @GET("/getpushofall")
    Observable<PushArticleInfo> getPushOfAll(@Query("languageCode") String languageCode);

    @GET("/GetPushType")
    Observable<RequestBody> getPushType(@Query("languageCode") String languageCode);

    @GET("/getposts")
    Observable<PostBean> getPostData(@Query("page") int page, @Query("number") int number, @Query("userID") int userID, @Query("languageCode") String languageCode);
}
