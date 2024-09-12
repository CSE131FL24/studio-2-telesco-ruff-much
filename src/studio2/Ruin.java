package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int wins = 0;
		int losses = 0;
		
		System.out.print("Money Ammount: ");
		int startAmmount = in.nextInt();
		System.out.print("Number of days played: ");
		int totalSimulations = in.nextInt();

		int winLimit = startAmmount;
		for(int i = 0; i < totalSimulations; i++) 
		{
			winLimit = startAmmount;
			while (winLimit > 0 && winLimit < 2 * startAmmount) {
				if (Math.random() * 10 < 5) {
					winLimit--;
				}  
				else 
				{
					winLimit ++;

				}


			}
			if(winLimit == 0) {
			losses ++;
			}
			if(winLimit == startAmmount * 2)
			{
				wins ++;
			}
			
		}
		System.out.println("Losses: " + losses + " Wins: " + wins + " Simulations: " + totalSimulations);
		double expectedRuinRate = 1 - (startAmmount / (2.0*startAmmount));
		System.out.println(expectedRuinRate);
		
		
	}
}
