package com.stacklearning.androidmvp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.stacklearning.androidmvp.R;
import com.stacklearning.androidmvp.home.HomeActivity;

/**
 * Created by jaspreet on 23/2/18.
 */

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    EditText et_email,et_pass;
    Button btn_submit;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_email=(EditText) findViewById(R.id.et_email);
        et_pass=(EditText) findViewById(R.id.et_pass);
        btn_submit=(Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(this);

        presenter = new LoginPresenterImplementation(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_submit:
              presenter.onSubmitClick(et_email.getText().toString(),et_pass.getText().toString());
                break;
        }
    }

    @Override
    public void goToHomeActivity() {

        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    public void showError(String err) {

        Toast.makeText(this,err,Toast.LENGTH_SHORT).show();
    }
}
