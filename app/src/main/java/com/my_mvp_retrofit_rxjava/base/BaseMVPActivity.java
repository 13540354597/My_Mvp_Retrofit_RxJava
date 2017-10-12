package com.my_mvp_retrofit_rxjava.base;

import android.os.Bundle;
import android.support.annotation.NonNull;

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
 * 创建日期：2017/2/8 11:54
 * <p/>
 * 描 述：mvp activity基类
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public abstract class BaseMVPActivity<V extends IBaseView, P extends IBasePresenter<V>> extends
        SpringBaseActivity implements IBaseDelegate<V, P> {

    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    @NonNull
    @Override
    public P getPresenter() {
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }
}
