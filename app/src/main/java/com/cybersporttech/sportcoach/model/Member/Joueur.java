package com.cybersporttech.sportcoach.model.Member;

import com.cybersporttech.sportcoach.model.Club;

public class Joueur extends Membre {


    public Joueur(int ident, String nom, String prenom, Club club ,int telephone, String mail, int categorie,  String statut) {
        super(ident,nom, prenom, club, telephone, mail, categorie,  statut);
    }

    @Override
    public void lireUneConvocation() {
        System.out.println("Voici votre convocation");

    }
}
