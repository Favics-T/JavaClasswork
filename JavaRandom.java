import java.util.Random;
import java.util.Scanner;

public class JavRandom
{
    public static void main(String[] args){
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int maxi = 30;
        int min = 7;

                int number;
        number = random.nextInt(min,maxi+1);
        System.out.println(number);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("Head");
        }
        else{
            System.out.println("Tails");
        }

        // Math method

        /*
        Math.PI
        Math.E
        Math.pow
         */

        System.out.println("Enter the length of of side a");
        int A = scanner.nextInt();

        System.out.println("Enter the breadth of B");
        int B = scanner.nextInt();

        int C = A * B;

        System.out.println(C);


        scanner.close();


    }

}
