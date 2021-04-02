package com.atexo.jeucarte.service;

import com.atexo.jeucarte.dtos.CarteJoueurDto;
import com.atexo.jeucarte.model.Carte;

import java.util.List;

public interface JeuServiceInterface {
    List<Carte> tirerMain();
    List<Carte> trier(List<Carte> jeuxCarteADistibuer);
    CarteJoueurDto tirerMainAvecTrie();
}
