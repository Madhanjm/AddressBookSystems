
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<NewContacts> contactList;
    public AddressBook() {
        this.contactList = new ArrayList<>();
    }

    public void addContact(NewContacts contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully: " + contact);
    }

    // Helper method to see what's in the book
    public void displayAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("\n--- Address Book Contents ---");
            for (NewContacts c : contactList) {
                System.out.println(c);
            }
        }

    }
}




