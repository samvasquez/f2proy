package com.sena.edu.wam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
    }
    public void imageView4(View view){
        Intent intent=new Intent(this, MainActivityLogin.class);
                startActivity(intent);

    }

}