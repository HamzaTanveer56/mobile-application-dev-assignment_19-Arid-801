package com.example.semesterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView email =(TextView)findViewById(R.id.email);
        TextView password =(TextView)findViewById(R.id.password);
        TextView forgotPassword = (TextView) findViewById(R.id.forgotPass);
        TextView registerAcc = (TextView) findViewById(R.id.registerAcc);
        Button loginBtn = (Button) findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(view -> {
            if(email.getText().toString().equals("")&& password.getText().toString().equals("")){
                Toast.makeText(LoginActivity.this,"Login Failed!!",Toast.LENGTH_SHORT).show();
            }
            else {
                String str = email.getText().toString();
                Intent goHome = new Intent(LoginActivity.this,MainActivity.class);
                goHome.putExtra("message_key", str);
                startActivity(goHome);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goForgotAct = new Intent(LoginActivity.this,ForgotPasswordActivity.class);
                startActivity(goForgotAct);
            }
        });

        registerAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRegAct = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(goRegAct);
            }
        });


    }
}