package com.cybersporttech.sportcoach.model;


import java.util.Date;

    public class Convocation{

    private String nomClub;
    private int categorie;
    private Lieu lieu;
    private Date date;
    private String competition;


    public Convocation(String nomClub, int categorie, Lieu lieu, Date date, String competition) {
        this.nomClub = nomClub;
        this.categorie = categorie;
        this.lieu = lieu;
        this.date = date;
        this.competition = competition;
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public int getCategorie() {
        System.out.println("U" + categorie);
        return categorie;
    }

    public void setCategorie(int categorie) {
        System.out.println("U" + categorie);
        this.categorie = categorie;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

}
