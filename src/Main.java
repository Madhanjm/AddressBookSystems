import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter to adress book system");

        AddressBook addressBook = new AddressBook();
         NewContacts person1=new NewContacts("Madhan","JM","EWS COLONy","Davangere","Karnataka","577001","973195840","mmadhanjm@gmail.com");
         addressBook.addContact(person1);
         addressBook.displayAllContacts();

        System.out.println("Edit a New Contact ");

        System.out.print("Enter First Name: ");
        String searchfirstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String searchlastName = scanner.nextLine();

       addressBook.editContact(searchfirstName,searchlastName,scanner);

       System.out.println("adress book contains");
       addressBook.displayAllContacts();

        addressBook.displayAllContacts();

    }
}

