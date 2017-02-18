package cards;

import cards.Card;
import cards.Rank;
import cards.Suit;

public class Card {
	private Rank rank;
	private Suit suit;
	private int value;

	public Card(Rank r, Suit s, int c) {
		this.rank = r;
		this.suit = s;
		this.value = c;
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + ", value=" + value + "]";
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

}
