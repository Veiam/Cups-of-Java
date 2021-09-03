package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class AnimalTest {

	@ParameterizedTest
	@EnumSource(Animal.class)
	void testEnumSource(Animal animal) {
		assertNotNull(animal);
	}

}