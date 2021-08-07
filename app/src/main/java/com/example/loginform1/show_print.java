package com.example.loginform1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class show_print extends AppCompatActivity {
      private TextView password,userandpass,username;
      private EditText username1, password1;
      private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_print);

        password = findViewById(R.id.textView);
        userandpass =findViewById(R.id.textView2);
        username  = findViewById(R.id.textView3);
        back = findViewById(R.id.btn2);

        String passerr = getIntent().getStringExtra("keypasserr");
        String usererr = getIntent().getStringExtra("usererr");
        password.setText(passerr);
        username.setText(usererr);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(show_print.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}