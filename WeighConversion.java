import java.util.Scanner;
public class WeighConversion {

    public static void main(String []args){

        // My practice chack the for the file WeighConv.java for correct file
        String userName;
        Double weight;
        Double lbs;
        char optionA = 'a';
        char optionB = 'b';
        String userInput;
        Double results;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to conver to from kg to lbs or lbs to kg? pick a for first option and vice versa");
        userInput = scanner.nextLine();

        userInput = userInput.toLowerCase();
        System.out.println(userInput);
        

        if(userInput.equals(optionA) && userInput.equals(optionB)){
            System.out.println("Pick From the options available");
            
        }

       else if(userInput.equals(optionA)){
            System.out.println("Enter your weight value");
            weight = scanner.nextDouble();
            results = weight * 100;
            System.out.println("Your weight value is " + results);

        }

        else{
            System.out.println("Enter lbs value");
            lbs = scanner.nextDouble();
            results = lbs/100;
            System.out.println("Your lbs value is " + lbs);
        }
       
    
    
    }
    
}
