package com.cybersporttech.sportcoach.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cybersporttech.sportcoach.R;



public class ReadConvocationActivity extends AppCompatActivity {


    private TextView sportPratiqueResp;
    private TextView nomDeClubResp;
    private TextView categorieResp;
    private TextView lieuResp;
    private TextView dateHeureResp;
    private TextView evenementResp;
    private TextView listeJoueursResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_convocation);

        sportPratiqueResp = findViewById(R.id.sportPratique_txtR);
        nomDeClubResp = findViewById(R.id.nomduClub_txtR);
        categorieResp = findViewById(R.id.categories_txtR);
        lieuResp = findViewById(R.id.lieu_txtR);
        dateHeureResp = findViewById(R.id.date_txtR);
        evenementResp = findViewById(R.id.evenement_txtR);
        listeJoueursResp = findViewById(R.id.ListeJoueurs_txtR);
    }
    public TextView getSportPratiqueResp() {
        return sportPratiqueResp;
    }

    public void setSportPratiqueResp(TextView sportPratiqueResp) {
        this.sportPratiqueResp = sportPratiqueResp;
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

    public TextView getEvenementResp() {
        return evenementResp;
    }

    public void setEvenementResp(TextView evenementResp) {
        this.evenementResp = evenementResp;
    }

    public TextView getListeJoueursResp() {
        return listeJoueursResp;
    }

    public void setListeJoueursResp(TextView listeJoueursResp) {
        this.listeJoueursResp = listeJoueursResp;
    }


}

