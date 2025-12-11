import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter to adress book system");

        AddressBook addressBook = new AddressBook();
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add New Contact ");
            System.out.println("2. Edit Existing Contact ");
            System.out.println("3. Delete  Contact");
            System.out.println("4. Display All  Contact");

            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");


            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Logic for creating a new contact (UC 2)
                    NewContacts newContact = createNewContact(scanner);
                    addressBook.addContact(newContact);
                    break;
                case "2":
                    // Logic for editing a contact (UC 3)
                    System.out.print("Enter First Name to edit: ");
                    String editFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name to edit: ");
                    String editLastName = scanner.nextLine();
                    addressBook.editContact(editFirstName, editLastName, scanner);
                    break;
                case "3":
                    System.out.print("Enter First Name to delete: ");
                    String deleteFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name to delete: ");
                    String deleteLastName = scanner.nextLine();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                case "4":
                    addressBook.displayAllContacts();
                    break;
                case "5":
                    exit = true;
                    System.out.println("Exiting Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

        private static NewContacts createNewContact(Scanner scanner){
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter City: ");
            String city = scanner.nextLine();
            System.out.print("Enter State: ");
            String state = scanner.nextLine();
            System.out.print("Enter Zip Code: ");
            String zip = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            return new NewContacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        }








    }


