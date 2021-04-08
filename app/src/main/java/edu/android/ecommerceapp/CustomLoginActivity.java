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
        setContentView(R.layout.activity_custom_login);

        email = findViewById(R.id.usernameCustom);
        password = findViewById(R.id.passwordCustom);
    }



    public void login(View view) {
        if (email.getText().toString().equals("cmsapp@svit.in") && email.getText().toString().matches(".*@.*.[com|in]")){
            if(password.getText().toString().equals("1234")){
                Intent i = new Intent(CustomLoginActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
            else{
                password.setError("Please enter valid password");
            }
        }
        else{
            email.setError("Please enter valid email");
        }
    }
}