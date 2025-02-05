import java.util.Scanner;

public class LogicalOperator {

    public static void main( String[] args){

       
        /*==	Equal to	x == y
!=	Not equal	x != y
>	Greater than	x > y
<	Less than	x < y
>=	Greater than or equal to	x >= y
<=	Less than or equal to	x <= y


         */

        /*

        && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
            || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
            !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10
         */

         Scanner scanner = new Scanner(System.in);

boolean isSunny = true;

         System.out.println("Enter temp degree");
         int temp = scanner.nextInt();

         System.out.println("Is it sunny outside (your answer should be true if sunny and false if not sunny)");
         isSunny = scanner.nextBoolean();

         if(temp <= 30 && temp >=0 && isSunny){
            System.out.println("The Weather is Good ");
            System.out.println("\n it is Sunny Outside");
         }

         else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
         }

         // username must be between 4-12 characters
         // username must not contain underscore or spacess

         String userName;
         System.out.println("Enter your UserName");
         userName = scanner.nextLine();

         if(userName.length() < 4 || userName.length()> 12){
            System.out.println("username must be between 4-12 charcters");
         }
         else if(userName.contains(" ") || userName.contains("_")){
            System.out.println("Username must not contain spaces or underscore");
         }
         else{
            System.out.println("Your username is %S");
         }

scanner.close();

    }
}
