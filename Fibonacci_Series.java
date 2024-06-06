import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        /* As we have the first 2 numbers of the series 0 and 1. So we should start
         the count from 2.*/
        int count = 2;
        while(count <= n){
            // temp is used to store the previous value of b, Before calculation.
           int temp = b;
           b = b+a;
           a = temp;
           count ++;
        }
        System.out.println(b);
    }
}
