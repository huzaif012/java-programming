import java.util.Scanner;

public class tempratureConversion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter temperature in farenhite:");
        float farenhite = obj.nextInt();
        float celsius = (farenhite - 32) * 5 / 9 ;
        System.out.println("Celcius:" +celsius);
    }
    
}
