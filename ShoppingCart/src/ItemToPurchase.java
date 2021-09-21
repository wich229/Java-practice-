public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        itemDescription = "none";
    }
    public ItemToPurchase(String itName, String itDesc, int itPrc, int itQn) {
        itemName = itName;
        itemDescription = itDesc;
        itemPrice = itPrc;
        itemQuantity = itQn;
    }

    public void setName(String name) {
        itemName = name;
    }
    public String getName() {
        return itemName;
    }
    public void setPrice(int price) {
        itemPrice = price;
    }
    public int getPrice() {
        return itemPrice;
    }
    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }
    public int getQuantity() {
        return itemQuantity;
    }
    public void setDescription(String itDesc) {
        itemDescription = itDesc;
    }
    public String getDescription() {
        return itemDescription;
    }
    public void printItemCost() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + itemPrice * itemQuantity);
    }
    public void printItemDescription() {
        System.out.println(itemName + ": " + itemDescription + ".");
    }
}