package com.atexo.jeucarte.model;

import java.util.Comparator;

public class Carte implements Comparator<Carte> {
    private int valeur;
    private String nomDeCarte;
    private Couleur couleur;

    public Carte(int valeur, Couleur couleur) {
        this.valeur = valeur;
        definirNomCarte(valeur);
        this.couleur = couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public String getNomDeCarte() {
        return nomDeCarte;
    }

    public void setNomDeCarte(String nomDeCarte) {
        this.nomDeCarte = nomDeCarte;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }


    @Override
    public  int compare(Carte premierCarte, Carte deuxiemeCarte) {
       return premierCarte.couleur.getValeur() - deuxiemeCarte.couleur.getValeur();
    }

    public  void  definirNomCarte(int valeur ){
        switch (valeur) {
            case 1:
                this.setNomDeCarte("AS");
                break;
            case 10:
                this.setNomDeCarte("Dame");
                break;
            case 11:
                this.setNomDeCarte("Roi");
                break;
            case 12:
                this.setNomDeCarte("Valet");
                break;
            default:
                this.setNomDeCarte(Integer.toString(valeur));
        }
    }
}
