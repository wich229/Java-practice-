//import java.util.Scanner;
//
//public class ContactList {
//   public static void main(String[] args) {
//	   	Scanner scnr = new Scanner(System.in);
//	  	ContactNode headObj;
//	  	ContactNode nodeObj;
//	  	ContactNode lastObj;
//	  	ContactNode currentObj;
//		  
//	  
//		// prompt the user for three contacts and output the user's input.
//	  	LinkedList<String> person1 = new LinkedList<String>();
//	    
//	  	prompText(1);
//		headObj = new ContactNode();
//		headObj.getName(scnr);
//		prompText2();
//		headObj.getPhoneNumber(scnr);
//		
//		
//		prompText(2);
//		nodeObj = new ContactNode();
//		nodeObj.getName(scnr);
//		headObj.insertAfter(nodeObj);
//		prompText2();
//		nodeObj.getPhoneNumber(scnr);
//		headObj.insertAfter(nodeObj);
//		
//		prompText(3);
//		lastObj = new ContactNode();
//		lastObj.getName(scnr);
//		nodeObj.insertAfter(lastObj);
//		prompText2();
//		lastObj.getPhoneNumber(scnr);
//		nodeObj.insertAfter(lastObj);
//		
//		currentObj = headObj;
//		
//		while (currentObj != null) {
//			currentObj.printContactNode();
//			currentObj = currentObj.getNext();
//	      }
//	  
//		
//	}
//   public static void prompText(int num) {
//	  	System.out.println("Person " + num);
//		System.out.println("Enter name:");
//   }
//   	
//   public static void prompText2() {
//	   System.out.println("Enter phone number:");
//   }
//   
//}


import java.util.Scanner;

public class ContactList{
    public static void main(String[] args){
        int numberContacts = 3;
        Scanner scnr = new Scanner(System.in);
        ContactNode nextNodePtr0;
        ContactNode nextNodePtr1;
        ContactNode nextNodePtr2;

        String [][] contactInfo = new String[3][2];

        int i = 0;
        int j = 0;
        
        for(i = 0; i < numberContacts; i++){

            System.out.print("Person " + (i+1));
            System.out.print("\nEnter name: ");
            contactInfo[i][0] = scnr.nextLine();
            for ( j = 0; j <  1; ++j){
                System.out.print("\nEnter phone number: ");
                contactInfo[i][1] = scnr.nextLine();
                System.out.println("\nYou entered: " + contactInfo[i][j] + ", " + contactInfo[i][1] );
            }
            System.out.println("");
//            nextNodePtr[i].insertAfter();
        }

        System.out.println("CONTACT LIST");
        for(i = 0; i < numberContacts; i++){
            System.out.println("Name: " + contactInfo[i][0]);
            System.out.println("Phone number: " + contactInfo[i][1]);
            System.out.println("");
        }
        
    }

}



