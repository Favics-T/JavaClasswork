import java.util.Scanner;

public class Compound {

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount");
        principal = scanner.nextDouble();

        System.out.println("Enter th interest rate");
        rate = scanner.nextDouble() /100;

        System.out.println("Enter the number of times compounded for a year");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate /timesCompounded, timesCompounded * years);

        System.out.println("The amount after "+years + " is: #"+amount);
        System.out.printf("The amount after %d is %b",years,amount);
        scanner.close();

    }
}
