package BlackJack;

public class Card {
  public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES
  };

  public enum Rank {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE
  }

  private final Suit suit;
  private final Rank rank;

  // Overloaded constructor for the Card class.
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public Rank getRank() {
    return this.rank;
  }
  // @Override annotation is used to indicate that the declared toString() method is intended to
  // override a method with the same signature in a superclass. In this case, it's overriding the
  // toString() method of the Object class, which is the superclass of all classes in Java.
  @Override
  public String toString() {
    return this.rank + " of " + this.suit;
  }
}
