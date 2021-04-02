package com.atexo.jeucarte.dtos;


import java.util.List;

public class CarteJoueurDto {

    private List<CarteDto> carteAleatoire;

    private List<CarteDto> carteTrier;


    public CarteJoueurDto() {
    }

    public CarteJoueurDto(List<CarteDto> carteAleatoire, List<CarteDto> carteTrier) {
        this.carteTrier = carteTrier;
        this.carteAleatoire = carteAleatoire;
    }

    public List<CarteDto> getCarteTrier() {
        return carteTrier;
    }

    public void setCarteTrier(List<CarteDto> carteTrier) {
        this.carteTrier = carteTrier;
    }

    public List<CarteDto> getCarteAleatoire() {
        return carteAleatoire;
    }

    public void setCarteAleatoire(List<CarteDto> carteAleatoire) {
        this.carteAleatoire = carteAleatoire;
    }
}
