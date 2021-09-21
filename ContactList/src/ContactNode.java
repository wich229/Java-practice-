//import java.util.Scanner;
//
//public class ContactNode 
//{
//	
//	private String contactName;
//	private String contactPhoneNumber;
//	private ContactNode nextNodePtr;
//	
//	public ContactNode() {
//		contactName = " ";
//		contactPhoneNumber = " ";
//		nextNodePtr = null;
//	}
//	
//	
//	public void getName(Scanner scnr)
//	{
//		contactName = scnr.nextLine();
//		this.nextNodePtr = null;
//	}
//	
//	public void getPhoneNumber(Scanner scnr)
//	{
//		contactPhoneNumber = scnr.nextLine();
//		this.nextNodePtr = null;
//
//	}
//	
//	public void getName(Scanner scnr, ContactNode nextLoc)
//	{
//		contactName = scnr.nextLine();
//		this.nextNodePtr = nextLoc;
//	}
//	
//	public void getPhoneNumber(Scanner scnr,ContactNode nextLoc)
//	{
//		contactPhoneNumber = scnr.nextLine();
//		this.nextNodePtr = nextLoc;
//
//	}
//	
//	public void insertAfter(ContactNode nodeLoc ) 
//	{
//		ContactNode tmp;
//		tmp = this.nextNodePtr;
//	    this.nextNodePtr = nodeLoc;
//	    nodeLoc.nextNodePtr = tmp;
//
//	}
//
//	public ContactNode getNext() 
//	{
//		return this.nextNodePtr;
//	}
//	
//	public void printContactNode()
//	{
//		System.out.println("CONTACT LIST");
//		System.out.println("Name: "+ contactName);
//		System.out.println("Name: "+ contactPhoneNumber);
//		
//	}
//	
//	
//
//}

public class ContactNode {

    private String contactName = "";
    private String contactPhoneNumber = "";
    private ContactNode nextNodePtr;


    public ContactNode(){
        contactName = "";
        contactPhoneNumber = "";
    }

    public ContactNode(String contactName, String contactPhoneNumber){
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }
    public String getName(){
        return contactName;
    }
    public String getPhoneNumber(){
        return contactPhoneNumber;
    }

    public void insertAfter(ContactNode nodeLoc) {
        ContactNode tmpNext;

        tmpNext = this.nextNodePtr;
        this.nextNodePtr = nodeLoc;
        nodeLoc.nextNodePtr = tmpNext;
        return;
    }

    public ContactNode getNext(){
        return nextNodePtr;
    }

    public void printContactNode(){
        System.out.println("Name: " + this.contactName);
        System.out.println("Phone number: " + this.contactPhoneNumber);
        return;
    }

}
