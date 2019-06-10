package com.cybersporttech.sportcoach.model;



public class Membre {

    public Membre(String nom, String prenom,int telephone, String sportPratique, String nomClub,
                  String categorie, int equipeNumero, String mail, String statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sportPratique = sportPratique;
        this.nomClub = nomClub;
        this.categorie = categorie;
        this.equipeNumero = equipeNumero;
        this.mail = mail;
        this.statut = statut;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getSportPratique() {
        return sportPratique;
    }

    public void setSportPratique(String sportPratique) {
        this.sportPratique = sportPratique;
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public int getequipeNumero (){
        return equipeNumero;
    }
    public void setequipeNumero (int equipeNumero){
        this.equipeNumero = equipeNumero ;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    private String nom;
    private String prenom;
    private int telephone;
    private String sportPratique;
    private String nomClub;
    private String categorie;
    private int equipeNumero;
    private String mail;
    private String statut;

}
