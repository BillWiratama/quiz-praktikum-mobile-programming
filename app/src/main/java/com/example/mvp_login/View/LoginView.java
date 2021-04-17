package com.example.mvp_login.View;

public interface LoginView {

    void showUsernameError(String msg);

    void showPasswordError(String msg);

    void showLoginSucces(String msg);

    void showloginFail(String msg);

    void NavigateToMain();
}
