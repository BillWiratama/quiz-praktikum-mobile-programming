package com.example.mvp_login.Presenter;

import android.content.Intent;

import com.example.mvp_login.MainActivity;
import com.example.mvp_login.Model.UserModel;
import com.example.mvp_login.Model.UserModelImp;
import com.example.mvp_login.Model.entity.User;
import com.example.mvp_login.View.LoginView;

public class LoginPresenterImp implements LoginPresenter,UserModel.Callback {
    private LoginView mLoginView;
    private UserModel mUserModel;
    private Object User;

    public LoginPresenterImp(LoginView mLoginView) {
        this.mLoginView = mLoginView;
        this.mUserModel = new UserModelImp();
    }


    @Override
    public void login(User user) {
        mUserModel.login(user ,this);

    }

    @Override
    public void onUsernameError(String msg) {
        mLoginView.showUsernameError(msg);
    }

    @Override
    public void onPasswordError(String msg) {
    mLoginView.showPasswordError(msg);
    }

    @Override
    public void onSuccess(String succesMessage) {
    mLoginView.showLoginSucces(succesMessage);
    mLoginView.NavigateToMain();
    }

    @Override
    public void onFail(String msg) {
    mLoginView.showloginFail(msg);
    }


}
