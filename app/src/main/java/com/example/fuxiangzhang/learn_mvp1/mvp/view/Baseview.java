package com.example.fuxiangzhang.learn_mvp1.mvp.view;

import com.example.fuxiangzhang.learn_mvp1.bean.User;

/**
 * Created by Fuxiang.Zhang on 2016/11/24.
 */

public interface Baseview {
    void showProgressDialog();
    void hideProgressDialog();
    void showText(User userbean);
    void showErrorMessage(String text);
}
