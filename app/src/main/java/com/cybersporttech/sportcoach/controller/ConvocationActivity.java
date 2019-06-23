package com.cybersporttech.sportcoach.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.cybersporttech.sportcoach.R;

import java.util.ArrayList;
import java.util.List;

public class ConvocationActivity extends AppCompatActivity {


    private EditText mSportPratique;
    private EditText mNomdeClub;
    private EditText mCategNumEquipe;
    private EditText mLieu;
    private EditText mDate;
    private EditText mEvenement;
    private EditText mListJoueurs;
    private Button   mValidation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocation);

        mSportPratique = findViewById(R.id.sportPratique_txt);
        mNomdeClub = findViewById(R.id.nomduClub_txt);
        mCategNumEquipe = findViewById(R.id.categories_txt);
        mLieu = findViewById(R.id.lieu_txt);
        mDate = findViewById(R.id.date_txt);
        mEvenement = findViewById(R.id.evenement_txt);
        mListJoueurs = findViewById(R.id.ListeJoueurs_txt);
        mValidation = findViewById(R.id.Validation_btn);

    }
}
