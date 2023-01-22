import java.util.Scanner;

public class mult_decimal_binary {
    public static void main(String[] args) {
        System.out.println("Enter Decimal Number :-");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println("Enter binary number :- ");
        int binary = sc.nextInt();
        int ans = 0 ;
        int power =  1;
        int final_ans;
        while (binary > 0 )
        {
            int unit_digit = binary % 10;
            ans  += (unit_digit * power);
            binary /= 10 ;
            power *= 2;
        }
        final_ans = decimal * ans;
        System.out.println(final_ans);
    }
}
