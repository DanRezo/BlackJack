package cards;

import java.util.Scanner;

public class House {
	public static void main(String[] args) throws InterruptedException {

		// Double wager;
		Scanner kb = new Scanner(System.in);
		Player player = new Player();
		player.setName(" ");
		Player dealer = new Player();
		dealer.setName("Dealer");
		Deck d = new Deck();
		d.shuffleDeck();
		boolean keepGoing = true;
		boolean playerKeepGoing = true;
		boolean dealerKeepGoing = true;

		System.out.println("****************************^*");
		System.out.println("***************************|Q|");
		System.out.println("****************************v*");
		System.out.println("* Welcome to Star City Casino*");
		System.out.println("******************************");
		System.out.println("*Take a seat and enjoy a game*");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("***Would you like to play: ***");
		System.out.println("******************************");
		System.out.println("********Black Jack?***********");
		System.out.println("******************************");
		System.out.println("******Press 'Y' or 'N'********");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("*^****************************");
		System.out.println("|K|***************************");
		System.out.println("*v****************************");
		String choice = kb.next();

		System.out.println("Welcome. What is your name?");
		String nm = kb.next();
		if (choice.equalsIgnoreCase("y")) {
			player.setName(nm);
			System.out.println("Salutaions for the Semi-Circle.");
			System.out.println("*********" + player.getName() + "*********");
			Thread.sleep(1800);
			System.out.println("Name of the game is BlackJack.");
			Thread.sleep(1650);
			System.out.println("Dealer hits on 16 and stays on 17.");
			Thread.sleep(1650);
			System.out.println("Ready?");
			Thread.sleep(1650);
			System.out.println("Here come the cards.");
			System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
			Thread.sleep(3000);

		}

		else {
			System.out.println("Thanks for visiting Star City Casino.");
		}

		d.deal(player);
		d.deal(dealer);
		d.deal(player);
		d.deal(dealer);

		showHand(player);
		System.out.println("Total " + player.getPlayerHand().getValueOfHand());
		System.out.println("*****************************");
		showHand(dealer);
		System.out.println("Total " + dealer.getPlayerHand().getValueOfHand());
		System.out.println("*****************************");
		if(player.getPlayerHand().getValueOfHand()==21 && dealer.getPlayerHand().getValueOfHand()!=21){
			System.out.println("BlackJack" + player.getName() + "Wins");
			keepGoing = false;
		}
		else if(player.getPlayerHand().getValueOfHand()!=21 && dealer.getPlayerHand().getValueOfHand()==21){
			System.out.println("BlackJack Dealer Wins!!");
			keepGoing = false;
		}
		else if(player.getPlayerHand().getValueOfHand()==21 && dealer.getPlayerHand().getValueOfHand()==21){
			System.out.println("Push");
			keepGoing = false;
		}
		
		while (keepGoing) {

			while (playerKeepGoing) {
				System.out.println("Do you want to hit or stay");
				String input = kb.next();
				if (input.equalsIgnoreCase("hit")) {
					System.out.println("*****************************");
					d.deal(player);
					showHand(player);
					System.out.println("Total " + player.getPlayerHand().getValueOfHand());
					System.out.println("*****************************");
					showHand(dealer);
					System.out.println("Total " + dealer.getPlayerHand().getValueOfHand());
					if (player.getPlayerHand().getValueOfHand() <= 21) {
						continue;
					}
					else {
						System.out.println("You busted! Dealer Wins.");
						playerKeepGoing = false;
						dealerKeepGoing = false;
					}

				} else {
					playerKeepGoing = false;
				}
			}
			while (dealerKeepGoing) {

				if (dealer.getPlayerHand().getValueOfHand() < 17) {
					d.deal(dealer);
					showHand(player);
					System.out.println("Total " + player.getPlayerHand().getValueOfHand());
					System.out.println("*****************************");
					showHand(dealer);
					System.out.println("Total " + dealer.getPlayerHand().getValueOfHand());
					System.out.println("*****************************");
				}
				else if (dealer.getPlayerHand().getValueOfHand() > 21) {
					System.out.println("Dealer BUST!");
				} else {
					checkForWinner(player, dealer);
					dealerKeepGoing = false;
				}
			}

			kb.close();

		}
	}

	public static void checkForWinner(Player player, Player dealer) {
		if (player.getPlayerHand().getValueOfHand() > dealer.getPlayerHand().getValueOfHand()) {
			System.out.println(player.getName() + " " + "Wins!");
		} else if (player.getPlayerHand().getValueOfHand() < dealer.getPlayerHand().getValueOfHand()) {
			System.out.println("Dealer Wins!");

		} else {
			System.out.println("PUSH!!!");

		}
	}

	public static void showHand(Player p) {
		for (Card c : p.getPlayerHand().getHand()) {
			System.out.println(p.getName() + " " + c.getRank() + " " + c.getSuit());
		}
	}
}
