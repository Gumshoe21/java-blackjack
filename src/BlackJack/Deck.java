package BlackJack;

import java.util.*;

public class Deck {
  public final List<Card> cards = new ArrayList<>();
  public final Map<Card.Rank, Integer> valueMap =
      new HashMap<>() {
        {
          put(Card.Rank.ACE, 1);
          put(Card.Rank.TWO, 2);
          put(Card.Rank.THREE, 3);
          put(Card.Rank.FOUR, 4);
          put(Card.Rank.FIVE, 5);
          put(Card.Rank.SIX, 6);
          put(Card.Rank.SEVEN, 7);
          put(Card.Rank.EIGHT, 8);
          put(Card.Rank.NINE, 9);
          put(Card.Rank.TEN, 10);
          put(Card.Rank.JACK, 10);
          put(Card.Rank.QUEEN, 10);
          put(Card.Rank.KING, 10);
        }
      };

  public Deck() {
    buildDeck();
  }

  public void buildDeck() {
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        cards.add(new Card(suit, rank));
      }
    }
    System.out.println(cards);
  }

  public void valueMap() {}
}
