package com.example.aidsawarness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        Intent intent= new Intent(LoginActivity.this, UserHome.class);
          startActivity(intent);
    }

    public void loginwithfacebook(View view) {
//        Intent intent= new Intent(LoginActivity.this, LocationPicker.class);
//        startActivity(intent);
    }

    public void register(View view) {
        Intent intent= new Intent(LoginActivity.this,SignUp.class);
        startActivity(intent);
    }
}
