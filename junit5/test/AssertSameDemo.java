import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertSameDemo {

	@Test
	public void testAssertSameWithSameObject() {
		String actual = "hello";
		String expected = "hello";
		assertSame(expected, actual);
	}

	@Test
	public void testAssertSameWithDifferentObject() {
		String actual = "hello";
		String expected = "hell";
		assertSame(expected, actual);
	}

	@Test
	public void testAssertSameWithDifferentObjectAndMessage() {
		String actual = "hello";
		String expected = "hell";
		assertSame(expected, actual, "The actual value is not same as expected value");
	}

	@Test
	public void testAssertSameWithDifferentObjectAndMessageSupplier() {
		String actual = "hello";
		String expected = "hell";
		assertSame(expected, actual, () -> "The actual value is not same as expected value");
	}

}
