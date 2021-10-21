import java.io.DataInputStream;
import java.io.IOException;

public class dataInputStream {
    public static void main(String[] args)throws IOException {
        int a;
        String s1;
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter an integer:");
        s1 = dis.readLine();
        a = Integer.parseInt(s1);
        int Square = a * a;
        System.out.println("Square of Integer:"+Square);
    }
}
