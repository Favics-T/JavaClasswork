import java.util.Scanner;

public class WeighConv {

    public static void main(String [] args){

        // Weigh Conversion Program

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");


    System.out.println("Choose an Option");
    choice = scanner.nextInt();

    System.out.println(choice);


    if(choice == 1){
        System.out.println("Enter the weight in lbs");
        weight = scanner.nextDouble();
        newWeight = weight * 0.453592;
        System.out.println("The new weight in kgs is " + newWeight);
    }

    else if(choice == 2){
        System.out.println("Enter the weight in kg");
        weight = scanner.nextDouble();
        newWeight = weight * 2.20462;
        System.out.printf("Your new weight is %2f", newWeight);
    }

    else{
        System.out.println("Enter a valid choice");
    }

        //Welcome Message
        /*
         Prompt for user choices
          option 1 convert lbs to kg 
          option 2 convert kg to lbs 
          else print not a valid choice 

         */

         scanner.close();
    }
    
}
