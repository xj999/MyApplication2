package com.example.linjh.presenter.login;

import android.os.Looper;
import android.util.Log;

import com.example.linjh.contract.login.LoginContract;
import com.example.linjh.model.javabean.LoginBean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by linjh on 2017/9/24.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private String TAG = "LoginPresenter";
    private LoginContract.Work mWork;
    private LoginContract.View mView;
    private Looper backgroundLooper;

    public LoginPresenter(LoginContract.View view, LoginContract.Work work) {
        mView = view;
        mWork = work;


    }

    @Override
    public void start() {

    }

    @Override
    public void login(String account, String password) {
        mView.startLoading();
        mWork.login(account, password).subscribeOn(Schedulers.newThread())
                // Be notified on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<LoginBean>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG, "onCompleted()");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError()", e);
                        mView.loginError(e.getMessage());
                    }

                    @Override
                    public void onNext(LoginBean string) {
                        mView.loginSuccess(string.getName());
                        Log.d(TAG, "onNext(" + string + ")");
                    }
                });
        ;
    }
}
