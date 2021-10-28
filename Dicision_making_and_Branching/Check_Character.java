import java.util.Scanner;

public class Check_Character {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the charachter:");
        char a = obj.nextLine().charAt(0);
    
    if(a>=97 && a<=122){
        System.out.println("Entered character is alphabet");
    }else if(a>=48 && a<=57){
        System.out.println("Entered character is numbers");
    }else{
        System.out.println("Enterd character is sysmbol");
    }
    }
    
}
