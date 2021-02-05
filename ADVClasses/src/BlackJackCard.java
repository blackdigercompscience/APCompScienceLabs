//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//BlackJackCard extends Card

	//add in an instance variable for value

	//create a constructor that receives a suit and a face
	
	//make a getValue() method that returns the worth of the card
		//based on the rules of BlackJack
		//Ace is worth 11 for now
		//Jack, Queen, and King are all worth 10
		//all other cards are face value
		
	//make a toString method
		
public class BlackJackCard extends Card{
	int points;
	
	public BlackJackCard(String suit, int num) {
		super(suit, num);
		getPoints();
	}
	
	public int getPoints() {
		if(num == 1) {
			points = 11;
		} else if(num>=2&& num<=10) {
			points = num;
		}else if(num >=11&&num<=13) {
			points = 10;
		}
		return points;
	}
	
	public String toString() {
		return FACES[num]+" of "+ suit+" = "+points+" points";
	}
}