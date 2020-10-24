import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTC {
	
	@Test
	public void testFizzBuzzthatreturns1() {
		String result = Main.FizzBuzz(1);
		assertEquals("1",result);
	}
	
	@Test
	public void testFizzBuzzthatreturnsFizz() {
		String result = Main.FizzBuzz(3);
		assertEquals("Fizz",result);
	}
	
	@Test
	public void testFizzBuzzthatreturns2() {
		String result = Main.FizzBuzz(2);
		assertEquals("2",result);
	}
}
