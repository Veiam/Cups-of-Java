import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class DisabledOnOsTest {

    @Test
    void testOnAllOs() {
        assertTrue(3 > 0);
    }

    @DisabledOnOs(OS.MAC)
    @Test
    void testDisableOnMacOs() {
        assertFalse(0 > 4);
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    void testDisableOnWindowOs() {
        assertFalse(10 > 40);
    }
}