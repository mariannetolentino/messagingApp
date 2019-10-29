package com.example.messagingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class forgotusername extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText birthday;

    Button done;
    Button cancel;

    String sName;
    String sEmail;
    String sBday;

    TextView usernametxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotusername_main);

        name = (EditText) findViewById(R.id.userName);
        email = (EditText) findViewById(R.id.userEmail);
        birthday = (EditText) findViewById(R.id.userBday);

//        done = (Button) findViewById(R.id.done);
//        done.setOnClickListener(new View.OnClickListener(){
//            @Override
//            //gets username and password inputs to convert
//            //to string, used to compare strings to database
//            public void onClick(View v) {
//                sName = name.getText().toString();
//                sEmail = email.getText().toString();
//                sBday = birthday.getText().toString();
//
//                if (){
//                    findViewById(R.id.usernameView).setVisibility(View.VISIBLE);
//                    findViewById(R.id.username).setVisibility(View.VISIBLE);
//                    usernametxt = (TextView)findViewById(R.id.username);
//                    TextView.setText();
//                }
//            }
//        });

        //once user hits cancel button
        //sends them to main(login) screen
        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(forgotusername.this, MainActivity.class));
            }
        });
    }
}
