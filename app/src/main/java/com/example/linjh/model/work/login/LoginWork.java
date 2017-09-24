package com.example.linjh.model.work.login;

import com.example.linjh.contract.login.LoginContract;
import com.example.linjh.model.javabean.LoginBean;

import rx.Observable;

/**
 * Created by linjh on 2017/9/24.
 */

public class LoginWork implements LoginContract.Work{
    @Override
    public Observable<LoginBean> login(String accout, String password) {
        return null;
    }
}
