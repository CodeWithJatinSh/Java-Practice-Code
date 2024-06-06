import java.util.Scanner;

public class Reverse_of_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long ans = 0;
        while (num > 0){
            long last_digit = num%10;
            num = num/10;
            ans = ans*10 + last_digit;
            /* How this works --->

               suppose we have num = 1234

               Iteration 1 -->
               last_digit = 1234 % 10 = 4
               num = 1234/10 = 123
               ans = 0*10 +4 = 4

               Iteration 2 -->
               last_digit = 123 % 10 = 3
               num = 123/10 = 12
               ans = 4*10 + 3 = 43

               Iteration 3 -->
               last_digit = 12 % 10 = 2
               num = 12/10 = 1
               ans = 43*10 + 2 = 432

               Iteration 4 -->
               last_digit = 1 % 10 = 1
               num = 1/10 = 0.1 // num > 0 --> condition failed;
               ans = 432*10 + 1 = 4321

             */
        }
        System.out.println(ans);
    }
}
