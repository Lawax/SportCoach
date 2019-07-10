package com.cybersporttech.sportcoach.model.Convoc;


import java.util.Date;

public class Convocation {

    private String club;
    private int categorie;
    private String lieu;
    private Date date;
    private String listjoueurs;


    public Convocation(String club, int categorie, String lieu, Date date, String listjoueurs) {
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

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getListjoueurs() {
        return listjoueurs;
    }

    public void setListjoueurs(String listjoueurs) {
        this.listjoueurs = listjoueurs;
    }
}

