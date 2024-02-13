import java.util.ArrayList;
import java.util.Scanner;

class SBook { // book class to hold the title and the name of the author
    private String title;
    private String author;
    private boolean available;

    public SBook() {
    }
    public  SBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}


class SLibrary<SBooks> { // the library class
    private static ArrayList<SBook> SBooks;
    public SLibrary() {
        SBooks = new ArrayList<>();
    }

    // method to display all the books in the library
    public static void displayBooks() {
        for (SBook SBook : SBooks) {
            System.out.println("Title: " + SBook.getTitle() + ", Author: " + SBook.getAuthor());
        }
    }
    public void addBook(SBook SBook) {
        SBooks.add(SBook);
    }
    // method to delete a book base on the book index
    public void dBooks(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Book index to delete: ");
            int bIndex = scan.nextInt();
            SBooks.remove(bIndex);
            System.out.println("Book remove successfully... ");
        }catch(Exception e){
            System.out.println("Empty book List or invalid index");
        }

    }

    public void bBooks(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Book index you want to borrow: ");
            int bIndex = scan.nextInt();
            SBooks.remove(bIndex);
            System.out.println("Book borrowed successfully... ");
        }catch(Exception e){
            System.out.println("Empty book List or invalid index");
        }
    }
    public void searchBook(String title) {
        for (SBook SBook : SBooks) {
            if (SBook.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found - Title: " + SBook.getTitle() + ", Author: " + SBook.getAuthor());
                return;
            }
        }
        System.out.println("Book not found with title: " + title);
    }
}