package com.example.exercise2_bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button a,b,c,d;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.button2);
        b = findViewById(R.id.button3);
        c = findViewById(R.id.button4);
        d = findViewById(R.id.button5);
        textView = findViewById(R.id.text);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setBackgroundResource(R.color.teal_200);
            }
        });
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setBackgroundResource(R.color.purple_200);
           }
       });
       c.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setBackgroundResource(R.color.purple_500);
           }
       });
       d.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setBackgroundResource(R.color.black);
           }
       });
    }

}