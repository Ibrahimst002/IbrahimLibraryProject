import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        String pick;
        int choice =0;
        while(choice !=3){

            System.out.println("Welcome to Rapasco University library");
            System.out.println("Enter 1- for Student details \n" +
                    "Enter 2- for Library books");
            choice =obj.nextInt();

            // if this condition is true it will execute student details
            if (choice == 1) {

                StudentInfo obj1=new StudentInfo();
                System.out.println("Enter student's name");

                // asking input from the console
                obj1.name=obj.nextLine();
                obj1.name=obj.nextLine();

                System.out.println("Enter your department");
                obj1.depart =obj.nextLine();
                System.out.println("Enter the User id");
                obj1.uni_id=obj.nextLine();
                System.out.println("Enter university id");
                obj1.uid=obj.nextLine();
                System.out.println("What year are you currently in? 1,2 or 3:");
                obj1.sem=obj.nextInt();

                obj1.getdata(obj1.name, obj1.depart, obj1.uid,obj1.uni_id,obj1.sem);
                obj1.setdata();
            }
            // if this condition is true it will give access to the library books
            else if(choice ==2){
                libraryBooks depart=new libraryBooks();

                depart.ComputerS();
                depart.publicHealth();
                depart.biology();

            }

        }
    }

}

