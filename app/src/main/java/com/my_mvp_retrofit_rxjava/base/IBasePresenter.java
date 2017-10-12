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
 * 描 述：presenter的接口基类 View和Model的桥梁，它从Model层检索数据后，返回给View层
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public interface IBasePresenter<V extends IBaseView> {

    /**绑定接口*/
    void attachView(V view);

    /**释放接口*/
    void detachView();

}
