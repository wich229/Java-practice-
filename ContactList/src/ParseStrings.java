import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;  
      String userInput;
      String firstWord;
      String secWord;
      String q;

        // Prompt the user for a string that contains two strings separated by a comma.
        //Error: No comma in string.
        System.out.println("Enter input string:");
        userInput = scnr.nextLine();
        
        while(userInput.indexOf(',') == -1 && userInput.equals("q")== false){

           System.out.println("Error: No comma in string.\n");
           System.out.println("Enter input string:");
           userInput = scnr.nextLine();
        }
        
        //Extract the two words from the input string and remove any spaces.
        
        while(userInput.indexOf(',') != -1 || userInput.equals("q")) {
            
	       if (userInput.equals("q")){
	      
	//          System.out.println("Enter input string:");
	        	System.exit(0);
	       }

	       
	       userInput = userInput.replace(" , ", ", ");
	       userInput = userInput.replace(",", ", ");
	       userInput = userInput.replace(" ,", ", ");
	       
	       inSS = new Scanner(userInput);
	       firstWord = inSS.next();
	       secWord = inSS.next();;
	       System.out.println("First word: " + firstWord.substring(0,firstWord.length()-1));
	       System.out.println("Second word: " + secWord );
	       System.out.println();
        	
           System.out.println("Enter input string:");
           userInput = scnr.nextLine();
        }
   }
}