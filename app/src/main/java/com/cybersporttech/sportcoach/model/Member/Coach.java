package com.cybersporttech.sportcoach.model.Member;

import com.cybersporttech.sportcoach.model.Club;

public class Coach extends Membre {

    public Coach(int ident , String nom, String prenom, Club club, int telephone, String mail, int categorie,  String statut) {
        super(ident, nom, prenom , club ,telephone,mail, categorie , statut );
    }

    @Override
    public void lireUneConvocation() {
        System.out.println("Voici votre convocation");
    }
    public void creerUneConvocation (){

    }
    public void modifierUneConvocation(){

    }
}

