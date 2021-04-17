package com.example.mvp_login.Model;


import android.text.TextUtils;

import com.example.mvp_login.Model.entity.User;

public class UserModelImp implements UserModel {

    @Override
    public void login(User user, Callback callback) {
        if (TextUtils.isEmpty(user.getUsername())){
            callback.onUsernameError("Username is Empty");
            return;
        }
        if(TextUtils.isEmpty(user.getPassword())){
            callback.onPasswordError("Password is Empty");
            return;
        }
        if (user.getUsername().equals("admin") && user.getPassword().equals("Admin")) {
            callback.onSuccess("login Succes");
        }else {
            callback.onFail("Username or passsword is Invalidate");
        }
    }


    @Override
    public void login(String username, String password, Callback callback) {
        //todo
    }
}