package junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo {

	@RepeatedTest(name = "{displayName} - {currentRepetition}/{totalRepetitions}", value = 5)
	@DisplayName("Repeated test")
	public void repeatedTestWithDisplayName() {
		assertTrue(0 < 5);
	}

}