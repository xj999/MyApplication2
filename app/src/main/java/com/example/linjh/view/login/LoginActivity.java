package com.example.linjh.view.login;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.linjh.base.BaseActivity;
import com.example.linjh.contract.login.LoginContract;

/**
 * Created by linjh on 2017/9/24.
 */

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }

    @Override
    public void loginSuccess(String data) {

    }

    @Override
    public void loginError(String msg) {

    }
}
