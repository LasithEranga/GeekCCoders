import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;

public class ContactList{
    public HashMap<String,String> ContactList = new HashMap<String,String>();
    
    void addContact(){
        //Dilumi
    }
    
    void removeContact(){
        //Supun
    }
    
    void editContact(){
        //Lasith
        ContactList.get("Strin name");
    }
    void displayContacts(){
        
            for (String i : ContactList.keySet()) {
      System.out.println(i + "   " + ContactList.get(i));
    }
    }
    void  loadContacts(){
        //loads from a file
    }
    void saveContacts(){
           //save to a file
    }

}
