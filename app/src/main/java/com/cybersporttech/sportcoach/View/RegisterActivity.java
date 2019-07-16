package com.cybersporttech.sportcoach.View;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import com.cybersporttech.sportcoach.model.Member.Membre;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.cybersporttech.sportcoach.R;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;




public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    // Realtime db FirebaseDatabase database = FirebaseDatabase.getInstance();
    //Realtime db DatabaseReference myRef = database.getReference("message");


    private EditText mmain_regismail_input;
    private EditText mmain_regisnameplayer_input;
    private EditText mmain_regisurname_input;
    private EditText mmain_regisclub_input;
    private EditText mmain_regiscateg_input;
    private EditText mmain_registel_input;
    private Button mmain_regisplayer_btn;
    private Button mmain_regiscoach_btn;


    private FirebaseFirestore db;

    // Creating identifier to identify REST REQUEST (Update username)
    //private static final int UPDATE_USERNAME = 30;

    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mmain_regismail_input = findViewById(R.id.activity_regis_mail);
        mmain_regisnameplayer_input = findViewById(R.id.activity_main_regisnameplayer_input);
        mmain_regisurname_input = findViewById(R.id.activity_main_regisurname_input);
        mmain_regisclub_input = findViewById(R.id.activity_main_regisclub_input);
        mmain_regiscateg_input = findViewById(R.id.activity_main_regiscateg_input);
        mmain_registel_input = findViewById(R.id.activity_main_registel_input);
        mmain_regisplayer_btn = findViewById(R.id.activity_main_regisplayer_btn);
        mmain_regiscoach_btn = findViewById(R.id.activity_main_regiscoach_btn);

        findViewById(R.id.activity_main_regisplayer_btn).setOnClickListener(this);

        //mmain_regismail_input.setText(getIntent().getExtras().getString("data"));

        db = FirebaseFirestore.getInstance();
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        //setMessage();
    }
        private boolean validateInputs(String nom, String prenom, String club) {

            if (nom.isEmpty()) {
                mmain_regisnameplayer_input.setError("Nom?");
                mmain_regisnameplayer_input.requestFocus();
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
            return false;
        }

    @Override
    public void onClick(View v) {
        String nom = mmain_regisnameplayer_input.getText().toString().trim();
        String prenom = mmain_regisurname_input.getText().toString().trim();
        String club = mmain_regisclub_input.getText().toString().trim();
        String categorie = mmain_regiscateg_input.getText().toString().trim();
        String telephone= mmain_registel_input.getText().toString().trim();


        if (!validateInputs(nom,prenom,club)) {

            CollectionReference dbMembres = db.collection("membres");

            Membre membre = new Membre(nom,prenom,club,categorie,telephone);

            dbMembres.add(membre)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(RegisterActivity.this, "Product Added", Toast.LENGTH_LONG).show();

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(RegisterActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });


        }


    }
}



