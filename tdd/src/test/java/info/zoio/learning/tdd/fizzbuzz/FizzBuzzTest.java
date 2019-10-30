package info.zoio.learning.tdd.fizzbuzz;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * 类名: FizzBuzzTest <br/>
 *
 * @author Finn <br/>
 * Oct 29, 2019 10:42:13 AM
*/
public class FizzBuzzTest extends TestCase {
	public void testFizzBuzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		Assert.assertEquals("FizzBuzz", fizzBuzz.print(15));
		Assert.assertEquals("Fizz", fizzBuzz.print(3));
		Assert.assertEquals("Buzz", fizzBuzz.print(5));
		Assert.assertEquals("17", fizzBuzz.print(17));
	}
}

	