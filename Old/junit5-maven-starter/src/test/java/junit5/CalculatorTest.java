package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void givenTwoNumbers3And4_whenAdditionIsCalled_then7IsReturned() {
		Calculator calculator = new Calculator();
		assertEquals(7, calculator.addition(3, 4));
	}

}