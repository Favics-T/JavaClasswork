import java.util.Scanner;


public class Area {

    public static void main(String[] args){
        double width;
        double heigth;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        width = scanner.nextDouble();

        System.out.println("Enter height ");
        heigth = scanner.nextDouble();

        area = width * heigth;
        System.out.println("Area is:" + area);
        scanner.close();
    }
}
