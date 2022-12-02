import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;

        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        // Returns true if the contact doesn't exist,
        // or false if the contact already exists.
        if (!myContacts.contains(newContact)) {
            myContacts.add(newContact);
            // Contact exists
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        // Returns true if the contact exists and was updated successfully,
        // or false if the contact doesn't exist.
        if (myContacts.contains(oldContact)) {
            int oldIndex = myContacts.indexOf(oldContact);
            myContacts.set(oldIndex, newContact);
//            myContacts.remove(oldContact);
//            myContacts.add(newContact);
            // Contact exists
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        // Returns true if the contact exists and was removed successfully,
        // or false if the contact doesn't exist.
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            // Contact exists
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        // The returned value is it's position in the ArrayList,
        // it will either be -1 (doesn't exists)
        // or a value greater than or equal to 0 (does exists).
        if (myContacts.contains(contact)) {
            // Contact exists
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    private int findContact(String soughtContact) {
        //-  findContact(), same as above, only it has one parameter of type String.
        // The returned value is its position in the ArrayList,
        // it will either be -1 (doesn't exist)
        // or a value greater than or equal to 0 (does exist).

        for (Contact contact : myContacts) {
            if (contact.getName() == soughtContact) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String query) {
        // Use the String to search for the name and then return the Contact.
        // Return null otherwise.
        for (Contact contact : myContacts) {
            if (contact.getName() == query) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        // print the contacts in the following format:
            //Contact List:
            //1. Bob -> 31415926
            //2. Alice -> 16180339
            //3. Tom -> 11235813
            //4. Jane -> 23571113

        int count = 1;
        System.out.println("Contact List:");

        for (Contact contact : myContacts) {
            System.out.println(count + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            count++;
        }
    }

}



//1.  Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
//-  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
//-  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
//-  And seven methods, they are (their functions are in their names):
//-  addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
//-  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean.
// Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
//-  removeContact(), has one parameter of type Contact and returns a boolean.
// Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
//-  findContact(), has one parameter of type Contact and returns an int.
// The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
//-  queryContact(), has one parameter of type String and returns a Contact.
// Use the String to search for the name and then return the Contact. Return null otherwise.
//-  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
//Contact List:
//1. Bob -> 31415926
//2. Alice -> 16180339
//3. Tom -> 11235813
//4. Jane -> 23571113