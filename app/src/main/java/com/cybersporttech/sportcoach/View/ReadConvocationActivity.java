package com.cybersporttech.sportcoach.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;


import com.cybersporttech.sportcoach.R;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.auth.User;


public class ReadConvocationActivity extends AppCompatActivity {


    private TextView nomDeClubResp;
    private TextView categorieResp;
    private TextView lieuResp;
    private TextView dateHeureResp;
    private TextView listeJoueursResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_convocation);

        nomDeClubResp = findViewById(R.id.nomduClub_txtR);
        categorieResp = findViewById(R.id.categories_txtR);
        lieuResp = findViewById(R.id.lieu_txtR);
        dateHeureResp = findViewById(R.id.date_txtR);
        listeJoueursResp = findViewById(R.id.ListeJoueurs_txtR);
    }

    public TextView getNomDeClubResp() {
        return nomDeClubResp;
    }

    public void setNomDeClubResp(TextView nomDeClubResp) {
        this.nomDeClubResp = nomDeClubResp;
    }

    public TextView getCategorieResp() {
        return categorieResp;
    }

    public void setCategorieResp(TextView categorieResp) {
        this.categorieResp = categorieResp;
    }

    public TextView getLieuResp() {
        return lieuResp;
    }

    public void setLieuResp(TextView lieuResp) {
        this.lieuResp = lieuResp;
    }

    public TextView getDateHeureResp() {
        return dateHeureResp;
    }

    public void setDateHeureResp(TextView dateHeureResp) {
        this.dateHeureResp = dateHeureResp;
    }

    public TextView getListeJoueursResp() {
        return listeJoueursResp;
    }

    public void setListeJoueursResp(TextView listeJoueursResp) {
        this.listeJoueursResp = listeJoueursResp;
    }

}

