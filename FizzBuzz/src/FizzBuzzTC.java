import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTC {
	
	@Test
	public void testFizzBuzzthat1returns1() {
		String result = Main.FizzBuzz(1);
		assertEquals("1",result);
	}
	
	@Test
	public void testFizzBuzzthat3returnsFizz() {
		String result = Main.FizzBuzz(3);
		assertEquals("Fizz",result);
	}
	
	@Test
	public void testFizzBuzzthat2returns2() {
		String result = Main.FizzBuzz(2);
		assertEquals("2",result);
	}
	
	@Test
	public void testFizzBuzzthat6returnsFizz() {
		String result = Main.FizzBuzz(6);
		assertEquals("Fizz",result);
	}
}
