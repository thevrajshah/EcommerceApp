package edu.android.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class CustomLoginActivity extends AppCompatActivity {

    private static final String TAG = "CustomLoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_login);
    }

    public void xyz(View view) {
        Log.d(TAG, "xyz: clicked on button");
    }
}