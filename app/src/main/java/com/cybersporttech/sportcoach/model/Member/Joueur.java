package com.cybersporttech.sportcoach.model.Member;

import com.cybersporttech.sportcoach.model.Club;

public class Joueur extends Membre {


    public Joueur(Club club, String nom, String prenom, int telephone, int categorie, int equipeNumero, String mail, String statut) {
        super(club, nom, prenom, telephone, categorie, equipeNumero, mail, statut);
    }

    @Override
    public void lireUneConvocation() {
        System.out.println("Voici votre convocation");

    }
}
