package com.cybersporttech.sportcoach.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cybersporttech.sportcoach.R;

public class ConvocationActivity extends AppCompatActivity {


    private EditText mNomdeClub;
    private EditText mCategNumEquipe;
    private EditText mLieu;
    private EditText mDate;
    private EditText mListJoueurs;
    private Button mValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocation);

        mNomdeClub = findViewById(R.id.nomduClub_txt);
        mCategNumEquipe = findViewById(R.id.categories_txt);
        mLieu = findViewById(R.id.lieu_txt);
        mDate = findViewById(R.id.date_txt);
        mListJoueurs = findViewById(R.id.ListeJoueurs_txt);
        mValidation = findViewById(R.id.Validation_btn);



        mValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //interaction with db by php
            }
        });
    }


    public EditText getmNomdeClub() {
        return mNomdeClub;
    }

    public void setmNomdeClub(EditText mNomdeClub) {
        this.mNomdeClub = mNomdeClub;
    }

    public EditText getmCategNumEquipe() {
        return mCategNumEquipe;
    }

    public void setmCategNumEquipe(EditText mCategNumEquipe) {
        this.mCategNumEquipe = mCategNumEquipe;
    }
    public EditText getmLieu() {
        return mLieu;
    }

    public void setmLieu(EditText mLieu) {
        this.mLieu = mLieu;
    }

    public EditText getmDate() {
        return mDate;
    }

    public void setmDate(EditText mDate) {
        this.mDate = mDate;
    }

    public EditText getmListJoueurs() {
        return mListJoueurs;
    }

    public void setmListJoueurs(EditText mListJoueurs) {
        this.mListJoueurs = mListJoueurs;
    }

}

