package com.example.messagingapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class forgot extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_main);

        Button forgotU;
        Button forgotP;

        //once user hits forgot username button
        //sends them to forgotusername screen
        forgotU = (Button) findViewById(R.id.forgotUsername);
        forgotU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(forgot.this, forgotusername.class));
            }
        });

        //once user hits forgot password button
        //sends them to forgotpassword screen
        forgotP = (Button) findViewById(R.id.forgotPassword);
        forgotP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(forgot.this, forgotpassword.class));
            }
        });

    }
}
