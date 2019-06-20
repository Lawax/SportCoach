package com.cybersporttech.sportcoach.model.Convoc;


    public class Lieu {
    private int numero;
    private String rue;
    private int codepostal;


        public Lieu(int numero, String rue, int codepostal) {
            this.numero = numero;
            this.rue = rue;
            this.codepostal = codepostal;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getRue() {
            return rue;
        }

        public void setRue(String rue) {
            this.rue = rue;
        }

        public int getCodepostal() {
            return codepostal;
        }

        public void setCodepostal(int codepostal) {
            this.codepostal = codepostal;
        }
    }
