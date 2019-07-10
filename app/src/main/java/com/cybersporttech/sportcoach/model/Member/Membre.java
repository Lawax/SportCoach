package com.cybersporttech.sportcoach.model.Member;



public class Membre {



    private String uid;
    private String nom;
    private String prenom;
    private String club;
    private int categorie;
    private int telephone;
    private String mail;
    private boolean isCoach;

    public Membre(String uid,String nom, String prenom, String club, int categorie, int telephone, String mail, boolean isCoach) {
        this.uid = uid;
        this.nom = nom;
        this.prenom = prenom;
        this.club = club;
        this.categorie = categorie;
        this.telephone = telephone;
        this.mail = mail;
        this.isCoach = false;
    }




    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isIsCoach() {
        return isCoach;
    }

    public void setIscoach(boolean isCoach) {
        this.isCoach = isCoach;
    }

    public void lireUneConvocation (){

    }

}





