package com.cntt61.intent.sang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText edName, edPass, edMail;
    private Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edName = (EditText) findViewById(R.id.edtUserName);
        edPass = (EditText) findViewById(R.id.edtPass);
        edMail = (EditText) findViewById(R.id.edtMail);
        btnAccept = (Button) findViewById(R.id.btnOK);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = edName.getText().toString().trim();
                String Pass = edPass.getText().toString().trim();
                String Mail = edMail.getText().toString().trim();
                if(TextUtils.isEmpty(UserName) || TextUtils.isEmpty(Pass) || TextUtils.isEmpty(Mail))
                {
                    Toast.makeText(LoginActivity.this, "Đăng nhập thất bại", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                iQuiz.putExtra("Name", UserName);
                startActivity(iQuiz);
            }
        });
    }
}