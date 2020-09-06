package com.example.mycovid19project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onLogIn(View view) {
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
    public void onRegister(View view) {
        Intent i=new Intent(this,Register.class);
        startActivity(i);
    }
}