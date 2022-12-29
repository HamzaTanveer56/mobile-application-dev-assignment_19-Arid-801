package com.example.semesterproject;

import static com.example.semesterproject.R.id.moduleBtnId;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView receiver_msg = (TextView) findViewById(R.id.received_value_id);
        Button listOfModules = (Button) findViewById(moduleBtnId);

        listOfModules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AdapterActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiver_msg.setText("Welcome "+str+ "!");
    }
}