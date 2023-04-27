package BlackJack;

import java.util.*;
// A deck has 52 cards:
// 4 Aces = 4
// 2-10 x 4 of Clubs, Diamonds, Hearts, Spades = 36
// 4 Jack
// 4 King
// 4 Queen

public class Deck {
  public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES
  };

  public static void main(String args[]) {
    Set<Suit> suits = EnumSet.allOf(Suit.class);
    System.out.println(suits);
  }
}
