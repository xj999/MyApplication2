package com.example.linjh.base;

/**
 * Created by linjh on 2017/9/24.
 */

public interface BaseView<T>{
    void startLoading();
    void stopLoading();
    void showToast(String msg);
    void showToast(int stringId);
    void setPresenter(T presenter);
}
