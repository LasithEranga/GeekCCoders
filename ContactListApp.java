import java.util.Scanner;
import java.util.HashMap;


public class ContactListApp{
    
    public static void main(String[] args) {
	HashMap<String,String> ContactListMap= new HashMap<String,String>();
        //creating a while loop to repeat the task until user enters 7
        int userInput = 9;
        Scanner sc = new Scanner(System.in);
        while (userInput!=7){
	    ContactList List = new ContactList();
            System.out.println("\nEnter 1 to display all contacts\nEnter 2 to add contact\nEnter 3 to remove contact\nEnter 4 to edit a contact\nEnter 5 to load contacts from a text file\nEnter 6 to save contacts to the text file\nEnter 7 to exit from the program\n");
            userInput = sc.nextInt();
            switch(userInput){
                case 1:{//display all contacts
		    System.out.println("");
                    List.displayContacts(ContactListMap);
                    break;
                }
                case 2:{//adding a contact
		    System.out.println("");
                    List.addContact(ContactListMap);
		    break;
                }
                case 3:{//remove a contact
		    System.out.println("");
		    List.removeContact(ContactListMap);
                    break;
                }
                case 4:{//edit a contact
		    System.out.println("");
		    List.editContact(ContactListMap);
                    break;
                }
                case 5:{//load contacts from txt file
		    System.out.println("");
		    List.loadContacts(ContactListMap);
                    break;
                }
                case 6:{//save contacts to the txt file
		    System.out.println("");
		    List.saveContacts(ContactListMap);
                    break;
                }
                case 7:{//terminates the program
                    System.out.println("Good Bye!");
                    break;
                }
                default:
                    System.out.println("Invalid Input!"); 
			}					
        }
	}
    
}
