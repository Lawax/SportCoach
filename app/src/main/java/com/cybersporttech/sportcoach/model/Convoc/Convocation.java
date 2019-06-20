package com.cybersporttech.sportcoach.model.Convoc;


import com.cybersporttech.sportcoach.model.Club;

import java.util.Date;

    public class Convocation{

        private Club club;
        private Lieu lieu;
        private Date date;
        private String evenement;


            public Convocation( Club club, Lieu lieu, Date date, String evenement) {

                this.club=club;
                this.lieu = lieu;
                this.date = date;
                this.evenement = evenement;


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
    }

