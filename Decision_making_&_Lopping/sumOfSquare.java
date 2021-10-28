public class sumOfSquare {
    public static void main(String[] args) {
        int num=10, temp=0;
        while(num>0){
            int n=num*num;
            temp += n;
            n=0;
            num--;
        }
        System.out.println("sum of first 10 integer:"+temp);
    }
    
}
