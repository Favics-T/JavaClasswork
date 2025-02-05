import java.util.Scanner;

public class Switch {
    
    public static void main(String []args){
        /*
         * 
         * Enhanced switches = a replacement to using plenty if statement
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day in the week you love");
        String day = scanner.nextLine();

        switch(day){
            case "Monday" -> System.out.println("It is a WeekDay");
            case "Tuesday" -> System.out.println("It is a Weekday");
            case "Wednesday" -> System.out.println("It is a Weekday");
            case "Thursday" -> System.out.println("It is a Weekday");
            case "Friday" -> System.out.println("It is a Weekday");
            case "Sartuday" -> System.out.println("It is the Weekend😂");
            case "Sunday" -> System.out.println("It is the Weekend");

            default -> System.out.printf("%S is not a day",day);
        }

        System.out.println("Enter the six classes of food");
        String Food = scanner.nextLine();

        switch(Food){
            case "Protein" -> System.out.println("Give Energy");
            case "Fat" -> System.out.println("Makes You Healthy");
            case "Carbohydrate" -> System.out.println("Gives Glucpse");
            default -> System.out.println("That class of Food is not recognized in our program");
        }

        


        scanner.close();
    }
}
