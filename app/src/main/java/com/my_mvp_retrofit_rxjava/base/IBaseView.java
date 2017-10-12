package com.my_mvp_retrofit_rxjava.base;

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
 * 描 述：View的接口基类
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public interface IBaseView {

    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 完成加载
     */
    void dismiss();
}
