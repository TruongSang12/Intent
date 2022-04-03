package com.cntt61.intent.sang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn1, btn2;

    @Override
    protected  void OnCreate(Bundle savedInstaceState){
        super.OnCreate(savedInstaceState);
        setContentView(R.layout.activity_home);

        tv = (TextView) findViewById(R.id.tvUsername);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        Intent i = getIntent();
        String Username = i.getStringExtra("Name");

        tv.setText(Username);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q1 = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(Q1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q2 = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(Q2);
            }
        });
    }
}
