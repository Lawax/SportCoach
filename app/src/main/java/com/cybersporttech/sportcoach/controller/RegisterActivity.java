package com.cybersporttech.sportcoach.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.cybersporttech.sportcoach.R;

public class RegisterActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    private TextView mmain_regisname_input;
    private EditText mmain_regisnameplayer_input;
    private EditText mmain_regisurname_input;
    private EditText mmain_registel_input;
    private EditText mmain_regisport_input;
    private EditText mmain_regisclub_input;
    private EditText mmain_regiscateg_input;
    private EditText mmain_regisnumequipe_input;
    private Button mmain_regisplayer_btn;
    private Button mmain_regiscoach_btn;
    // MAIL ET PASS a récuperer du menu


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mmain_regisname_input = findViewById(R.id.activity_main_regisname_input);
        mmain_regisnameplayer_input = findViewById(R.id.activity_main_regisnameplayer_input);
        mmain_regisurname_input = findViewById(R.id.activity_main_regisurname_input);
        mmain_registel_input = findViewById(R.id.activity_main_registel_input);
        mmain_regisport_input = findViewById(R.id.activity_main_regisport_input);
        mmain_regisclub_input = findViewById(R.id.activity_main_regisclub_input);
        mmain_regiscateg_input = findViewById(R.id.activity_main_regiscateg_input);
        mmain_regisnumequipe_input = findViewById(R.id.activity_main_regisnumequipe_input);
        //mEmailInput = findViewById(R.id.activity_main_regismail_input);
        //mPassword = findViewById(R.id.activity_main_regisPass_input);
        mmain_regisplayer_btn = findViewById(R.id.activity_main_regisplayer_btn);
        mmain_regiscoach_btn = findViewById(R.id.activity_main_regiscoach_btn);




    }

// Ensuite PAR LE BIAIS du bouton d'enregistement en bas d'un membre, il placer le set message pour enregistrer dans la BDD
    public void setMessage() {
        String str = mmain_regisname_input.getText().toString().trim();
        myRef.setValue(str); // zone de saisie destinée à être enregistrée dans la bdd Firebase
}}

