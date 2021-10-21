import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double pie=3.14285714286;
        System.out.println("Enter the radius of sphere:");
        float Radius = obj.nextInt();
        double Volume = 4 / 3 * pie * Radius * Radius * Radius;
        double Area = 4 * pie * Radius * Radius;
        System.out.println("Area:"+Area+"\nVolume:"+Volume);
    }
    
}
