package simpleProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=371;
		
		int rem=0;
		
		int result=0;
		
		int originalNumber=0;
		
		originalNumber=number;
		
		while(originalNumber!=0) {
			
			rem=originalNumber%10;
			
			result=result+(rem*rem*rem);
			
			originalNumber=originalNumber/10;
			
		}
         
		if(result == number) {
			System.out.println(number+"armstrong Number");
			System.out.println("armstrong Number")
		}
		else
		{
			System.out.println(number+"Not armstrong number");
		}
	}

}
