public class JavaString {

    public static void main(String []args){

        String greeting ="hello";
        // string length
        System.out.println("length: "+ greeting.length());

        //uppercase $ lowercase
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());


        //finding a string
        String letters = "abcdefghijklmnopqrstuvwxyz";

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        // you can use the + sign to concate two string variable, you can use concat()

        String firstName = "Taiwo";
        String lastName = " Kolapo";

        System.out.println(firstName.concat(lastName));

        // double quote is used for strings, when a sentence with double quote comes up, we use the backward slash to escape character.
        String let = "We are a \"People\". ";
        System.out.println(let);
        /*
        \n	New Line
\r	Carriage Return
\t	Tab
\b	Backspace
\f	Form Feed
         */


    }
}
