package com.cybersporttech.sportcoach.controller;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.cybersporttech.sportcoach.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    private TextView mGreetingText;
    private EditText mNameInput;
    private Button mPlayButton;
    private Button mRegisterButton;

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mGreetingText =  findViewById(R.id.activity_main_greeting_txt);
            mNameInput = findViewById(R.id.activity_main_name_input);
            mRegisterButton = findViewById(R.id.activity_register_team_btn);
            mRegisterButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The user just clicked
                }
            });
            mPlayButton = findViewById(R.id.activity_main_play_btn);
            mPlayButton.setEnabled(false);
            mPlayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The user just clicked

                }
            });
            mNameInput.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    mPlayButton.setEnabled(s.toString().length() != 0); //activation du bouton dès la saisie d'un caractère
                    mRegisterButton.setEnabled(true); // activation du bouton pour pouvoir s'enregistrer


                }

                @Override
                public void afterTextChanged(Editable s) {
                    setMessage();
                }

            });
            mPlayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent menuActivity = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(menuActivity);
                    //Ce bouton permet à l'utilisateur d'arriver sur la page menu

                }
            });
            mRegisterButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent registerActivity = new Intent(MainActivity.this, RegisterActivity.class);
                    startActivity(registerActivity);
                    //Ce bouton permet à l'utilisateur d'arriver sur la page d'enregistrement
                }
            });

        }
    public void setMessage ()
    {
        String str = mNameInput.getText().toString().trim();
        myRef.setValue(str); // zone de saisie destinée à être enregistrée dans la bdd Firebase
    }
}