package com.cntt61.intent.sang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvName;
    private Button btnQuiz1, btnQuiz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvName = (TextView) findViewById(R.id.tvUserName);
        btnQuiz1 = (Button) findViewById(R.id.btnQuiz1);
        btnQuiz2 = (Button) findViewById(R.id.btnQuiz2);

        Intent i = getIntent();
        String UserName = i.getStringExtra("Name");

        tvName.setText(UserName);

        btnQuiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuiz1 = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(iQuiz1);
            }
        });

        btnQuiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuiz2 = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(iQuiz2);
            }
        });
    }
}