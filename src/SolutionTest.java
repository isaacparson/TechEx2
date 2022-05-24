import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getResult() throws IOException {
        assertEquals("10",Solution.getResult("STWSWTPPTPTTPWPP", "Human"));
    }
}