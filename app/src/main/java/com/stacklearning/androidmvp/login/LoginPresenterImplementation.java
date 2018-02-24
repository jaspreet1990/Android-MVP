package com.stacklearning.androidmvp.login;

import android.text.TextUtils;

/**
 * Created by jaspreet on 23/2/18.
 */

public class LoginPresenterImplementation implements LoginPresenter {

    LoginView loginView;

    public LoginPresenterImplementation(LoginView loginView) {

         this.loginView=loginView;
    }

    @Override
    public void onSubmitClick(String email, String password) {

        if (TextUtils.isEmpty(email)) {
            loginView.showError("Email cannot empty");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            loginView.showError("  Passsword cannot empty");
            return;
        }

        if (email.equalsIgnoreCase("stacklearning") && password.equalsIgnoreCase("1234")){
                loginView.goToHomeActivity();
        } else {
            loginView.showError("Email and Passsword do not Match");
        }
    }
}
