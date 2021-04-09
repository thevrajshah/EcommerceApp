package edu.android.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CustomLoginActivity extends AppCompatActivity {
    private static final String TAG = "CustomLoginActivity";


    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.getSupportActionBar().hide();
        setContentView(R.layout.activity_custom_login);

        email = findViewById(R.id.usernameCustom);
        password = findViewById(R.id.passwordCustom);
    }

    public void login(View view) {

        if(email.getText().toString().matches(".*@.*..*") && email.getText().toString().equals("svitcms@svit.ac.in")){
            if (password.getText().toString().equals("svitcms")) {
                Intent i = new Intent(CustomLoginActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
            else {
                password.setError("Alya badhu sarkhu nakh!!");
            }
        }
        else {
            email.setError("Alya badhu sarkhu nakh!!");
        }
    }

    public void register(View view) {
        Intent i = new Intent(CustomLoginActivity.this, RegisterActivity.class);
        startActivity(i);
        finish();
    }
}