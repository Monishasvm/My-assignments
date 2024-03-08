package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7;
		//boolean IsPrimeNumber= true;
		for (int i =1; i <=num; i++) {
			if(!((num%i)==0)) {
				//IsPrimeNumber =false;
				System.out.println("Prime"+num);
				break;
			}
				
		}
		
		}
		
	}



