import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        
        String names = "Taiwo Kolapo";

        int length = names.length();
        char letter = names.charAt(0);
        int index = names.indexOf(" ");

        System.out.println(names);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.printf("%S", names);

        names = names.toUpperCase();
        names = names.toLowerCase();
        names = names.trim();
        names = names.replace("n", "s");
        System.out.println(names.isEmpty());

    //    if (names.isEmpty()) {
    //     System.out.println("Enter Your name before to get a valid id");
        
    //    }
    //    else{
    //     System.out.printf("%S Welcome onBoard", names);
    //    }

       //Substring method is used to extract a portion of a string .substring(Statr,end)

       Scanner scanner = new Scanner (System.in);

       String email = "taiwo@gmail.com";
       String username = email.substring(0,4);
       String domain = email.substring(4, 8);



       

       System.out.println("Enter your mail");
       String userEmail = scanner.nextLine();

       if(userEmail.contains("@")){
        String userName = userEmail.substring(0, userEmail.indexOf("@"));
        String domains = userEmail.substring(userEmail.indexOf("@")+ 1);

        System.out.printf("Your username is %S", userName);
        System.out.printf("Your domain name is %S",domains);
       }

       else{
        System.out.println("enter a valid mail, that contains @");
       }

      

       

    


    //    System.out.println(domain);
    //    System.out.println(username);



    scanner.close();
    }
}