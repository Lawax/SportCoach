package com.cybersporttech.sportcoach.model.Member;


import com.cybersporttech.sportcoach.model.Club;


public abstract class Membre {


    private int ident;
    private String nom;
    private String prenom;
    private Club club;
    private int telephone;
    private String mail;
    private int categorie;
    private String statut;


    public Membre(int ident,String nom, String prenom, Club club,int telephone,String mail, int categorie, String statut) {

        this.ident= ident;
        this.nom = nom;
        this.prenom = prenom;
        this.club= club;
        this.telephone = telephone;
        this.mail = mail;
        this.categorie = categorie;
        this.statut = statut;
    }

    public int getIdent() {
        return ident;
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
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
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
    public void setCategorie (int categorie){
        this.categorie = categorie;
    }
    public int getCategorie() {
        return categorie;
    }

    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }






    public abstract void lireUneConvocation ();

    }





