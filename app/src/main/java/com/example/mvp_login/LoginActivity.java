package com.example.mvp_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp_login.Model.entity.User;
import com.example.mvp_login.Presenter.LoginPresenter;
import com.example.mvp_login.Presenter.LoginPresenterImp;
import com.example.mvp_login.View.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter mloginpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupMVP();
    }

    private void setupMVP(){
        mloginpresenter = new LoginPresenterImp(this);
    }


    @Override
    public void showUsernameError(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPasswordError(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showLoginSucces(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showloginFail(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void NavigateToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Login(View view) {
        String username = ((EditText)findViewById(R.id.edt_username)).getText().toString();
        String password = ((EditText)findViewById(R.id.et_pass)).getText().toString();
        mloginpresenter.login(new User(username,password));
    }
}