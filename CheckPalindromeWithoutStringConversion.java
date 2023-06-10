package coding;

public class CheckPalindromeWithoutStringConversion {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(123));

	}
	
	private static Boolean isPalindrome(int num) {
		
		//Check if Negative then not a palindrome
		if(num < 0) {
			return false;
		}
		
		int reverse = 0;
		
		int originNum = num;
		
		//logic to obtain the reverse of a number
		while(num > 0) {
			
			/*Modulo Operation returns the digits from the other end and 
			 * reverse is multiplied by 10 to move the digits by places
			 */
			reverse = reverse*10 + num%10;
			num = num/10;		
		}
		
		return reverse == originNum;
	}

}
