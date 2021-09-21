import java.util.Scanner;

public class PlayerRoster {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner( System.in );
		int []jerseyNum;
		int []playerRate;
		final int PLAYERNUMBERS = 5;
		boolean keepAlive = true;
		char choice;
		
		// Prompt the user to input five pairs of numbers
		jerseyNum = new int[PLAYERNUMBERS];
		playerRate = new int[PLAYERNUMBERS];

		for(int i = 0 ; i < PLAYERNUMBERS ; i++ ) {
			System.out.println("Enter player " + (i+1) + "'s jersey number:");
			jerseyNum [i] = scnr.nextInt();
			System.out.println("Enter player " + (i+1) + "'s rating:");
			playerRate [i] = scnr.nextInt();
			System.out.println();
		}
		
		System.out.println("ROSTER");
		for(int i = 0 ; i < PLAYERNUMBERS ; i++ ) {
			System.out.println( "Player " + (i+1) +" -- Jersey number: " + jerseyNum [i] +", Rating: " + playerRate [i]);
		}
//		System.out.println();
		
		// Implement a menu of options for a user to modify the roster. 
		printMenu();
		choice = scnr.next().charAt(0);
		while(keepAlive) {
			switch (choice) {
				case 'q':
					System.exit(0);
					break;
				/**Implement the "Update player rating" menu option. Prompt the user for a 
				 * player's jersey number. Prompt again for a new rating for the player, 
				 * and then change that player's rating.
				 **/	
				case 'u':
					System.out.println("Enter a jersey number:");
					int beUpdatePlayerNum = scnr.nextInt();
					System.out.println("Enter a new rating for player:");
					int beUpdateRate = scnr.nextInt();
					updateRate(playerRate, jerseyNum, beUpdatePlayerNum ,beUpdateRate);
					printMenu();
					choice = scnr.next().charAt(0);
					break;
				/**Implement the "Output players above a rating" menu option. Prompt the 
				 * user for a rating. Print the jersey number and rating for all players 
				 * with ratings above the entered value. 
				 **/
				case 'a':
					System.out.println("Enter a rating:");
					int beSearchRate = scnr.nextInt();
					System.out.println("ABOVE "+ beSearchRate);
					searchAbove(playerRate, jerseyNum, beSearchRate);	
					printMenu();
					choice = scnr.next().charAt(0);
					break;
				/**Implement the "Replace player" menu option. Prompt the user for the 
				 * jersey number of the player to replace. If the player is in the roster, 
				 * then prompt again for a new jersey number and rating. Update the replaced player's jersey number and rating. 
				 **/
				case 'r':
					System.out.println("Enter a jersey number:");
					int beRP_Num = scnr.nextInt();
					for (int i = 0; i < jerseyNum.length; ++i) {
						if(jerseyNum[i]==beRP_Num){
							System.out.println("Enter a new jersey number:");
							int newNum = scnr.nextInt();
							System.out.println("Enter a rating for the new player:");
							int newRate = scnr.nextInt();
							changeData(playerRate, jerseyNum, beRP_Num, newNum, newRate);	
						}
					}
					printMenu();
					choice = scnr.next().charAt(0);
					break;
				//Implement the "Output roster" menu option
				case 'o':
					System.out.println("ROSTER");
					for(int i = 0 ; i < PLAYERNUMBERS ; i++ ) {
						System.out.println( "Player " + (i+1) +" -- Jersey number: " + 
											jerseyNum [i] +", Rating: " + playerRate [i]);
					}
					printMenu();
					choice = scnr.next().charAt(0);
					break;
				default:
					keepAlive = false;
					break;
			}
		}

	}
	
	public static void printMenu(){

		  System.out.println("\nMENU");
	      System.out.println("u - Update player rating");
	      System.out.println("a - Output players above a rating");
	      System.out.println("r - Replace player");
	      System.out.println("o - Output roster");
	      System.out.println("q - Quit\n");
	      System.out.println("Choose an option:");
	      
	}
	
	public static void updateRate(int [] rateArr, int [] playerArr, int num ,int newRate) {
		for (int i = 0; i < playerArr.length; ++i) {
			if (playerArr[i] == num) {
				rateArr[i] = newRate;
			}
		}
	}
	
	public static void searchAbove(int [] rateArr, int [] playerArr, int rate) {
		
	      for (int i = 0; i < rateArr.length; ++i) {
	         if (rateArr[i] > rate) {
	        	 System.out.println( "Player " + (i+1) +" -- Jersey number: " + 
	        			 			 playerArr [i] +", Rating: " + rateArr [i]);
	         }
	      }     
	}
	
	public static void changeData(int [] rateArr, int [] playerArr, int num, int newNum ,int newRate) {
		for (int i = 0; i < playerArr.length; ++i) {
			if (playerArr[i] == num) {
				playerArr[i] = newNum;
				rateArr[i] = newRate;
			}
		}
	}
	
}
