package com.cybersporttech.sportcoach.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cybersporttech.sportcoach.R;

public class RegisterActivity extends AppCompatActivity {


    private TextView mmain_regisname_input;
    private EditText mmain_regisnameplayer_input;
    private EditText mmain_regisurname_input;
    private EditText mmain_registel_input;
    private EditText mmain_regisport_input;
    private EditText mmain_regisclub__input;
    private EditText mmain_regiscateg_input;
    private EditText mmain_regisnumequipe_input;
    private EditText mmain_regismail_input;
    private Button mmain_regisplayer_btn;
    private Button mmain_regiscoach_btn;
    private Button mmain_regisfiche_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mmain_regisname_input = findViewById(R.id.activity_main_regisname_input);
        mmain_regisnameplayer_input = findViewById(R.id.activity_main_regisnameplayer_input);
        mmain_regisurname_input = findViewById(R.id.activity_main_regisurname_input);
        mmain_registel_input = findViewById(R.id.activity_main_registel_input);
        mmain_regisport_input = findViewById(R.id.activity_main_regisport_input);
        mmain_regisclub__input = findViewById(R.id.activity_main_regisclub__input);
        mmain_regiscateg_input = findViewById(R.id.activity_main_regiscateg_input);
        mmain_regisnumequipe_input = findViewById(R.id.activity_main_regisnumequipe_input);
        mmain_regismail_input = findViewById(R.id.activity_main_regismail_input);
        mmain_regisplayer_btn = findViewById(R.id.activity_main_regisplayer_btn);
        mmain_regiscoach_btn = findViewById(R.id.activity_main_regiscoach_btn);
        mmain_regisfiche_btn = findViewById(R.id.activity_main_regisfiche_btn);



    }
}
