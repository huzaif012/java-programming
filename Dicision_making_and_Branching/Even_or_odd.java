import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = obj.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is a even number");
        else
            System.out.println(num + " is a odd number");
    }

}
