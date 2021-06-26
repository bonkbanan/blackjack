package banan.edu.blackjack.controler.ui;

import banan.edu.blackjack.model.Card;
import banan.edu.blackjack.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/card")
public class CardUIControler {
    @Autowired
    CardService service;

    @RequestMapping("/first")
    public String getFirstCard(Model model){
        Card firstCard = service.getFirstCard();
        model.addAttribute("firstcard",firstCard);
        return "gametable";
    }

    @RequestMapping("/empty")
    public String getEmptyCard(Model model){
        Card emptyCard = service.emptyCard();
        model.addAttribute("firstcard",emptyCard);
        return "gametable";
    }

    @RequestMapping("/next")
    public String getNextCard(Model model){
        Card card=service.getNextCard();
        model.addAttribute("firstcard",card);
        return "gametable";
    }
}
