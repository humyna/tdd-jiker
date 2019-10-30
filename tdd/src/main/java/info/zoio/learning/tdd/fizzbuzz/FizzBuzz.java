package info.zoio.learning.tdd.fizzbuzz;

/**
 *
 * 类名: FizzBuzz <br/>
 *
 * @author Finn <br/>
 * Oct 29, 2019 10:43:05 AM
*/
public class FizzBuzz {

	/**
	 * print:打印数字，3的倍数替换成“Fizz”，5的倍数替换成“Buzz”。既能被3整除、又能被5整除的数则替换成“FizzBuzz”. <br/>
	 * @param i
	 * @return
	 * String
	 * @exception
	 * @author Finn
	*/
		
	public String print(int i) {
		if(i%15 ==0 ) return "FizzBuzz";
		if(i%3 ==0 ) return "Fizz";
		if(i%5 ==0 ) return "Buzz";
		return i+"";
			
	}
}

	