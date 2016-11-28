package com.example.fuxiangzhang.learn_mvp1.mvp.model;

import com.example.fuxiangzhang.learn_mvp1.bean.User;
import com.example.fuxiangzhang.learn_mvp1.retrofit.HttpMethods;

import rx.Subscriber;

/**
 * Created by Fuxiang.Zhang on 2016/11/24.
 */

public class MainModel implements BaseModel {
    @Override
    public void getUser(Subscriber<User> subscriber, String loginName) {
        HttpMethods.getInstance().getUser(subscriber,loginName);
    }
}
