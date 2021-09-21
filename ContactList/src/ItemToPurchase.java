import java.util.Scanner;

public class ItemToPurchase {
	
	String itemName;
	int itemPrice;
	int  itemQuantity;
	
	public ItemToPurchase() {
		String itemName = " ";
		int itemPrice = 0;
		int  itemQuantity  = 0;
	}

	public void setName(Scanner scnr) {
		itemName = scnr.nextLine();
	}
	
	public void setPrice(Scanner scnr) {
		itemPrice = scnr.nextInt();
	}
	
	public void setQuantity(Scanner scnr) {
		itemQuantity = scnr.nextInt();
	}
	
	public String getName() {
		
		return itemName;
	}
	
	public int getPrice() {
		
		return itemPrice;
	}
	
	public int getQuantity(){
		
		return itemQuantity;
	}
	
}
