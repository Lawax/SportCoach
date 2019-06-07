package com.cybersporttech.sportcoach.controller;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.cybersporttech.sportcoach.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {


    private TextView mGreetingText;
    private ProgressBar mProgressBar;
    private EditText mPassword;
    private EditText mEmailInput;
    private Button mRegisterButton;
    private Button mConnexionButton;

    FirebaseAuth firebaseAuth;



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGreetingText = findViewById(R.id.activity_main_mGreetingText);
        mEmailInput = findViewById(R.id.activity_main_email_input);
        mPassword = findViewById(R.id.activity_main_password);
        mProgressBar = findViewById(R.id.main_progressBar);
        mRegisterButton = findViewById(R.id.activity_register_btn);
        mConnexionButton = findViewById(R.id.activity_main_connexion_btn);
        firebaseAuth = FirebaseAuth.getInstance();
        mRegisterButton.setEnabled(false);

        mEmailInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mRegisterButton.setEnabled (s.toString().length()!=1);//activation du bouton dès la saisie d'un caractère

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });
        mConnexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuActivity = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(menuActivity);
                //Ce bouton permet à l'utilisateur d'arriver sur la page menu

            }
        });

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mProgressBar.setVisibility(View.VISIBLE);
                //setMessage(); appel de la méthode set message BDD à transvaser dans le main register
                firebaseAuth.createUserWithEmailAndPassword(mEmailInput.getText().toString(),
                        mPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) { mProgressBar.setVisibility(View.GONE);
                            Toast.makeText(MainActivity.this, "Compte enregistré", Toast.LENGTH_LONG).show();
                        } else { mProgressBar.setVisibility(View.GONE);
                            Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                });

                Intent registerActivity = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerActivity);
                //Ce bouton permet à l'utilisateur d'arriver sur la page d'enregistrement
            }


        });

        mConnexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuActivity.class ));
            }
        });

    }}