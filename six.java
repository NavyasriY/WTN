package wtn;

public class six {
	public static void main(String[] args) {
        int  reversedInteger = 0, remainder, temp;
        int n =Integer.parseInt(args[0]);
        temp = n;
        while( n != 0 )
        {
            remainder = n % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            n  = n/10;
        }
        if (temp == reversedInteger)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}
