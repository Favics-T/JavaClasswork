import java.util.Scanner;

public class Main {

    public static void main(String[] args){
// \n- it helps for a new line.
System.out.print("You are a new student use the door\n");

// user input in java, you receive input through scanner class
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name");
      String name =  scanner.nextLine();
        System.out.println("Hello " + name);
        if(name == " "){
            System.out.println("Name cannot be empty");
        }
        else{
            System.out.println("ENTER A VALID  NAME");
        }

        System.out.println("enter Your Mail");
        String user1 = scanner.nextLine();
        System.out.println("verify your mail" + user1);
        System.out.println("Name:" + name + " " + "Email:" +user1);

        System.out.println("Enter Your Age");
        int age = scanner.nextInt();

        System.out.println("Your age is " + age);

        System.out.println("confirm these informations Your Name:" + name + "Your Age: " +age+ "Your Mail:" +user1);

        System.out.println("Enter yes if Details are correct, Enter No if Details are not correct");


        System.out.println("Are You a Student ? true/false:");
        boolean isStudent = scanner.nextBoolean();

        System.out.println(name +"is a student? : " + isStudent );

        scanner.close();



    }
}
