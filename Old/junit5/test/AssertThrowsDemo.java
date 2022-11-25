import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.IOException;

class AssertThrowsDemo {

	@Test
	public void testAssertThrows() {
		assertThrows(ArithmeticException.class, () -> divide(1, 0));
	}

	@Test
	public void testAssertThrowsWithMessage() {
		assertThrows(IOException.class, () -> divide(1, 0), "Division by zero !!!");
	}

	@Test
	public void testAssertThrowsWithMessageSupplier() {
		assertThrows(IOException.class, () -> divide(1, 0), () -> "Division by zero !!!");
	}

	private int divide(int a, int b) {
		return a / b;
	}

}
