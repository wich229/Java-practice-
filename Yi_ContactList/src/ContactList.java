import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {
		//prompt the user for 3 contacts and output the user's input.
		Scanner scnr = new Scanner(System.in);
		
		int numberContacts = 3;
        int i;
              
        String [][] userInfo = new String[2][3];

        
        for ( i = 0; i < numberContacts; i++) {
        	
        	// add name in Arr.
        	System.out.println("Person " + (i+1));
        	System.out.println("Enter name:");
        	String userName = scnr.next();
        	userInfo [0][i] = userName;
            
        	// add phoneNum in Arr.
    		System.out.println("Enter phone number:");
    		String userPhone = scnr.next();
    		userInfo [1][i] = userPhone;
    		
    		//print input.
    		System.out.println("You entered: " + userInfo [0][i] + ", " + userInfo [1][i]);
    		System.out.println();

        }
        
        // import name and phone to the class.
        ContactNode firstObj;
        ContactNode secObj;
        ContactNode thirdObj;
        ContactNode currentObj;
        
        // node = null
        firstObj = new ContactNode(userInfo [0][0],userInfo [1][0] ); 
        
        // node = null 
        // firstNode -> secNode
        secObj = new ContactNode(userInfo [0][1],userInfo [1][1] ); 
        firstObj.insertAfter(secObj);
        
        // secNode -> null
        thirdObj = new ContactNode(userInfo [0][2],userInfo [1][2] );
        secObj.insertAfter(thirdObj);
        
        // currentObj points to null ( the last node)
        currentObj = firstObj;
        
        System.out.println("CONTACT LIST");
        while (currentObj != null) {
        currentObj.printContactNode();
        currentObj = currentObj.getNext();
        
        }
			
	}
}
