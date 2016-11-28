package com.example.fuxiangzhang.learn_mvp1.mvp.model;

import com.example.fuxiangzhang.learn_mvp1.bean.User;

import rx.Subscriber;

/**
 * Created by Fuxiang.Zhang on 2016/11/24.
 */

public interface BaseModel {
    void getUser(Subscriber<User> subscriber, String loginName);

}
