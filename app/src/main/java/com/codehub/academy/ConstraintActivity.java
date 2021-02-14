package com.codehub.academy;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userNameEdit = findViewById(R.id.edit_usr);
                TextInputEditText passwdEdit = findViewById(R.id.edit_pass);
                String userStr = userNameEdit.getText().toString();
                String passwdStr = passwdEdit.getText().toString();

                if(userStr.matches("") || passwdStr.matches("")){
                    Toast.makeText(ConstraintActivity.this, "username or password empty", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(ConstraintActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}