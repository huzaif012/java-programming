import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println(a + " is a larger number");
            else
                System.out.println(c + "is a larger number");

        } else if (b > c)
            System.out.println(b + " is a larger number");
        else
            System.out.println(c + " is a larger number");
    }

}
