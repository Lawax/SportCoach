package com.cybersporttech.sportcoach.model.Joueur;

public class Joueur {
    private String nom;
    private String prenom;
    private String club;
    private String categorie;
    private String telephone;
    private String email;




    public Joueur(String nom, String prenom, String club, String categorie, String telephone, String email) {

        this.nom = nom;
        this.prenom = prenom;
        this.club = club;
        this.categorie = categorie;
        this.telephone = telephone;
        this.email= email;


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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
