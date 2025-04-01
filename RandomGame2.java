import java.util.Random;
import java.util.Scanner;

public class RandomGame2 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Welcome to Random ");

        System.out.println("Enter Your Name");
        String name = scanner.nextLine();

        System.out.println("Welcome" + name);
        
        System.out.println("Are your ready to play? /n Response should be Yes or No");
        String playStatus = scanner.nextLine();

        
        

        if(playStatus.equalsIgnoreCase("Yes") ){
            Random random = new Random();
            int number = random.nextInt(10);

            System.out.println("Guess a Number");
            int userInput;
            int i =0;
            boolean guessedCorrectly = true;

            while (i <5 ) {
                System.out.println("try again");
                userInput = scanner.nextInt();
                if(userInput == number){
                    System.out.println("correct!");
                    break;
                }
                else{
                    System.out.println("Try again the correct answer is"+ number);
                }
                    i++;

                    if(!guessedCorrectly){
                        System.out.println("GAME OVER the correct number was" + number);
                    }



                
            }

           


        }
        else{
            System.out.println("You just exited the game");
        }

     scanner.close();

    }
}
