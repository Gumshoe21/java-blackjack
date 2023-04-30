package BlackJack;

import BlackJack.Card.*;
import java.util.*;

public class Game {
  //  Deck deck = new Deck();
  int score = 0;

  public static void main(String[] args) {
    String allSuits = Card.getSuits();
    Deck deck = new Deck();
    deck.buildDeck();
    System.out.println(deck.cards);
  }
}

// Card
  // type: number,face,ace
  // values:
    // number = val of number
    // face = 10
    // ace = Either 1 or 11. It is counted as 11 (...generally) unless it would put you over 21, in
    // which case it counts as 1.
// Deck
// Player? might be represented by the person entering in the args

// hit, stand,

// Hand class Card[]
