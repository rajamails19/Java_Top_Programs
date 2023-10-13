package sample_1;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {

        int count, num1 = 0, num2 = 1;
        System.out.println("Please enter the input:");
        
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }

}


/*

o/p:

Please enter the input:
4
Fibonacci Series of 4 numbers:0 1 1 2 

*/

