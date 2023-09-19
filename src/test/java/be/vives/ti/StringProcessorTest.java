package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {
    @Test
    void appendIfMissingWithSuffix() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("Hallo!", "!");
        assertEquals(result, "Hallo!");
    }

    @Test
    void appendIfMissingWithoutSuffix() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("Hallo", "!");
        assertEquals(result, "Hallo!");
    }
}
