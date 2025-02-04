import java.util.Scanner;

public class Scanners {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Your favorite color");
        String color = scanner.nextLine();

        System.out.println("You are " + age + "old");
        System.out.println("Your Favorite Color is "+ color);

    }
}
