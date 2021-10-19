package com.mproject.kamali;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=5;
		int div=2;
		int count=0;
	
		while(div<=num/2)
		{
			if(num%div==0) {
				count++;
			
		}
			div++;
	}

		if(count==0)
		{
			System.out.println(" PrimeNumber");
		}
		else
			System.out.println("Not PrimeNumber");
			
		}
}
