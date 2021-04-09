package edu.android.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.android.ecommerceapp.ui.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.getSupportActionBar().hide();
        setContentView(R.layout.activity_register);
    }

    public void back(View view) {
        Intent i = new Intent(RegisterActivity.this, CustomLoginActivity.class);
        startActivity(i);
        finish();
    }
}