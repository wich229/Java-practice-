//used to get user input
import java.util.Scanner;


public class ProgrammingAssignment1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//Part 1
		// give data type
		int num1;
		int num2;
		int num3;
		int num4;
		int numsProduct;
		int numsAverage;
		
		
		//get input integers
//		System.out.println("num1: ");
	    num1 = scnr.nextInt();
	    
//	    System.out.println("num2: ");
	    num2 = scnr.nextInt();
	    
//	    System.out.println("num3: ");
	    num3 = scnr.nextInt();
	    
//	    System.out.println("num4: ");
	    num4 = scnr.nextInt();
	    
	    //their multiplied
	    numsProduct = num1 * num2 * num3 * num4;
	    
	    //their average
	    numsAverage = (num1 + num2 + num3 + num4) / 4;
	    
	    //output
	    System.out.println(numsProduct + " " + numsAverage);
	    
	    //Part 2
	    double numsProduct2;
	    double numsAverage2;
	    
	    // covert data type
	    numsProduct2 = (double)num1 * num2 * num3 * num4;
	    numsAverage2 = (double)(num1 + num2 + num3 + num4) / 4;
	    
//	    System.out.printf("%.3f %.3f \n", numsProduct2,numsAverage2);
	    System.out.printf("%.3f", numsProduct2);
	    System.out.print(" ");
	    System.out.printf("%.3f", numsAverage2);
	    System.out.println();
	}

}
