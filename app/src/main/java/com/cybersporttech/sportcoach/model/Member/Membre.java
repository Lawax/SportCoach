package com.cybersporttech.sportcoach.model.Member;


import com.cybersporttech.sportcoach.model.Club;

import java.util.ArrayList;
import java.util.List;

public abstract class Membre {


    private Club club;
    private String nom;
    private String prenom;
    private int telephone;
    private int equipeNumero;
    private String mail;
    private String statut;


    public Membre(Club club,String nom, String prenom, int telephone, int categorie, int equipeNumero, String mail, String statut) {

        this.club= club;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.equipeNumero = equipeNumero;
        this.mail = mail;
        this.statut = statut;
    }

    public abstract void lireUneConvocation ();

    }





