package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class OddEvenTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, Integer.MAX_VALUE })
	void givenANumber_whenIsEvenIsCalled_thenTrueIsReturnedForEvenNumbers(int number) {
		OddEven oddEven = new OddEven();
		assertTrue(oddEven.isNumberEven(number));
	}

}
