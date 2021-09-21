//https://coderanch.com/t/707797/java/Online-shopping-cart
//https://coderanch.com/t/707053/java/Program-Soccer-team-roster-Java


import java.util.Scanner;

public class ShoppingCartManager{
	
//	public static Scanner scnr = new Scanner(System.in);
//	   
//	   public static void printMenu (ShoppingCart customer) {
//	      
//	      String choice = "";
//	      
//	      System.out.println("\nMENU");
//	      System.out.println("a - Add item to cart");
//	      System.out.println("d - Remove item from cart");
//	      System.out.println("c - Change item quantity");
//	      System.out.println("i - Output items\' descriptions");
//	      System.out.println("o - Output shopping cart");
//	      System.out.println("q - Quit\n");
//	   }
//	

public static void main(String[] args){
	
	Scanner scnr = new Scanner(System.in);
	String custName = "none";
	String date = "January 1, 2016"; 
	String choice = " ";
//	boolean mainLoop = true;

	// customer name date
//	System.out.println("Enter Customer's Name:");
//	custName = scnr.nextLine();
//	System.out.println("Enter Today's Date:");
//	date = scnr.nextLine();
//	System.out.println("");

	ShoppingCart customer = new ShoppingCart();
    
    
    System.out.print("Enter Customer's Name:\n");
    custName = scnr.nextLine();
    System.out.print("Enter Today's Date:\n");
    date = scnr.nextLine();
    customer.ShoppingCart(custName,date);

//    customer.getCustomerName();
//    customer.getDate();
//    
//    scnr.nextLine();
    System.out.println();
	
//	ShoppingCart tempItem = new ShoppingCart();
//	ItemToPurchase product = new ItemToPurchase();
//	String addItem = scnr.nextLine();
//	String tempDescr = scnr.nextLine();
//	int tempP = scnr.nextInt();
//	int tempQ = scnr.nextInt();
//	tempItem.addItem(addItem , tempDescr, tempP, tempQ);
	System.out.println("Customer Name: " + customer.getCustomerName());
	System.out.println("Today's Date: " + customer.getDate());



	
//		do {
//			
//			customer.printMenu();
//			System.out.println("Choose an option:");
//			choice = scnr.nextLine();
//
//	} while ((choice != "a") && (choice != "o") && 
//			 (choice != "i") && (choice != "d") && 
//			 (choice != "c") && (choice != "q"));
	
//
//	customer.printMenu();
//	choice = scnr.nextLine();
//	if ((choice != "a") && (choice != "o") && (choice != "i") && 
//		  (choice != "d") && (choice != "c") && (choice != "q")) {
//		
//		System.out.println("Choose an option:");
//		choice = scnr.nextLine();
//	}

//	customer.printMenu();
//	
//	while(true){
//		
//	   choice = scnr.nextLine();	
//	   if ((choice != "a") && (choice != "o") && (choice != "i") &&
//				  (choice != "d") && (choice != "c") && (choice != "q")) {
//           // An invalid choice is made
//           // Prompt for choice again
//		   System.out.println("Choose an option:");
//           choice = scnr.nextLine();
//           break;
//       } 
//		
//	   else if(choice == "q") {
//			
//			System.exit(0);
//		
//	   }
////		
//	   else {		

	customer.printMenu();
	while(true){

	choice = scnr.nextLine();   
	
	
		switch (choice) {
			
				
					case "q":
						System.exit(0);
						break;
			
					case "a":
						System.out.println("ADD ITEM TO CART");
						System.out.println("Enter the item name:");
						String tempName = scnr.nextLine().trim().toString();
						System.out.println("Enter the item description:");
						String tempDescription = scnr.nextLine().trim().toString();
						System.out.println("Enter the item price:");
						int tempPrice = scnr.nextInt();
						System.out.println("Enter the item quantity:");
						int tempQuantity = scnr.nextInt();
						ItemToPurchase itemToPurchase = new ItemToPurchase(tempName, tempDescription, tempPrice, tempQuantity);
//						itemToPurchase.ItemToPurchase(tempName, tempDescription, tempPrice, tempQuantity);

						customer.addItem(itemToPurchase); //tempName, tempDescription, tempPrice, tempQuantity
						customer.printMenu();
						break;		
			
					case "d":
						System.out.println("REMOVE ITEM FROM CART");
						System.out.println("Enter name of item to remove:");
						String item = scnr.nextLine();
						customer.removeItem(item);
						customer.printMenu();
						break;
			
					case "c":
						System.out.println("CHANGE ITEM QUANTITY");
						System.out.println("Enter the item name:");
						String name = scnr.nextLine();
						System.out.println("Enter the new quantity:");
						int quantity = scnr.nextInt();
						customer.modifyItem(name, quantity);
						customer.printMenu();
						break;
			
					case "i":
						System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
						customer.printDescriptions();
						customer.printMenu();
						break;
			
					case "o":
						System.out.println("OUTPUT SHOPPING CART");
						customer.printTotal();
						customer.printMenu();
						break;
			
					case "f":
						System.out.println("Choose an option:");
						break;

					case "s":
						System.out.println("Choose an option:");
						break;
						
					default:
//						System.out.println("Choose an option:");
						break;
				}
		}
	}
		
		

}






	

	
	






	         
	        