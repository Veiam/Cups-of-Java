import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

public class DisabledIfEnvironmentVariableTest {

    @Test
    void testOnAllEnvironmentVariables() {
        assertTrue(3 > 0);
    }

    @DisabledIfEnvironmentVariable(named = "USER", matches = "day")
    @Test
    void testDisabledIfUserMatchesDinesh() {
        assertFalse(0 > 4);
    }

    @DisabledIfEnvironmentVariable(named = "HOME", matches = "/Users/day")
    @Test
    void testDisabledIfHomeMatchesDummyDirectory() {
        assertFalse(10 > 40);
    }
}