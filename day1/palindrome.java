package week1.day1;

public class palindrome {
	
	public static void main(String[] args) {
        int input = 121; 
        int output = 0; 

       
        for (int i = input; i > 0; i /= 10) {
            int digit = i % 10;
            output = output * 10 + digit;
            System.out.println("i: " + i + ", digit: " + digit + ", output: " + output);
        }

        
        if (input == output) {
            System.out.println("Input: " + input + " -> Output: It is a Palindrome");
        } else {
            System.out.println("Input: " + input + " -> Output: It is not a Palindrome");
        }
    }
}