import java.util.ArrayList;
import java.io.File;

public class ContactList{
    public HashMap<String,String> ContactList = new HashMap<String,String>();
    
    void addContact(){
        //Dilumi
        System.out.print("PLease enter name: ");
        String name = sc.nextLine();
        System.out.println("Please add phone number: ");
        String phone = sc.nextLine();
	ContactList.put(name,phone);
        
    
    }
    
    void removeContact(){
        //Supun
    }
    
    void editContact(){
        //Lasith
        ContactList.get("Strin name");
    }
    void displayContacts(){
        //
    }
    void  loadContacts(){
        //loads from a file
    }
    void saveContacts(){
           //save to a file
    }

}
