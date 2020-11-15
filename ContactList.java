
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Map;


public class ContactList {

    
    private HashMap<String,String> ContactMap = new HashMap<String,String>();
    
    Contact contact = new Contact();
    
    Scanner sc = new Scanner(System.in);
    
    void removeContact(HashMap <String,String> ContactMap){
        try{
        System.out.print("Please enter name of the contact that you want to delete:");
        contact.setName(sc.nextLine());
        ContactMap.remove(contact.getName(),ContactMap.get(contact.getName()));
        }
        catch (Exception e){
            System.out.println("Name does not exist!");
        }
    }
    
    void addContact(HashMap <String,String> ContactMap){
        //Dilumi
        System.out.print("PLease enter name: ");
        contact.setName(sc.nextLine());
        System.out.print("Please add phone number: ");
        contact.setPhoneNo(sc.nextLine());
	ContactMap.put(contact.getName(),contact.getPhoneNo());
        
    }
    

    void displayContacts(HashMap <String,String> ContactMap){
       System.out.printf("Name\t\tNumber\n\n");
       for (String i : ContactMap.keySet()) {
	  System.out.printf("%s\t\t%s\n" , i, ContactMap.get(i));
	}
    }

    void editContact(HashMap <String,String> ContactMap){
        //Lasith
        System.out.print("Please enter name of the contact that you want to change:");
        contact.setName(sc.nextLine());
        System.out.print("Please enter new  phone number of the contact that you want to change:");
        contact.setPhoneNo(sc.nextLine());
        ContactMap.replace(contact.getName(),contact.getPhoneNo());
    }

 
    void  loadContacts(HashMap <String,String> ContactMap){
        //loads from a file
        try {
            File ContactFile = new File("ContactFile.txt");
            Scanner contact = new Scanner(ContactFile);
	    System.out.printf("Name\t\tNumber\n\n");
            while (contact.hasNextLine()) {
            String data = contact.nextLine();
            String[] Ndata = data.split(" ");
            ContactMap.put(Ndata[0],Ndata[1]);
           // System.out.println(data);
            System.out.printf("%s\t\t%s\n" , Ndata[0], Ndata[1]);
      }
      contact.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    void saveContacts(HashMap <String,String> ContactMap){
            try {
                FileWriter SaveTo = new FileWriter("ContactFile.txt");
                for (String i : ContactMap.keySet()) {
                    SaveTo.write(i + " " + ContactMap.get(i)+'\n');
                }       
            SaveTo.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                 System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
    
}
