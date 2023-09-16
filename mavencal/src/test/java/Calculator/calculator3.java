package Calculator;
import org.junit.*;

public class calculator3 {
	@Test
	public void testAdd() { 
	int a = 15; int b = 20; 
	int expectedResult = 35;
	//Act 
	long result = calculator.add(a, b);
	//Assert
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testSubtract() {
	int a = 25; int b = 20; 
	int expectedResult = 5; 
	long result = calculator.sub(a, b);
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMultiply() {
	int a = 10; int b = 25;
	long expectedResult = 250;
	long result = calculator.mul(a, b);
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() {
	int a = 56; int b = 10; 
	double expectedResult = 5.6; 
	double result = calculator.div(a, b);
	Assert.assertEquals(expectedResult, result,0.00005); 
	}
}	