package cards;

public class Player {
Hand playerHand;

String Name;
Double wallet;


public Player(){
	playerHand = new Hand();
}
public Hand getPlayerHand() {
	return playerHand;
}
public void setPlayerHand(Hand playerHand) {
	this.playerHand = playerHand;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Double getWallet() {
	return wallet;
}
public void setWallet(Double wallet) {
	this.wallet = wallet;
}

}
