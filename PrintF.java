public class PrintF
{
    public static void main(String[] args){

        //printf is a method used to format output

        //%[flags][width][.precision][specifier-character]

        String name = "Faith";
       char firstName = 'F';

       //printing out a String, without concatenating
        System.out.printf("Hello %s\nand your name starts with %c\n", name,firstName);

        //printf for integer is D in other words %d.
        // printf for double is %f.

        //precision with printf tells how many digit after datatype we want to print out

        double score = 3.0;
        System.out.printf("%.8f\n", score);

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        System.out.printf("%04d\n",num1);
        System.out.printf("%05d\n",num2);
        System.out.printf("%05d\n",num3);

        // %04d pad the integer left wise with 4 zeros
    }}
