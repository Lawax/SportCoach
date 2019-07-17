package com.cybersporttech.sportcoach.model.Convoc;


import java.util.Date;

public class Convocation {

    private String club;
    private String categorie;
    private String lieu;
    private String date;
    private String listjoueurs;


    public Convocation(String club, String categorie, String lieu, String date, String listjoueurs) {
        this.club = club;
        this.categorie = categorie;
        this.lieu = lieu;
        this.date = date;
        this.listjoueurs = listjoueurs;
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

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getListjoueurs() {
        return listjoueurs;
    }

    public void setListjoueurs(String listjoueurs) {
        this.listjoueurs = listjoueurs;
    }
}

