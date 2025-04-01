import java.util.Scanner;


public class WhileLoop {

    public static void main(String []args){

         /*
     * while loop = repeat some code foreever while some condition remains true
     */

     Scanner scanner = new Scanner(System.in);

     String names="";

     
     while(names.isEmpty()){
        System.out.println("Enter your Name");
        names = scanner.nextLine();
     }

     System.out.printf("Hello %s !",names);
     System.out.println("My Name is Kolapo faith Taiwo");
     System.out.println("You are playing a game");
    }

    GetSet getset = new GetSet();

    getset.setAge(9);

}
