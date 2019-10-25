package com.example.messagingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class create2 extends AppCompatActivity {
    EditText birthday;
    EditText security1;
    EditText security2;

    String bday;
    String answer1;
    String answer2;

    Button donebtn;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword_main);

        security1 = (EditText) findViewById(R.id.secQ1);
        security2 = (EditText) findViewById(R.id.secQ2);
        birthday = (EditText) findViewById(R.id.userBday);

        donebtn = (Button) findViewById(R.id.done);
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    bday = birthday.getText().toString();
                    answer1 = security1.getText().toString();
                    answer2 = security2.getText().toString();
                    startActivity(new Intent(create2.this, MainActivity.class));
            }
        });

        backbtn = (Button) findViewById(R.id.cancel);
        backbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(create2.this, create.class));
            }
        });
    }
}
