import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnabledIfEnvironmentVariableTest {

    @Test
    void testOnAllEnvironmentVariables() {
        assertTrue(3 > 0);
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "day")
    @Test
    void testEnabledIfUserMatchesDinesh() {
        assertFalse(0 > 4);
    }

    @EnabledIfEnvironmentVariable(named = "HOME", matches = "/Users/day")
    @Test
    void testEnabledIfHomeMatchesDummyDirectory() {
        assertFalse(10 > 40);
    }
}