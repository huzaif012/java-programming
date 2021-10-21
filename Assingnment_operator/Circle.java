import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double pie=3.14285714286;
        System.out.println("Enter the radius of circle:");
        float Radius = obj.nextInt();
        float Diameter = 2 * Radius;
        double Circumference = 2 * pie * Radius;
        double Area = pie * Radius * Radius;
        System.out.println("Diameter:"+Diameter+"\nCircumference:"+Circumference+"\nArea:"+Area);
    }
    
}
