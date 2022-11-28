package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CsvFileSourceTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/capitals.csv", numLinesToSkip = 1)
	void testWithCsvFileSource(String country, String capital) {
		assertNotNull(country);
		assertNotNull(capital);
	}

}
