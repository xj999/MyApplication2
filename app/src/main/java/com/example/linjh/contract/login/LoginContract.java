package com.example.linjh.contract.login;

import com.example.linjh.base.BasePresenter;
import com.example.linjh.base.BaseView;
import com.example.linjh.model.javabean.LoginBean;

import rx.Observable;

/**
 * Created by linjh on 2017/9/24.
 */

public class LoginContract {
    public interface View extends BaseView<Presenter> {
        void loginSuccess(String data);

        void loginError(String msg);
    }

    public interface Presenter extends BasePresenter {
        void login(String account, String password);

    }

    public interface Work

    {
        Observable<LoginBean> login(String accout, String password);
    }
}
