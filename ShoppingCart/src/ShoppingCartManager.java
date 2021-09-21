import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int prc;
        int qn;
        String str;
        String Desc;
        String Name;
        String Date;
        
//        ItemToPurchase Item1 = new ItemToPurchase();
//        ItemToPurchase Item2 = new ItemToPurchase();
        ShoppingCart customer = new ShoppingCart();
        
        
        System.out.print("Enter Customer's Name:\n");
        Name = scnr.nextLine();
        System.out.print("Enter Today's Date:\n");
        Date = scnr.nextLine();
        customer.getCustomerName();
        customer.getDate();
        
        scnr.nextLine();
        System.out.println();
        
        char userChoice = printMenu(scnr);
//        
        while( userChoice != 'q') {
        	ShoppingCart ItemsChanges = new ShoppingCart();
        	switch(userChoice) {
			case 'a':
				ItemToPurchase Item = new ItemToPurchase();
				str = scnr.nextLine();
				prc = scnr.nextInt();
				qn = scnr.nextInt();
				Desc = scnr.nextLine();
		        Item.setName(str);
		        Item.setPrice(prc);
		        ItemToPurchase .addItem(str, prc, qn, Desc);
				break;
//			case 'd':
//				ShoppingCart.removeItem();
//				break;
//			case 'c':
//				ItemsChanges.modifyItem();
//				break;
//			case 'i':
//				ItemsChanges.modifyItem();
//				break;
//			case 'o':
//				ItemsChanges.printDescriptions();
//				break;
			case 'q':
				break;
        	}
        	
        }

    
        	
//        System.out.print("Item 1\nEnter the item name:\n");
//        str = scnr.nextLine();
//        Item1.setName(str);
//
//        System.out.println("Enter the item price:");
//        prc = scnr.nextInt();
//        Item1.setPrice(prc);
//
//        System.out.println("Enter the item quantity:");
//        qn = scnr.nextInt();
//        Item1.setQuantity(qn);
//
//        scnr.nextLine();
//        System.out.println();
//
//        System.out.print("Item 2\nEnter the item name:\n");
//        str = scnr.nextLine();
//        Item2.setName(str);
//
//        System.out.println("Enter the item price:");
//        prc = scnr.nextInt();
//        Item2.setPrice(prc);
//
//        System.out.println("Enter the item quantity:");
//        System.out.println();
//        qn = scnr.nextInt();
//        Item2.setQuantity(qn);
        
//        System.out.println("TOTAL COST");
//        System.out.println(Item1.getName() +" "+ Item1.getQuantity() + " @ $" + Item1.getPrice() + " = $" + Item1.getPrice() * Item1.getQuantity());
//        System.out.println(Item2.getName()+" "+ Item2.getQuantity() + " @ $" + Item2.getPrice() + " = $" + Item2.getPrice() * Item2.getQuantity());
//        System.out.println();
//        System.out.println("Total: $" + (Item1.getPrice() * Item1.getQuantity() + Item2.getPrice() * Item2.getQuantity()));
//    }
        
        public static char printMenu(Scanner scnr) {
 
			System.out.println("Choose an option:");
			System.out.println("a - Add item to cart");
			System.out.println("d - Remove item from cart");
			System.out.println("c - Change item quantity");
			System.out.println("i - Output items' descriptions");
			System.out.println("o - Output shopping cart");
			System.out.println("q - Quit");
			System.out.println("Choose an option:");
			
			char menuChoice = scnr.next().charAt(0);
			return menuChoice;
        }
    			
//			while(menuChoice != 'q'){
////
//    			menuChoice = scnr.next().charAt(0);
//    			
//    			ShoppingCart ItemsChanges = new ShoppingCart();
//
//    			switch(menuChoice) {
//    				case 'a':
//    					ItemsChanges.addItem(String Name);
//    					break;
//    				case 'd':
////    					ShoppingCart.removeItem();
//    					break;
//    				case 'c':
////    					ShoppingCart.changeItemQuantity();
//    					break;
//    				case 'i':
////    					ShoppingCart.outputItemDescriptions();
//    					break;
//    				case 'o':
////    					ShoppingCart.outputShoppingCart();
//    					break;
//    				case 'q':
//    					break;
//    			}
  
        
}       


