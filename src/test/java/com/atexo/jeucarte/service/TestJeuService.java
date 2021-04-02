package com.atexo.jeucarte.service;

import com.atexo.jeucarte.dtos.CarteJoueurDto;
import com.atexo.jeucarte.model.Carte;
import com.atexo.jeucarte.model.Couleur;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestJeuService {

    @InjectMocks
    JeuServiceInterface jeuService =new JeuService();;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void tirer_Main_Avec_Trier_Longueur_OK(){
        CarteJoueurDto carteJoueurdto = jeuService.tirerMainAvecTrie();
        assertEquals(10,carteJoueurdto.getCarteAleatoire().size());
        assertEquals(10,carteJoueurdto.getCarteTrier().size());
    }

    @Test
    public void tirer_Main_Longueur_OK(){
        List<Carte> cartesAleatoire= jeuService.tirerMain();
        assertEquals(10,cartesAleatoire.size());
    }
    @Test
    public void trier_Main_OK(){
        List<Carte> carteAleatoire = new ArrayList<>();

        Carte carte1 = new Carte(2, Couleur.COEUR);
        Carte carte2 = new Carte(11, Couleur.CARREAUX);
        Carte carte3 = new Carte(5, Couleur.PIQUE);
        Carte carte4 = new Carte(12, Couleur.CARREAUX);
        Carte carte5 = new Carte(2, Couleur.TREFFLE);
        Carte carte6 = new Carte(9, Couleur.TREFFLE);
        Carte carte7 = new Carte(7, Couleur.COEUR);
        Carte carte8 = new Carte(7, Couleur.CARREAUX);
        Carte carte9 = new Carte(9, Couleur.PIQUE);
        Carte carte10 = new Carte(5, Couleur.TREFFLE);
        carteAleatoire.add(carte1);
        carteAleatoire.add(carte2);
        carteAleatoire.add(carte3);
        carteAleatoire.add(carte4);
        carteAleatoire.add(carte5);
        carteAleatoire.add(carte6);
        carteAleatoire.add(carte7);
        carteAleatoire.add(carte8);
        carteAleatoire.add(carte9);
        carteAleatoire.add(carte10);
        List<Carte> cartesTrie= jeuService.trier(carteAleatoire);
        assertEquals(10,cartesTrie.size());
        assertEquals(Couleur.CARREAUX,cartesTrie.get(0).getCouleur());
        assertEquals(7,cartesTrie.get(0).getValeur());
        assertEquals(Couleur.CARREAUX,cartesTrie.get(2).getCouleur());
        assertEquals(12,cartesTrie.get(2).getValeur());
        assertEquals("Valet",cartesTrie.get(2).getNomDeCarte());
        assertEquals(Couleur.TREFFLE,cartesTrie.get(9).getCouleur());
        assertEquals(9,cartesTrie.get(9).getValeur());
    }
}
