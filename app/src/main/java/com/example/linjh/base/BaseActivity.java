package com.example.linjh.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.linjh.contract.login.LoginContract;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void startLoading() {

    }

    public void stopLoading() {

    }

    public void showToast(String msg) {

    }

    public void showToast(int stringId) {

    }


}

