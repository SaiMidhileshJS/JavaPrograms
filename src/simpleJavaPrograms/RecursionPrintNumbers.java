package simpleJavaPrograms;

public class RecursionPrintNumbers {
	
	public static int printNumbers(int number) {
		if(number==0) {
			return 0;
		}else {
			printNumbers(number-1);
			System.out.println(number);
		return 0;		
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbers(10);

	}

}
