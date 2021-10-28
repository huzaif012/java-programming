import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num,sum=0,m;
        System.out.println("Enter the number for addition:");
        num = obj.nextInt();
        while(num>0) {      
 m=num%10;    
 sum=sum+m;    
num=num/10;    
        }  
System.out.println("Sum is "+sum);      
        
        }
}
