# BlackJack
This Java program will simulate game of BlackJack.
There are nine (9) classes that make up the program.
StarCityCasino.java will run the game.

## Welcome to StarCity Casino.

## Stories
User Story #1
Create a class structure that mimics a deck of cards. Remember decks as well as a hand of cards are made up of cards. Feel free to create the structure in any way you see fit. hint We did a lab in Chapter 6 of this week that dealt with a deck of cards.

User Story #2
Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck! You should be able to print out a shuffled deck to the terminal.

User Story #3
Deal two hands of cards one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the wiki. Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

User Story #4
Implement the remaining rules of blackjack so you can determine a winner of each round.

## Instructions
#### Please read the house rules.
1. Welcome to StarCity Blackjack
2. Please enter your name so the Dealer can properly address you.
3. The Dealer will hit if his total is less than 16.
4. If the Dealer's total is more than or equal to 17 the Dealer will stay.
5. The game begins with two cards being dealt to the Player and Dealer
6. Player will be asked to stay or hit.
7. If Player's card total is greater than 21, Player busts.
8. Once Player's turn is over Dealer will play.
9. If Dealer's card total is greater than 21, Player busts.
10. If Either Player or Dealer is dealt BlackJack(21) on initial deal, game ends.
11. In the case of a tie, game is considered a "push".

## Example
```
package cards;

public class StarCityCasino {
	public static void main(String[] args) throws InterruptedException {
		House houseFloor = new House();
		houseFloor.startGame();
		
	}
}

```
#### Breakdown
This was the first projecte which I only called on a method to run the project.
```
public static void showHand(Player p) {
		for (Card c : p.getPlayerHand().getHand()) {
			System.out.println(p.getName() + " " + c.getRank() + " " + c.getSuit());
		}
	}

```
#### Breakdown
Showing the player's hand was done by iterating over the cards in the hand and then printing our the name, rank and suit.


## Reflection
This week three project tested my ability to work with multiple classes and getting comfortable building classes in an Object Oriented manner. I was able to build classes whose fields are Objects,practice writing methods,use collection types to organize and manage dataand
use conditionals to create game logic. I had a lot of fun with this project.



