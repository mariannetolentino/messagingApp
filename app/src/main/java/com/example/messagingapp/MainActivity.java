package com.example.messagingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usernametxt;
    EditText passwordtxt;

    Button loginbtn;
    Button forgotbtn;
    Button createbtn;

    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //gets user's input of username and password
        usernametxt = (EditText) findViewById(R.id.editText);
        passwordtxt = (EditText) findViewById(R.id.editText2);

        //once user inputs information and clicks on login button
        //button is set to check database, if true, moves on
        //if false states false and resets inputs
        loginbtn = (Button) findViewById(R.id.login);
        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
                    //gets username and password inputs to convert
                    //to string, used to compare strings to database
                    public void onClick(View v) {
                    username = usernametxt.getText().toString();
                    password = passwordtxt.getText().toString();
            }
        });

        //once user hits forgot button
        //sends them to forgot screen
        forgotbtn = (Button) findViewById(R.id.forgot);
        forgotbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, forgot.class));
            }
        });

        //once user hits create button
        //sends them to create screen
        createbtn = (Button) findViewById(R.id.create);
        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, create.class));
            }
        });
    }
}
