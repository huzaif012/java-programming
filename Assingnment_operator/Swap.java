import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("A:");
        int a = obj.nextInt();
        System.out.println("B:");
        int b = obj.nextInt();
        System.out.println("Before Swap");
        System.out.println("A:"+a+"\nB:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap");
        System.out.println("A:"+a+"\nB:"+b);
    }
    
}
