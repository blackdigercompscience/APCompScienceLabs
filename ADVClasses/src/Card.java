//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	String suit;
	int num;
	
	public Card(String suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void setSuit(String suit) {
		this.suit =suit;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getSuit() {
		return suit;
	}
	public int getNum() {
		return num;
	}
	
	public String toString() {
		return FACES[num]+" of "+suit;
	}

 }