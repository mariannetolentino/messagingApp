package com.example.messagingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class forgotpassword extends AppCompatActivity {

    EditText security1;
    EditText security2;
    EditText username;

    String uName;
    String answer1;
    String answer2;

    Button donebtn;
    Button cancelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword_main);

        security1 = (EditText) findViewById(R.id.secQ1);
        security2 = (EditText) findViewById(R.id.secQ2);
        username = (EditText) findViewById(R.id.userName);

        donebtn = (Button) findViewById(R.id.done);
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (){

                    startActivity(new Intent(forgotpassword.this, passwordreset.class));
                 }
             }
         });

        cancelbtn = (Button) findViewById(R.id.cancel);
        cancelbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(forgotpassword.this, MainActivity.class));
            }
        });
    }
}
