import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;


public class ContactList{
    public HashMap<String,String> ContactList = new HashMap<String,String>();

    Scanner sc = new Scanner(System.in);
    
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
                
                ask = sc.nextLine();
                
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
                
                    ask = sc.nextLine();
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


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter name of the contact that you want to change:");
        String name = sc.nextLine();
        System.out.print("Please enter new  phone number of the contact that you want to change:");
        String number = sc.nextLine();
        ContactList.replace(name, number);
    }
    void displayContacts(){
        //
        ContactList.get("Strin name");
    }
    void displayContacts(){

        //

        //PK
    }
    void  loadContacts(){
        //loads from a file
    }
    void saveContacts(){
           //save to a file
    }

}
