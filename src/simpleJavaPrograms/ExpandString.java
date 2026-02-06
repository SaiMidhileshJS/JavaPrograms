package simpleJavaPrograms;

public class ExpandString {
	
	// a3b2c4d0 -> aaabbcccc
	
	public String expandString(String actualString) {
		String expandedString = "";
		
		for(int i=0; i<actualString.length(); i+=2) {
			char charValue = actualString.charAt(i);
			int numberValue = Character.getNumericValue(actualString.charAt(i+1));
			
			for(int j=1; j<=numberValue; j++)
				expandedString += charValue;
		}
		
		return expandedString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExpandString es = new ExpandString();
		System.out.println(es.expandString("a3b0c3d0"));

	}

}
