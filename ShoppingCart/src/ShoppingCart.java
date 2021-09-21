import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart(){
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<ItemToPurchase>();
    }
    public ShoppingCart(String Name, String Date) {
        customerName = Name;
        currentDate = Date;
    }

    public String getCustomerName() {
    	return customerName;
    }
    public String getDate() {
    	return currentDate;
    }
    
    public void addItem(String itName, String itDesc, int itPrc, int itQn) {
    	
        cartItems.add( );
    }
//    public void removeItem(String itemName) {
//    	
//    	cartItems.remove(itemName);
//        if (cartItems.remove(itemName) != true) {
//        	System.out.print("Item not found in cart. Nothing removed.");
//        }
//  
//    }
}
//    
//    public void modifyItem(ItemToPurchase itemName) {
//    	
//    	for(int i=0 ; i < cartItems.size() ; i++ ) {
//    		
//	        if ((cartItems.get(i) == itemName ) && (cartItems.get(i) != "none")) {
//	        	ItemToPurchase cartItems = new ItemToPurchase();
//	        	cartItems.getName();
//	        	cartItems.
//		        }
//		        else 
//		        { 
//		        	System.out.println("Item not found in cart. Nothing modified.");
//		        
//		        }
//    }
//    public int getNumItemsInCart() {
//        return numItems;
//    }
//    public int getCostOfCart() {
//        return numItems;
//    }
//    
