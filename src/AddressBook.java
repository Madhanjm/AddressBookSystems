import java.util.*;
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
    public void editContact(String firstName, String lastName, Scanner scanner) {

        NewContacts foundContact = null;

        for (NewContacts contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {

                foundContact = contact;
                break;
            }
        }

        if (foundContact == null) {
            System.out.println("Error: Contact not found in the address book.");
            return;
        }

        System.out.println("\n--- Contact Found! Select the field to edit ---");
        System.out.println("1. Address | 2. City | 3. State | 4. Zip | 5. Phone | 6. Email");

        int choice = 0;
        try {
            // Scanner input for which field to edit
            System.out.print("Enter choice (1-6): ");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }


    switch (choice) {
        case 1:
            System.out.print("Enter new Address: ");
            foundContact.setAddress(scanner.nextLine());
            break;
        case 2:
            System.out.print("Enter new City: ");
            foundContact.setCity(scanner.nextLine());
            break;
        case 3:
            System.out.print("Enter new State: ");
            foundContact.setState(scanner.nextLine());
            break;
        case 4:
            System.out.print("Enter new Zip Code: ");
            foundContact.setZip(scanner.nextLine());
            break;
        case 5:
            System.out.print("Enter new Phone Number: ");
            foundContact.setPhoneNumber(scanner.nextLine());
            break;
        case 6:
            System.out.print("Enter new Email: ");
            foundContact.setEmail(scanner.nextLine());
            break;
        default:
            System.out.println("Invalid option selected. No field was updated.");
            return;
    }
        System.out.println("\n Contact updated successfully!");
        System.out.println(foundContact);
}
}




