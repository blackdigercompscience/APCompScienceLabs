//(c) A+ Computer Science
//www.apluscompsci.com

//Player Runner 

public class PlayerRunner
{
	public static void main(String[] args)
	{
		Player s = new Player("Michael Jackson", "rock");

		System.out.println(s.getChoice());			//outs rock
		//call the getName() method 					//outs Michael Jackson
		System.out.println(s.getName());								//outs Michael Jackson rock
		
		//set the choice to paper
		s.setChoice("paper");
		System.out.println(s.getChoice());								//outs Michael Jackson paper	
		
		//instantiate a new Player named jb named Jim Bob that chose scissors
		Player jb = new Player("Jim bob", "scissors");
		System.out.println(jb.getChoice());
		//print out Jim Bob	
	}
}





