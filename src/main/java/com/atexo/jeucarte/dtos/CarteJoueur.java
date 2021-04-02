package com.atexo.jeucarte.dtos;

import com.atexo.jeucarte.model.Carte;

import java.util.List;

public class CarteJoueur {

    public List<Carte> carteAleatoire;

    public List<Carte> carteTrier;


    public CarteJoueur() {
    }

    public CarteJoueur( List<Carte> carteAleatoire,List<Carte> carteTrier) {
        this.carteTrier = carteTrier;
        this.carteAleatoire = carteAleatoire;
    }

    public List<Carte> getCarteTrier() {
        return carteTrier;
    }

    public void setCarteTrier(List<Carte> carteTrier) {
        this.carteTrier = carteTrier;
    }

    public List<Carte> getCarteAleatoire() {
        return carteAleatoire;
    }

    public void setCarteAleatoire(List<Carte> carteAleatoire) {
        this.carteAleatoire = carteAleatoire;
    }
}
