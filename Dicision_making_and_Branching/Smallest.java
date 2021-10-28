import java.util.Scanner;

//find smallest of the two
public class Smallest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int c = num1 < num2 ? num1 : num2;
        System.out.println(c + " is a smaller number");
    }
}
