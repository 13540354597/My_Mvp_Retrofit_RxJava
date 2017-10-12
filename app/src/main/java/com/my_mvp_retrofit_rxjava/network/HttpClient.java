package com.my_mvp_retrofit_rxjava.network;

import com.androidnetworking.interceptors.HttpLoggingInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by TR 105 on 2017/8/4.
 */

public class HttpClient {
    private Retrofit mRetrofit;
    private HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
    private HttpService mHttpService;
    private static final String BASE_URL = "http://13.64.185.25:8081";

    public HttpClient() {
        initRestClint(BASE_URL);
    }

    public HttpClient(String baseUrl) {
        initRestClint(baseUrl);
    }

    public void initRestClint(String baseUrl) {
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        //日志拦截
        httpClient.addInterceptor(logging);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient.build())
                .build();

        mHttpService = mRetrofit.create(HttpService.class);
    }

    public HttpService getRectService() {
        if (mHttpService != null) {
            return mHttpService;
        }
        return null;
    }
}
