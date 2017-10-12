package com.my_mvp_retrofit_rxjava.ui.home.post;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.my_mvp_retrofit_rxjava.R;
import com.my_mvp_retrofit_rxjava.base.BaseMVPActivity;
import com.my_mvp_retrofit_rxjava.bean.base.EventCenter;
import com.my_mvp_retrofit_rxjava.bean.home.post.PostBean;
import com.my_mvp_retrofit_rxjava.ui.home.post.presenter.IPostView;
import com.my_mvp_retrofit_rxjava.ui.home.post.presenter.PostPresenter;

import java.util.List;

/**
 * Created by TR 105 on 2017/8/22.
 */

public class PostActivity extends BaseMVPActivity<IPostView, PostPresenter> implements IPostView {
    private Button btn_post;
    private TextView tv_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_activity);
        btn_post = findViewById(R.id.btn_post);
        tv_post = findViewById(R.id.tv_post);
        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // getPresenter().getPostData(1, 10, 1024);
                getPresenter().getBanner();
            }
        });




    }

    @NonNull
    @Override
    public PostPresenter createPresenter() {
        return new PostPresenter(this);
    }

    @Override
    protected void onEventComing(EventCenter center) {

    }

    /**
     * 加载数据
     */
    @Override
    public void showLoading() {
        tv_post.setText("正在加载");
    }

    /**
     * 加载完成
     */
    @Override
    public void dismiss() {
        tv_post.setText("加载完成");

    }

    /**
     * 显示数据
     *
     * @param list
     */
    @Override
    public void showData(List<PostBean.Rest> list) {
        tv_post.setText(list.get(0).getContent());
    }

    @Override
    public void showData(String s) {
        tv_post.setText(s);
    }

    /**
     * 数据为空
     */
    @Override
    public void showEmpty() {
        tv_post.setText("数据为空");
    }

    /**
     * 显示消息
     *
     * @param msg
     */
    @Override
    public void showMessage(String msg) {
        tv_post.setText("加载失败");
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
}
