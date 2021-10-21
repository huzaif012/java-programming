import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter numbers for addition:");
        a=obj.nextInt();
        b=obj.nextInt();
        sum = a + b;
        System.out.println("Addition is:"+sum);
    }    
}
