import java.util.Scanner;

public class Mathematical {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter operator from (+,-,*,/");
        char operator = obj.nextLine().charAt(0);
        System.out.println("Enter First number");
        int num1 = obj.nextInt();
        System.out.println("Enter Second number");
        int num2 = obj.nextInt();
        int ans;
        switch (operator) {
        case '*':
            ans = num1 * num2;
            System.out.println("Answer:" + ans);
            break;
        case '/':
            ans = num1 / num2;
            System.out.println("Answer:" + ans);
            break;
        case '+':
            ans = num1 + num2;
            System.out.println("Answer:" + ans);
            break;
        case '-':
            ans = num1 - num2;
            System.out.println("Answer:" + ans);
            break;
        default:
            System.out.println("Enterd incorrectly");
            System.out.println("Entering format: a+b");
            break;
        }
    }

}
