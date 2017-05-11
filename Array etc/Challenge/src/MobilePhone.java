import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by diamo on 03.05.2017.
 */
public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);

    private Contact contact;
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(Contact contact, ArrayList<Contact> myContacts) {
        this.contact = contact;
        this.myContacts = myContacts;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " was replace with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was delete");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String conctactName) {
        for(int i=0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(conctactName))
                return i;
        }
        return -1;
    }

    public void printArrayContacts() {
        for (Contact contacts:myContacts) {
            System.out.println(contacts);
        }
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0)
            return this.myContacts.get(position);

        return null;
    }
}
