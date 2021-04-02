package com.atexo.jeucarte.service;

import com.atexo.jeucarte.dtos.CarteJoueur;
import com.atexo.jeucarte.model.Carte;
import com.atexo.jeucarte.model.Couleur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JeuService implements  JeuServiceInterface {
    private static final int NOMBRE_CARTE_PAR_COULEUR = 12;
    private List<Carte> jeuxDesCartes;

    public JeuService(){
        jeuxDesCartes = new ArrayList<>();
    }
    @Override
    public  List<Carte> tirerMain() {

        creerJeuDeCarte ();
        Collections.shuffle (jeuxDesCartes );
        List<Carte> jeuxCarteADistibuer=jeuxDesCartes.subList(0,10);
        return  jeuxCarteADistibuer;
    }

    public  List<Carte> trier(List<Carte> jeuxCarteADistibuer) {
        Comparator<Carte> compareByName = Comparator
                .comparing(Carte::getCouleur)
                .thenComparing(Carte::getValeur);
        return jeuxCarteADistibuer.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());
    }

    private void creerJeuDeCarte () {
        for ( Couleur couleur : Couleur.values () ) {
            for ( int i = 1; i <= NOMBRE_CARTE_PAR_COULEUR  ; ++i ) {
                jeuxDesCartes.add ( new Carte ( i, couleur ) );
            }
        }
    }

 public CarteJoueur tirerMainAvecTrie(){
     CarteJoueur carteJoueur =new CarteJoueur ();
    List<Carte> mainTirer= tirerMain();
     carteJoueur.setCarteAleatoire(mainTirer);
     carteJoueur.setCarteTrier(trier(mainTirer));
     return carteJoueur;
 }
}
