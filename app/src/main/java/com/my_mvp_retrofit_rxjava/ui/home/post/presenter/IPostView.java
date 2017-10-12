package com.my_mvp_retrofit_rxjava.ui.home.post.presenter;


import com.my_mvp_retrofit_rxjava.base.IBaseView;
import com.my_mvp_retrofit_rxjava.bean.home.post.PostBean;

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
 * 创建日期：2017/2/8 14:00
 * <p/>
 * 描 述：UI界面抽象出来的接口
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public interface IPostView extends IBaseView {

    /**
     * 显示数据
     */
    void showData(List<PostBean.Rest> list);

    void showData(String s);

    /**
     * 无数据
     */
    void showEmpty();

    /**
     * 检测数据
     */
    void showMessage(String msg);
}
