package wtn;

import java.util.Scanner;

public class seven {
	public static void main(String args[])
    {
        int x, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        x = s.nextInt();
        while(x > 0)
        {
            n = x% 10;
            sum = sum + n;
            x = x / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
