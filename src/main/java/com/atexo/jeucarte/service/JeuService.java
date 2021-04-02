package com.atexo.jeucarte.service;

import com.atexo.jeucarte.dtos.CarteJoueurDto;
import com.atexo.jeucarte.dtos.CarteMapper;
import com.atexo.jeucarte.model.Carte;
import com.atexo.jeucarte.model.Couleur;
import org.mapstruct.factory.Mappers;
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
    private CarteMapper carteMapper = Mappers.getMapper(CarteMapper.class);

    public JeuService(){
        jeuxDesCartes = new ArrayList<>();
    }
    @Override
    public  List<Carte> tirerMain() {

        creerJeuDeCarte ();
        Collections.shuffle (jeuxDesCartes );
        return  jeuxDesCartes.subList(0,10);
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

 public CarteJoueurDto tirerMainAvecTrie(){
     CarteJoueurDto carteJoueurDto =new CarteJoueurDto();
     List<Carte> mainTirer= tirerMain();
     carteJoueurDto.setCarteAleatoire(carteMapper.map(mainTirer));
     carteJoueurDto.setCarteTrier(carteMapper.map(mainTirer));
     return carteJoueurDto;
 }
}
