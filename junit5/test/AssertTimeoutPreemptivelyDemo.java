import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.Duration;

class AssertTimeoutPreemptivelyDemo {

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion fails with an error message similar to:
        // execution timed out after 10 ms
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }
}
