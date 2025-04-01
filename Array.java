import java.util.Scanner;

public class Array {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        String [] students = new String[5];

        students [0] = "Taiwo";

        System.out.println(students[0]);

        String [] employees = {"Taiwo","Tom","Sarah"};

        // int [] numbers = {1,2,3,4,5,6,7,8,9};

        // for(int i = 0; i<= numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        for(int i = 0; i< employees.length; i++){
                System.out.println("Enter Your Name");
                String name = scanner.nextLine();

                if(name == employees[i]){
                    System.out.println(employees[i]);
                }

        }
    }
}
