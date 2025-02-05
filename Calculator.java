import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
{
    double num1;
    double num2;
    char operator;
    double result=0;
    boolean validOperation = false;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first NUmber:");
    num1 = scanner.nextDouble();

    System.out.println("Enter an operator(+,-,*,/)");
    operator = scanner.next().charAt(0);

    System.out.println("Enter the second number");
    num2 = scanner.nextDouble();

    scanner.close();

    switch(operator){
        case '+' -> result = num1 + num2;
        case '-' -> result = num1 - num2;
        case '*' -> result = num1 * num2;
        case '/' -> {
            if(num2 == 0){
                System.out.println("Cannot divide by zero!");
                validOperation = false;
            }
            else{
                result = num1 /num2;
                            }
        }
        case '^' -> Math.pow(num1,num2);
        default ->{ System.out.println("Enter a valid operator");
        validOperation = false;}
    }
    if(validOperation){
        System.out.println(result);
    }
    else{
        System.out.println("Invalid Operator");
    }

}    
}
