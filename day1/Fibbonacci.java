package week1.day1;

public class Fibbonacci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		int range = 10;
		
		System.out.println("First number :" + firstNum + "\n" + "second number :" + secNum);
		
		for (int i = 0; i < range ; i++)
		{
			sum = firstNum + secNum;
			
			System.out.println("Fib series:" + sum);
			
			firstNum = secNum;
			
			secNum = sum;
		}
	}


	}


