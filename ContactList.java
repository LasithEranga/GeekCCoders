import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;


public class ContactList{
    public HashMap<String,String> ContactList = new HashMap<String,String>();
    Scanner input = new Scanner(System.in);
    
    void addContact(){
        //Dilumi
    }
    
    void removeContact(String name, String phonenumber){
        
        
        for(int i=0; i<ContactList.size; i++){
            
            if (name == ContactList.key ){
                
                String ask = null;
                while(ask == "1"){
                System.out.println("\n-------------------------------" );
                System.out.println("Name : " + ContactList.key );
                System.out.println("Phone number : " + ContactList.value );
                System.out.println("-------------------------------" );
                System.out.println("\nDo you want remove contact ?\n 1.Yes\t 2.No" + ContactList.key );
                
                ask = input.nextLine();
                
                if(ask == "1"){
                    ContactList.key.clear();
                    ContactList.value.clear();
                    System.out.println("\n-------------------------------" );
                    System.out.println("Conatct is deleted succesfully" + ContactList.key );
                    System.out.println("--------------------------------"  );
                    break;
                }
                else if(ask=="2"){
                    System.out.println("\n-------------------------------" );
                    System.out.println("Name : " + ContactList.key );
                    System.out.println("Phone number : " + ContactList.value );
                    System.out.println("-------------------------------" );
                    System.out.println("\nDo you want remove contact ?\n 1.Yes\t 2.No" + ContactList.key );
                
                    ask = input.nextLine();
                }
                else{
                    System.out.println("Invalid input please try" );
                }
                }
            }
            else{
                
                System.out.println("Cannot find a name " + ContactList.key);
                
            }
            
            
            
        }
        
        
        
        
        
        
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
