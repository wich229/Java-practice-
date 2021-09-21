import java.util.Scanner;

public class TestAverager {

	public static void main(String[] args) 
	{
		
		//variable;
		int test1;  // input test 1 score
		int test2;  // test 2 score
		int test3;  // test 3 score
		
		double avg; // calculated average
		
		//instantiate an object of Scanner;
		Scanner scan = new Scanner(System.in);
		
		//print the user for test scores
		System.out.print("Enter test test 1 score: ");
		test1 = scan.nextInt();
		
		System.out.print("Enter test test 2 score: ");
		test2 = scan.nextInt();
		
		System.out.print("Enter test test 3 score: ");
		test3 = scan.nextInt();
		
		//calculate the average
		avg = (double)( test1 + test2 + test3 ) / 3;
		
		//display the output
		System.out.printf("The average = %.1f", avg);

	}

}
