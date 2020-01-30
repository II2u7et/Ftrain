package ftrain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	void testSumFunction() {
		
		Calculation cal = new Calculation();
		
		int result = cal.sum(1,2);
		
		assertEquals(3, result);
		
	}
	
	@Test
	void testSumFunctionWithMath() {
		
		Calculation cal = new Calculation();
		
		int num1 = 3,
			num2 = 4,
			sum = num1 + num2,
			result = cal.sum(num1,num2);
		
		assertEquals(sum, result);
		
	}

}
