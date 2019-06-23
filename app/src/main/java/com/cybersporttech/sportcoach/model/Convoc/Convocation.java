package com.cybersporttech.sportcoach.model.Convoc;


import com.cybersporttech.sportcoach.model.Club;
import com.cybersporttech.sportcoach.model.Member.Joueur;

import java.util.Date;

    public class Convocation {

        private Club club;
        private Lieu lieu;
        private Date date;
        private String evenement;
        private Joueur joueur;


        public Convocation(Club club, Lieu lieu, Date date, String evenement, Joueur joueur) {

            this.club = club;
            this.lieu = lieu;
            this.date = date;
            this.evenement = evenement;
            this.joueur = joueur;


        }

        public Club getClub() {
            return club;
        }

        public void setClub(Club club) {
            this.club = club;
        }

        public Lieu getLieu() {
            return lieu;
        }

        public void setLieu(Lieu lieu) {
            this.lieu = lieu;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getEvenement() {
            return evenement;
        }

        public void setEvenement(String evenement) {
            this.evenement = evenement;
        }

        public Joueur getJoueur() {
            return joueur;
        }
    }

