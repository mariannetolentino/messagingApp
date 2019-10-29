package com.example.messagingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class create extends AppCompatActivity {
    EditText nameInput;
    EditText emailInput;
    EditText passwordInput;
    EditText passwordCInput;

    Button loginbtn;
    Button cancelbtn;

    String name;
    String email;
    String password;
    String cPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_main);

        nameInput = (EditText) findViewById(R.id.userName);
        emailInput = (EditText) findViewById(R.id.email);
        passwordInput = (EditText) findViewById(R.id.userpword);
        passwordCInput= (EditText) findViewById(R.id.usercpword);

        //once user inputs information and clicks on login button
        //button is set to check database, if true, moves on
        //if false states false and resets inputs
        loginbtn = (Button) findViewById(R.id.conti);
        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //gets username and password inputs to convert
            //to string, used to compare strings to database
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                password = passwordInput.getText().toString();
                cPassword = passwordCInput.getText().toString();

                //compares passwords, if true, move on
                //if false, retries
                if (password == cPassword) {
                    startActivity(new Intent(create.this, create2.class));
                }
            }
        });

        //once user hits cancel button
        //sends them to main(login) screen
        cancelbtn = (Button) findViewById(R.id.createCancel);
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(create.this, MainActivity.class));
            }
        });

    }
}
