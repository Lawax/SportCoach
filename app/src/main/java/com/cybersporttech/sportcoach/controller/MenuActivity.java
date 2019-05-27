package com.cybersporttech.sportcoach.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cybersporttech.sportcoach.R;

public class MenuActivity extends AppCompatActivity {


    private TextView mSportCoach;
    private Button mConsulterUneConvocation;
    private Button mCreerUneConvocation;
    private Button mEnregistrerUnMembre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mSportCoach = findViewById(R.id.activity_nom_appli_text) ;
        mConsulterUneConvocation = findViewById(R.id.activity_consult_convocation_btn);
        mCreerUneConvocation = findViewById(R.id.activity_creation_convocation_btn);
        mEnregistrerUnMembre = findViewById(R.id.activity_register_member_btn);
        mEnregistrerUnMembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerActivity = new Intent(MenuActivity.this, RegisterActivity.class);
                startActivity(registerActivity);

            }
        });

    }
}
