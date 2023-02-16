package com.example.homedecor;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.homedecor.R;

public class MainActivity extends AppCompatActivity {
    EditText edUsername, edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUsername = findViewById(R.id.username);
        edPassword = findViewById(R.id.password);
        btn = findViewById(R.id.loginbtn);
        tv = findViewById(R.id.design);

        btn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();

                if (username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill the details" ,Toast.LENGTH_SHORT).show();

                } else
                    //incorrect
                    Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();

                tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this,MainActivity2.class));
                    }
                });


            }
        });
    }
}

