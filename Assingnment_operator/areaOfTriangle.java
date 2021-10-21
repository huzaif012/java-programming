import java.util.Scanner;

/**
 * areaOfTriangle
 */
public class areaOfTriangle {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter breadth:");
        int breadth = obj.nextInt();
        System.out.println("Enter height:");
        int height = obj.nextInt();
        double areaOfTriangle = 0.5 * breadth * height;
        System.out.println("Area of Triangle:" + areaOfTriangle);
    }
}