
import java.util.Scanner;

public class Count_Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int check_occurrence = in.nextInt();
        int count = 0;
        while (num > 0){
            // by using remainder we get the last digit of the input number.
           long last_digit = num%10;
           if (last_digit == check_occurrence){
               count ++;
           }
           // we divide the number by 10 to get the new number after removing the last digit.
           num = num/10;
        }

        System.out.println(count);
    }
}
