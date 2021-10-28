import java.util.Scanner;

public class Vowel_switch {
   public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter alphabet");
       char alphabet = obj.nextLine().charAt(0);    
       switch (alphabet) {
           case 97 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 101 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 105 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 111 : 
                System.out.println("The entered alphabet is vowel");
                break;
           case 117 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 65 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 69 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 73 : 
                System.out.println("The entered alphabet is vowel");
                break;
            case 79 : 
                System.out.println("The entered alphabet is vowel");
                break;
           case 85 : 
                System.out.println("The entered alphabet is vowel");
                break;
       
       
           default:
           System.out.println("Entered alphabet is not a vowel");
               break;
       }
   } 
}
