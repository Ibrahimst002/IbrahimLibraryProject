import java.util.Scanner;

public class Main {
    // This is where the program execution starts (the main method)
    public static void main(String[] args) {

        SLibrary sLibrary = new SLibrary(); // instantiating the library class
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n         WELCOME TO RAPASCO JUNIOR LIBRARY SYSTEM");
        System.out.println("<<==>>".repeat(10));


        while (true) { // default output to ask the user's choice
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Search Book");
            System.out.println("6. Borrow Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            System.out.println("==".repeat(30));

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline asking input from the user

            // this will display the choice of the user base on case input
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    sLibrary.addBook(new SBook(title, author));
                    System.out.println("Book added successfully!");
                    System.out.println("==".repeat(30));
                    break;
                case 2:
                    System.out.println("List of all books:");
                    SLibrary.displayBooks();
                    System.out.println("==".repeat(30));
                    break;
                case 3:
                    sLibrary.dBooks();
                    System.out.println("==".repeat(30));
                    break;
                case 6:
                    sLibrary.bBooks();
                    System.out.println("==".repeat(30));

                    break;
                case 4:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    sLibrary.searchBook(searchTitle);
                    System.out.println("==".repeat(30));
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    System.out.println("<<==>>".repeat(10));
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println("<<==>>".repeat(10));
            }
        }
    }


}

