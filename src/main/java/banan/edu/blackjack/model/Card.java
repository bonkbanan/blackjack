package banan.edu.blackjack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private Suit suit;
    private Denomination nominal;
    private int value;
    private String image;
}
