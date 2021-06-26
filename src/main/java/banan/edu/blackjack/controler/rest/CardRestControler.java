package banan.edu.blackjack.controler.rest;

import banan.edu.blackjack.model.Card;
import banan.edu.blackjack.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/card")
public class CardRestControler {
    @Autowired
    CardService service;

    @RequestMapping("/first")
    public Card getFirst(){return service.getFirstCard();}
}
