package wtn;

import java.util.Scanner;

public class fourth {
	public static void main(String[] args) 
    {
		int n=Integer.parseInt(args[0]);
        if(n > 0)
        {
            System.out.println("The given number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }
    }
}
