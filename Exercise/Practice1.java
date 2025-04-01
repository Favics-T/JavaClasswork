import java.util.Scanner;

public class Practice0 {
    public static void main (String [] args){
        /*
        1. ask users for a number and check if the number is even or odd
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number to check if it is odd or even");
        int userInput = scanner.nextInt();

        if(userInput % 2 == 0){
            System.out.println("your input is even");

                   }
        else
        System.out.println("Your input is odd");



        scanner.close();
    }
}
