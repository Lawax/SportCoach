package com.cybersporttech.sportcoach.View;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ProgressBar;

import com.cybersporttech.sportcoach.R;
import com.cybersporttech.sportcoach.model.Convoc.Convocation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Date;

public class ConvocationActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText mNomdeClub;
    private EditText mCategNumEquipe;
    private EditText mLieu;
    private EditText mDate;
    private EditText mListJoueurs;
    private Button mValidation;
    private Button mmain_back_menu_btn;
    private ProgressBar progressBar;

    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;
    private FirebaseFirestore db;


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
        mmain_back_menu_btn = findViewById(R.id.back_menu_btn);

        findViewById(R.id.Validation_btn).setOnClickListener(this);
        findViewById(R.id.activity_consult_convocation_btn).setOnClickListener(this);

        db = FirebaseFirestore.getInstance();
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();



    }

    private boolean validateInputs(String club, String categorie, String lieu,String date,String listjoueurs) {

        if (club.isEmpty()) {
            mNomdeClub.setError("Club?");
            mNomdeClub.requestFocus();
            return true;
        }

        if (categorie.isEmpty()) {
            mCategNumEquipe.setError("categorie?");
            mCategNumEquipe.requestFocus();
            return true;
        }

        if (lieu.isEmpty()) {
            mLieu.setError("Lieu?");
            mLieu.requestFocus();
            return true;
        }
        if (date.isEmpty()) {
            mDate.setError("Date?");
            mDate.requestFocus();
            return true;
        }

        if (listjoueurs.isEmpty()) {
            mListJoueurs.setError("Liste des joueurs?");
            mListJoueurs.requestFocus();
            return true;

        }
        return false;
    }


        String club = mNomdeClub.getText().toString().trim();
        String categorie = mCategNumEquipe.getText().toString().trim();
        String lieu = mLieu.getText().toString().trim();
        String date = mDate.getText().toString().trim();
        String listjoueurs= mListJoueurs.getText().toString().trim();


        private void saveConvocation() {
            String categorie = mCategNumEquipe.getText().toString().trim();
            String lieu = mLieu.getText().toString().trim();
            String date = mDate.getText().toString().trim();
            String listjoueurs = mListJoueurs.getText().toString().trim();


            if (!validateInputs(club, categorie, lieu, date, listjoueurs)) {

                CollectionReference dbConvocations = db.collection("convocations");

                Convocation convocation = new Convocation(club, categorie, lieu, date, listjoueurs);

                dbConvocations.add(convocation)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(ConvocationActivity.this, "Product Added", Toast.LENGTH_LONG).show();

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(ConvocationActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();

                            }
                        });
            }
        }
        @Override
        public void onClick(View v) {

        switch(v.getId()) {
            case R.id.Validation_btn:
                saveConvocation();
                break;
            case R.id.activity_consult_convocation_btn:
                startActivity(new Intent(this, ReadConvocationActivity.class));
                break;
        }

                mmain_back_menu_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        Intent bckmenu = new Intent(ConvocationActivity.this, MenuActivity.class);
                        startActivity(bckmenu);
                    }
                });


            }

        }


