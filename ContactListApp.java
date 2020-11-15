import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter name of the contact that you want to change:");
        String name = sc.nextLine();
        System.out.print("Please enter new  phone number of the contact that you want to change:");
        String number = sc.nextLine();
        ContactList.replace(name, number);
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
