
public class Main {

	public static void main(String[] args) {
		
	}

	public static String FizzBuzz(int i) {
		if(i % (3*5) == 0) {
			return "FizzBuzz";
		}
		if(i % 3 == 0)
		{
			return "Fizz";
		}
		if(i % 5 == 0)
		{
			return "Buzz";
		}	
		return Integer.toString(i);
	}
	
}
