package coding;

public class PalindromeNumber {

	public static void main(String[] args) {

		boolean flag = isPalindrome(128);
		
		System.out.println(flag);
		
	}
	
	private static Boolean isPalindrome(int x) {
		
		String num = Integer.toString(x);
		char[] numArr = num.toCharArray();
		String resNum = "";
		
		for(int i = numArr.length - 1; i >= 0; i--) {
			resNum+=numArr[i];
		}
		
		return resNum.equalsIgnoreCase(num);
	}

}
