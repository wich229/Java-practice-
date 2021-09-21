
public class linkedListTest {
		
		private String contactName;
		private String contactPhoneNumber;
		private ContactNode nextNodePtr;
		
		// Constructor
//		public ContactNode() {
//			contactName = "none";
//			contactPhoneNumber = "none";
//			nextNodePtr = null;
//		}
		
		// Constructor
//		public ContactNode(String userName, String phoneNum ) {
//			
//			this.contactName = userName;
//			this.contactPhoneNumber = phoneNum;
//			this.nextNodePtr= null;
//		}
		
		// Constructor
//		public ContactNode(String userName, String phoneNum,ContactNode nextNode ) {
//			this.contactName = userName;
//			contactPhoneNumber = phoneNum;
//			nextNodePtr = nextNode;
//		}
		
		public String getName() {
			return contactName;
		}
		
		public String getPhoneNumber() {
			return contactPhoneNumber;
		}
		
		public void insertAfter(ContactNode nextNode) {
			
//			ContactNode tempNode;
			ContactNode lastNode;
			
			if ( nextNode == null) {
				this.nextNodePtr = nextNode;
			}
			else {
				
//				tempNode = this.nextNodePtr;
				
				while( nextNode != null ) {
					this.nextNodePtr = nextNode;
				}
				
				lastNode = nextNode;
			}
			
//			  ContactNode tmpNext;
//			
//			  tmpNext = this.nextNodePtr;
//			  this.nextNodePtr = nextNode;
//			  nextNode.nextNodePtr = tmpNext;
			

		}
		
		public ContactNode getNext() {
			return nextNodePtr;
		}
		
		public void printContactNode() {
			
	        System.out.println("Name: " + this.contactName);
	        System.out.println("Phone number: " + this.contactPhoneNumber);
	        System.out.println();
		}
	}


