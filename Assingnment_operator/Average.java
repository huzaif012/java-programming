import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Marks of subject 1:");
        float Sub1= obj.nextFloat();
        System.out.println("Enter Marks of subject 2:");
        float Sub2= obj.nextFloat();
        System.out.println("Enter Marks of subject 3:");
        float Sub3= obj.nextFloat();
        float Sum = Sub1 + Sub2 + Sub3;
        float Average= Sum/3;
        System.out.println("Sum:"+Sum+"\nAverage:"+Average);
    }
    
}
