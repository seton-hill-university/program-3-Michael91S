import java.util.Scanner;

//	Application:		program 3  
//	Name:				Michael Spain			
//	GitHub User:        Micahel91S
//	Date:				Sep 29, 2022
//	Version:			1.0
//	Description:	pre test post test and counter loops	
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
{Scanner keyboard = new Scanner(System.in); 
		
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		//Get the input from user
		System.out.println("Name here");
		String name = keyboard.next();
		System.out.println("Pick a number between 1 & 100");
		int number = keyboard.nextInt();
		
		while (number > 0 & number < 100)
		{
			System.out.println("Thanks for the input," + name);
			for (int Countdown = number; Countdown>0; Countdown--)
			{
			System.out.println("The remainder is " + Countdown);
			}
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			break;
			 }

		if(number < 0 || number > 100)
		{
			System.out.println("Number not valid enter a valid number");
		}
			int number2 = keyboard.nextInt();
			for(int Countdowntwo = number2; Countdowntwo>0; Countdowntwo--)
			{
				System.out.println(" A remainder of " + Countdowntwo);
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			}

		}
	}

		

	}


