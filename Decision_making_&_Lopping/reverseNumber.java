import java.io.DataInputStream;
import java.io.IOException;

public class reverseNumber {
    public static void main(String[] args) throws IOException {
        DataInputStream obj = new DataInputStream(System.in);

        System.out.println("Enter number:");
        int num = obj.readInt();
        int rev_num = 0;
        while (num > 0){
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
            System.out.println("Reversed number:"+num);
    }
    
}
