package com.cybersporttech.sportcoach.View;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cybersporttech.sportcoach.R;
import com.cybersporttech.sportcoach.model.Coach.Coach;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


public class RegisterCoach extends AppCompatActivity implements View.OnClickListener{

    private EditText mmain_regisname_input;
    private EditText mmain_regisurname_input;
    private EditText mmain_regisclub_input;
    private EditText mmain_regiscateg_input;
    private EditText mmain_registel_input;
    private EditText mmain_regismail_input;
    private Button mmain_regiscoach_btn;
    private Button mmain_back_menu_btn;


    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;
    private FirebaseFirestore db;

    public RegisterCoach() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_coach);
        mmain_regismail_input = findViewById(R.id.activity_regis_mail);
        mmain_regisname_input = findViewById(R.id.activity_main_regisname_input);
        mmain_regisurname_input = findViewById(R.id.activity_main_regisurname_input);
        mmain_regisclub_input = findViewById(R.id.activity_main_regisclub_input);
        mmain_regiscateg_input = findViewById(R.id.activity_main_regiscateg_input);
        mmain_registel_input = findViewById(R.id.activity_main_registel_input);
        mmain_regiscoach_btn = findViewById(R.id.activity_main_regiscoach_btn);
        mmain_back_menu_btn = findViewById(R.id.back_menu_btn);

        findViewById(R.id.activity_main_regiscoach_btn).setOnClickListener(this);

        db = FirebaseFirestore.getInstance();
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();

        mmain_back_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent myIntent = new Intent(RegisterCoach.this, MenuActivity.class);
                startActivity(myIntent);
            }
        });

    }
    private boolean validateInputs(String nom, String prenom, String club, String categorie, String telephone, String email) {

        if (nom.isEmpty()) {
            mmain_regisname_input.setError("Nom?");
            mmain_regisname_input.requestFocus();
            return true;
        }

        if (prenom.isEmpty()) {
            mmain_regisurname_input.setError("prenom?");
            mmain_regisurname_input.requestFocus();
            return true;
        }

        if (club.isEmpty()) {
            mmain_regisclub_input.setError("Club?");
            mmain_regisclub_input.requestFocus();
            return true;
        }

        if (categorie.isEmpty()) {
            mmain_regiscateg_input.setError("Categorie?");
            mmain_regiscateg_input.requestFocus();
            return true;
        }

        if (telephone.isEmpty()) {
            mmain_registel_input.setError("telephone?");
            mmain_registel_input.requestFocus();
            return true;
        }

        if (email.isEmpty()) {
            mmain_regismail_input.setError("email?");
            mmain_regismail_input.requestFocus();
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        String nom = mmain_regisname_input.getText().toString().trim();
        String prenom = mmain_regisurname_input.getText().toString().trim();
        String club = mmain_regisclub_input.getText().toString().trim();
        String categorie = mmain_regiscateg_input.getText().toString().trim();
        String telephone = mmain_registel_input.getText().toString().trim();
        String email = mmain_regismail_input.getText().toString().trim();


        if (!validateInputs(nom, prenom, club, categorie, telephone, email)) {

            CollectionReference dbCoachs = db.collection("coachs");

            Coach coach = new Coach(nom, prenom, club, categorie, telephone, email);

            dbCoachs.add(coach)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(RegisterCoach.this, "Coach inscrit", Toast.LENGTH_LONG).show();

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(RegisterCoach.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });

        }
    }
}