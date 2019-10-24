package com.example.messagingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class passwordreset extends AppCompatActivity {

    EditText password;
    EditText password2;

    Button done;
    Button cancel;

    String pass1;
    String pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwordreset_main);

        password = (EditText) findViewById(R.id.password);
        password2 = (EditText) findViewById(R.id.password2);

        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            //gets username and password inputs to convert
            //to string, used to compare strings to database
            public void onClick(View v) {
                pass1 = password.getText().toString();
                pass2 = password.getText().toString();
                startActivity(new Intent(passwordreset.this, MainActivity.class));
            }
        });

        //once user hits cancel button
        //sends them to main(login) screen
        cancel = (Button) findViewById(R.id.create);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(passwordreset.this, MainActivity.class));
            }
        });
    }
}
