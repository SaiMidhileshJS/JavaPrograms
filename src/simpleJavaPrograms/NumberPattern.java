package simpleJavaPrograms;

public class NumberPattern {
	
	public static void printNumberPattern(int number) {
		for(int i=1; i<=number; i++) {
			
			for(int j=1; j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void printSameNumberPattern(int number) {
		for(int i=1; i<=number; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void printOddNumberPattern(int number) {
		for(int i=1; i<=number;i++) {
			
			if(i%2==0) {
				for(int j=1; j<=i; j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			else
				System.out.println(i);
			
		}
	}
	
	public void numberReverse(int number) {
		
		int reversedNumber = 0;
		while(number>0) {
			reversedNumber *= 10;
			reversedNumber = reversedNumber + number % 10;
			number /= 10;
		}
		
		System.out.println(reversedNumber);
	}
	
	public static void main(String[] args) {
		printNumberPattern(5);
		printSameNumberPattern(5);
		printOddNumberPattern(10);
		
		NumberPattern np = new NumberPattern();
		np.numberReverse(59989);
	}

}
