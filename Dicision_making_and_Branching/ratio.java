import java.util.Scanner;

public class ratio {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float ratio;
        System.out.println("Enter the values of A,B,C,D");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();
        if (c-d  != 0)  /* Execute statement block */                                        
       {                                                     
           ratio = (float)(a+b)/(float)(c-d);                  
           System.out.println("Ratio:"+ratio);//(\"Ratio = %f\\n\", ratio);                      
       }      
    }
    
}
