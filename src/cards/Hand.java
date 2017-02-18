package cards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	int value = 0;
	List<Card> hand = new ArrayList<>();

	public void addCard(Card c) {
		hand.add(c);
	}

	public void showCards() {
		for (Card card : hand) {
			System.out.println(card);
		}
	}

	public void showOneCard () {
        for (int i = 0; i < hand.size(); i++) {
           System.out.println(hand.get(0));
        }
	}

	public int getValueOfHand() {
		value = 0;
		for (int i = 0; i < hand.size(); i++) {
			value = value + hand.get(i).getValue();
		}
		return value;

	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

}