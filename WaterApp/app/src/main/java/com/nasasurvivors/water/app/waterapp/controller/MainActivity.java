package com.nasasurvivors.water.app.waterapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.nasasurvivors.water.app.waterapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        Button login = (Button) findViewById(R.id.login);
        Button register = (Button) findViewById(R.id.register);
        Button editProfile = (Button) findViewById(R.id.edit_profile);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLogin = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(toLogin);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegister = new Intent(getBaseContext(), RegistrationActivity.class);
                startActivity(toRegister);
            }
        });

        if (AppSingleton.getInstance().getUsername() != null) {
            login.setVisibility(View.INVISIBLE);
            register.setVisibility(View.INVISIBLE);
            editProfile.setVisibility(View.VISIBLE);
        }

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toEditProfile = new Intent(getBaseContext(), EditProfileActivity.class);
                startActivity(toEditProfile);
            }
        });

    }

}
