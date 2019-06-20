package com.cybersporttech.sportcoach.model;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private String sportPratique;
    private String nomDuClub;
    private List <Integer> categories= new ArrayList<Integer>();
    private String adresseClub;
    private String mailClub;

    public Club(String sportPratique, String nomDuClub, List<Integer> categories, String adresseClub, String mailClub) {
        this.sportPratique = sportPratique;
        this.nomDuClub = nomDuClub;
        this.categories = categories;
        this.adresseClub = adresseClub;
        this.mailClub = mailClub;
    }

    public String getSportPratique() {
        return sportPratique;
    }

    public void setSportPratique(String sportPratique) {
        this.sportPratique = sportPratique;
    }

    public String getNomDuClub() {
        return nomDuClub;
    }

    public void setNomDuClub(String nomDuClub) {
        this.nomDuClub = nomDuClub;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public String getAdresseClub() {
        return adresseClub;
    }

    public void setAdresseClub(String adresseClub) {
        this.adresseClub = adresseClub;
    }

    public String getMailClub() {
        return mailClub;
    }

    public void setMailClub(String mailClub) {
        this.mailClub = mailClub;
    }
}

