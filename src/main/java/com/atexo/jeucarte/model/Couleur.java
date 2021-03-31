package com.atexo.jeucarte.model;

public enum Couleur {
    CARREAUX ( 0 ),
    COEUR ( 1 ),
    PIQUE ( 2 ),
    TREFFLE ( 3 );

    private int valeur;

    Couleur(int valeur) {
        this.valeur=valeur;
    }

    public int getValeur() {
        return valeur;
    }
}
