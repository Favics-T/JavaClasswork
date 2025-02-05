public class Tenaary {
    public static void main(String [] args){
        /*
         * tenary operator ? = Return 1 of 2 values if a condition is true
         * 
         * variable = (consition) ? ifTrue : ifFalse;
         * 
         */

         int income = 30000;
         double taxRate = (income >= 400000)? 0.25 : 0.15;

         System.out.println(taxRate);

    }
}
