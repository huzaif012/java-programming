import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter Number to validate if its prime or not:");
        int num = obj.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
