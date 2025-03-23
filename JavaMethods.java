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
 * java has two kind of method, we have the predefined and user-defined
 * 
 *  predefined are already in java class library e.g - System.out.println(),Math.max()..
 *  it is an inbuild java function
 * 
 * User-Defined Methods - Thses are methods that you write yourself to perform specific tasks within your program.
 * They are defined within classes and are typically used or encapsulate functionality and improve code reusabilty.. 
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
// Based on functionality- within user-defined methods, there are several other classifications based on their characterictics:
/*
 * Instance methods:
 * associated with an instance of a class, they can access instance variables and are called on an object of the class
 * 
 * characterictics of instance variable
 * instance methods have access to instance variables(also known as field or properties) of the class.
 * They can manipulate the state of the object they belong to.
 * 
 * this keyword refer to the present instance of an object
 * 
 * Inside an instance method, the this keyword refers to the current instance of the class. It's often used to differentiate between instance variables and parameters with the same name.
Non-static Context:

Instance methods are called in the context of an object. They can't be called without creating an instance of the class.
Declaration and Invocation:

Instance methods are declared without the static keyword.
 */

    }
    

}