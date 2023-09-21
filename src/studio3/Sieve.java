package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the max number?");
		
		int end = in.nextInt()+1;
		
		boolean[] array = new boolean[end];
		
		for (int all = 0; all < array.length; all++)
			array[all] = true;
		
		for(int n = 2; n < array.length; n++)
		{
			for(int m = 1; m*n+n < array.length; m++)
			{
				array[m*n+n] = false;
			}
		} 
		
		end--;
		System.out.println("The prime numbers in 0 - " + end + " are:");
		
		for(int n =2; n < array.length; n++)
		{
			if (array[n] == true && n!= 0)
				System.out.println(n + " ");
		}
	
	}

}
