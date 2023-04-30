package BlackJack;

import java.util.*;
// A deck has 52 cards:
// 4 Aces = 4
// 2-10 x 4 of Clubs, Diamonds, Hearts, Spades = 36
// 4 Jack
// 4 King
// 4 Queen

public class Deck {
  public final List<Card> cards = new ArrayList<>();

  public void buildDeck() {
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        cards.add(new Card(suit, rank));
      }
    }
    System.out.println(cards);
  }
}
