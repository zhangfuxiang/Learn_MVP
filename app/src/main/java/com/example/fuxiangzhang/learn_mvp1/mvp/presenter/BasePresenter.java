package com.example.fuxiangzhang.learn_mvp1.mvp.presenter;


import com.example.fuxiangzhang.learn_mvp1.mvp.view.Baseview;

/**
 * Created by Fuxiang.Zhang on 2016/11/24.
 */

public interface BasePresenter<T extends Baseview> {
    void attachView(T view);
    void detachView();
    void searchUser(String loginName);

}
