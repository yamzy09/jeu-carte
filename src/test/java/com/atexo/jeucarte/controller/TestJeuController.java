package com.atexo.jeucarte.controller;


import com.atexo.jeucarte.dtos.CarteDto;
import com.atexo.jeucarte.dtos.CarteJoueurDto;
import com.atexo.jeucarte.model.Carte;
import com.atexo.jeucarte.model.Couleur;
import com.atexo.jeucarte.service.JeuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)

@WebMvcTest(JeuController.class)
public class TestJeuController {
    @MockBean
    JeuService JeuService;
    @Autowired
    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new JeuController()).build();

   @Test
    public void jeu_Controller_OK() throws Exception {
       CarteDto carte1 = new CarteDto("2", Couleur.COEUR);
       CarteDto carte2 = new CarteDto("3", Couleur.CARREAUX);
       CarteDto carte3 = new CarteDto("5", Couleur.PIQUE);
       List<CarteDto> cartes = new ArrayList<>();
       cartes.add(carte1);
       cartes.add(carte2);
       cartes.add(carte3);
      CarteJoueurDto carteJoueurDto= new CarteJoueurDto();
       carteJoueurDto.setCarteAleatoire(cartes);
       carteJoueurDto.setCarteAleatoire(cartes);
        given(JeuService.tirerMainAvecTrie())
                .willReturn(carteJoueurDto);
        this.mockMvc.perform(get("/api/v1/jeucarte/carte")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
    }
