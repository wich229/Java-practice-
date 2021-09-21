import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		//get user item 1 name, price , quantity
		
		prompText(1);
		ItemToPurchase item1 = new ItemToPurchase();
		System.out.println("Enter the item name:");
		item1.setName(scnr);
		System.out.println("Enter the item price:");
		item1.setPrice(scnr);
		System.out.println("Enter the item quantity:");
		item1.setQuantity(scnr);
		   
		String userText = scnr.nextLine(); 
		
		prompText(2);
		ItemToPurchase item2 = new ItemToPurchase();
		System.out.println("Enter the item name:");
		item2.setName(scnr);
		System.out.println("Enter the item price:");
		item2.setPrice(scnr);
		System.out.println("Enter the item quantity:");
		item2.setQuantity(scnr);

		
		System.out.println("TOTAL COST");
		System.out.println(item1.getName()+ " " + 
		item1.getQuantity() + " @ " + "$" + item1.getPrice() + " = " + "$" + 
		item1.getQuantity()* item1.getPrice());
		
		System.out.println(item2.getName()+ " " + 
		item2.getQuantity() + " @ " + "$" + item2.getPrice() + " = " + "$" + 
		item2.getQuantity()* item2.getPrice());
		
		System.out.print("Total: $" + 
		(item1.getQuantity()* item1.getPrice() + item2.getQuantity()* item2.getPrice()));


	}
	public static void prompText(int num) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Item " + num);
//		ItemToPurchase item = new ItemToPurchase();
//		System.out.println("Enter the item name:");
//		item.setName(scnr.nextLine());
//		System.out.println("Enter the item price:");
//		item.setPrice(scnr);
//		System.out.println("Enter the item quantity:");
//		item.setQuantity(scnr);

   }
}

