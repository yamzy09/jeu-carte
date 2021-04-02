package com.atexo.jeucarte.dtos;

import com.atexo.jeucarte.model.Couleur;

public class CarteDto {
    private String nomDeCarte;
    private Couleur couleur;

    public CarteDto() {
    }

    public CarteDto(String nomDeCarte, Couleur couleur) {
        this.nomDeCarte = nomDeCarte;
        this.couleur = couleur;
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
}
