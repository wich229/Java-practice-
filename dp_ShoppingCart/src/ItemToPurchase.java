public class ItemToPurchase {

	private String itemName;
	private String itemDescription;
	private int itemPrice;
	private int itemQuantity;



	public ItemToPurchase(){
		itemName = "none";
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	
	}
	
	public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity){
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}
	
//	public void ItemToPurchase(String name, String description, int price, int quantity){
//		itemName = name;
//		itemDescription = description;
//		itemPrice = price;
//		itemQuantity = quantity;
//	
//	}
	
	public void setName(String inputName){
		itemName = inputName;
	}
	public String getName(){
		return itemName;
	}
	public void setDescription(String inputDescription){
		itemDescription = inputDescription;
	}
	public String getDescription(){
		return itemDescription;
	}
	public void setPrice(int inputPrice){
		itemPrice = inputPrice;
	}
	public int getPrice(){
		return itemPrice;
	}
	public void setQuantity(int inputQuantity){
		itemQuantity = inputQuantity;
	}
	public int getQuantity(){
		return itemQuantity;
	}

	public void printItemCost(){
		System.out.printf("%s %d @ $%d = $%d\n",
                getName(),
                getQuantity(),
                getPrice(),
                getPrice() * getQuantity());
	}

	public void printItemDescription(){
		System.out.println(getName() + ": " + getDescription());
	}
}