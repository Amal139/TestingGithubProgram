package simpleProgram;

public class FebonaciSeries {

	public static void main(String[] args) {
		
		int num1=0;
		
		int num2=1;
		
		int nextNum;
		
		for(int i=1;i<=7;i++) {
			nextNum=num1+num2;
			num1=num2;
			num2=nextNum;
			
			System.out.print(num1+" ");
		}

	}

}
