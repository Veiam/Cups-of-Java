import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

public class DisabledIfSystemPropertyTest {

    @Test
    void testOnAllSystemProperties() {
        assertTrue(3 > 0);
    }

    @DisabledIfSystemProperty(named = "user.name", matches = "day")
    @Test
    void testDisabledIfUserNameMatchesDinesh() {
        assertFalse(0 > 4);
    }

    @DisabledIfSystemProperty(named = "os.name", matches = "Windows")
    @Test
    void testDisabledIfOperatingSystemMatchesWindows() {
        assertFalse(10 > 40);
    }
}
