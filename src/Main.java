import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter to adress book system");

        AddressBook addressBook = new AddressBook();
        //   NewContacts person1=new NewContacts("Madhan","J M","EWS COLONy","Davangere","Karnataka","577001","973195840","mmadhanjm@gmail.com");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Adding a New Contact ");

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
        String zip = scanner.nextLine(); // Reading zip as String is safer

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        NewContacts newPerson = new NewContacts(
                firstName, lastName, address, city, state,
                zip, phoneNumber, email
        );


        addressBook.addContact(newPerson);
        addressBook.displayAllContacts();

    }
        }

