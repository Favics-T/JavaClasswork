import java.util.Scanner;
public class TemperatureConversion {

    public static void main(String []args){
        double temp;
            int choice;
        double newTemp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick an Option ? 1:Farenheit to Celcius 2:Celcius to Farenheit");
        choice = scanner.nextInt();

        System.out.println("Enter Temperature");
        temp = scanner.nextDouble();

        newTemp = choice == 1 ?
        (temp - 32) * 5 / 9:
        (temp * 9 / 5) + 32;
          
        System.out.println(newTemp);

        scanner.close();

    }
    
}
