package com.example.eshikshaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity  extends AppCompatActivity {

    EditText editTextEmail, editTextPassword, confirmPassword;
    Button buttonReg;
    FirebaseAuth mAuth;
    TextView textView;

    String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    String email_pattern = "[a-zA-z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.conf_password);
        buttonReg = findViewById(R.id.btn_register);
        textView = findViewById(R.id.loginNow);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String email, password, conf_password;
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());
                conf_password = String.valueOf(confirmPassword.getText());


                if(password.equals(conf_password)){
                    if (TextUtils.isEmpty(email)) {
                        Toast.makeText(RegisterActivity.this, "Enter email", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (TextUtils.isEmpty(password)){
                        Toast.makeText(RegisterActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (!password.matches(passwordPattern)) {
                        Toast.makeText(RegisterActivity.this, "Password must contain a number, an uppercase letter, a lowercase letter, a special character, and have a minimum length of 8 characters", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (!email.matches(email_pattern)){
                        Toast.makeText(RegisterActivity.this, "Enter correct email", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    mAuth.createUserWithEmailAndPassword(email,password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(RegisterActivity.this, "Account created.",
                                                Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Password does not match",
                            Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
