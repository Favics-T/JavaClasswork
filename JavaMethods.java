/*
 * java method is a state of statement that perform a certain action and are declared within a class.
 * 
 * Syntax for writing a java method
 * 
 * accessSpecifier returnType methodName(parameterType1 parameterName1,parameterType2 parameterName2..){
 * //Method body - statements to perform a specific task
 * Return statement(if applicable)
 * }
 * 
 * void indicates no return type
 * 
 */

//  write a java methid that return the sum of two values){

public class JavaMethods{

    public static int addNumbers(int a, int b){
        int sum = a +b;
        return sum;
    }

    public static double getArea(double length, double width){
        double area = length * width;
        return area;
    }
    
    public static void main(String[]args){
        int result = addNumbers(10, 90) ;

        double area = getArea(90.0,8.5);
        
        System.out.println(result);
        System.out.println(area);

    }
    

}