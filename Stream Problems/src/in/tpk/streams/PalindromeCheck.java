package in.tpk.streams;

public class PalindromeCheck {

	public static void main(String[] args) {
		String s = "MalayalaM";
		boolean b = s.toLowerCase().contentEquals(new StringBuffer(s.toLowerCase()).reverse());
		System.out.println(b);
		 if (b) {
	            System.out.println(s + " is a palindrome");
	        } else {
	            System.out.println(s + " is not a palindrome");
	        }
	}

}
