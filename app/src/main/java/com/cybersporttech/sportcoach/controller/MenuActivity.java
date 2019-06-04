package com.cybersporttech.sportcoach.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cybersporttech.sportcoach.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MenuActivity extends AppCompatActivity {


    private TextView mSportCoach;
    private Button mdeconnexion;
    private Button mConsulterUneConvocation;
    private Button mCreerUneConvocation;
    private Button mEnregistrerUnMembre;

    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mFirebaseAuth = FirebaseAuth.getInstance();


        mSportCoach = findViewById(R.id.activity_nom_appli_text) ;
        mdeconnexion = findViewById(R.id.deconnexion_bton);
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
        mdeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(MenuActivity.this, MainActivity.class);
                startActivity (MainActivity);
            }
        }

        );
        mdeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
