package com.atexo.jeucarte.controller;

import com.atexo.jeucarte.dtos.CarteJoueurDto;

import com.atexo.jeucarte.service.JeuServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = {"/api/v1/jeucarte"}, produces = APPLICATION_JSON_VALUE)
public class JeuController {

    private static final Logger logger = LoggerFactory.getLogger(JeuController.class);
    private static final String ENTRER_TIRER_MAIN_LOG = ">>>>>>>>>> JeuController.tirerMain()  lancement de tirage de main";
    private static final String SORTIR_TIRER_MAIN_LOG = "<<<<<<<<<< JeuController.tirerMain()  fin de tirage de main";

    private JeuServiceInterface jeuService;

    @Autowired
   public  JeuController(JeuServiceInterface jeuService){
       this.jeuService=jeuService;
   }

    public JeuController() {

    }

    @GetMapping("/carte")
    public ResponseEntity<CarteJoueurDto> tirerMain(){
        logger.info(ENTRER_TIRER_MAIN_LOG);
        CarteJoueurDto carteJoueurDto = jeuService.tirerMainAvecTrie();
        logger.info(SORTIR_TIRER_MAIN_LOG);
     return  ResponseEntity.status(HttpStatus.OK).body(carteJoueurDto);
    }

}
