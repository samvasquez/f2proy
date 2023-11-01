package com.sena.edu.wam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivityLogin extends AppCompatActivity {


    private Intent ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);


    }


    public void imageView11(View view) {
        Intent intent= new Intent(this, MainActivityMenu.class);
        startActivity(intent);
    }
}
