//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class MonsterRunner
{
	@SuppressWarnings("resource")
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		

		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");	
		int size=keyboard.nextInt();	
			
		Monster mOne = new Monster(name,size);

		System.out.print("Enter 2nd monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");	
		size=keyboard.nextInt();	
			
		Monster mTwo = new Monster(name, size);	

		if(mOne.isBigger(mTwo)==true)
		{
			System.out.println(mOne.getName()+" is bigger than "+mTwo.getName()+".");
		}
		else if(mOne.isSmaller(mTwo)==true)
		{
			System.out.println(mOne.getName()+" is smaller than "+ mTwo.getName()+".");
		}

		if(mOne.namesTheSame(mTwo)==true)
		{
			System.out.println(mOne.getName()+" has the same name as "+mTwo.getName()+"");
		}

		 

	}
}