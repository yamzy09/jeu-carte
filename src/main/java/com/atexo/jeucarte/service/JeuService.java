package com.atexo.jeucarte.service;

import com.atexo.jeucarte.model.Carte;
import com.atexo.jeucarte.model.Couleur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class JeuService implements  JeuServiceInterface {
    private static final int NOMBRE_CARTE_PAR_COULEUR = 13;
    private List<Carte> jeuxDesCartes;

    public JeuService(){
        jeuxDesCartes = new ArrayList<>();
    }
    @Override
    public  List<Carte> tirerMain() {

        creerJeuDeCarte ();
        Collections.shuffle (jeuxDesCartes );
        List<Carte> jeuxCarteADistibuer=jeuxDesCartes.subList(0,9);
        return  jeuxCarteADistibuer;
    }
    private void creerJeuDeCarte () {
        for ( Couleur couleur : Couleur.values () ) {
            for ( int i = 1; i <= NOMBRE_CARTE_PAR_COULEUR  ; ++i ) {
                jeuxDesCartes.add ( new Carte ( i, couleur ) );
            }
        }
    }

}
