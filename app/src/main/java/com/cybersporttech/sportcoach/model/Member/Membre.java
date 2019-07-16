package com.cybersporttech.sportcoach.model.Member;


public class Membre {




    private String nom;
    private String prenom;
    private String club;
    private String categorie;
    private String telephone;











    public Membre(String nom, String prenom, String club, String categorie, String telephone) {

        this.nom = nom;
        this.prenom = prenom;
        this.club = club;
        this.categorie = categorie;
        this.telephone = telephone;

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public void lireUneConvocation (){

    }

}





