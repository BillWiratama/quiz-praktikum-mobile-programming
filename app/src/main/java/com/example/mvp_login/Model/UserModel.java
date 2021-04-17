package com.example.mvp_login.Model;

import com.example.mvp_login.Model.entity.User;

public interface UserModel {
    void login(User user, Callback callback);

    void login(String username,String password,Callback callback);

    interface Callback{
        void onUsernameError(String msg);

        void onPasswordError(String msg);

        void onSuccess(String succesMessage);

        void onFail(String msg);

    }

}
