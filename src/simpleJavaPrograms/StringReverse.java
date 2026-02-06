package simpleJavaPrograms;

public class StringReverse {
	
	public String stringReverse(String actualString) {
		
		String reversedString = "";
		for(int i=actualString.length()-1; i>=0; i--) {
			reversedString += actualString.charAt(i);
		}
		
		return reversedString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverse sr = new StringReverse();
		System.out.println(sr.stringReverse("Midhilesh"));

	}

}
