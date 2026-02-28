import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Conversions
 * Name: Solomon Kipkosgei
 * Student Number: 3140848
 */

public class ConversionsTest {

    @Test
    public void testEuroToDollar() {
        Conversions conv = new Conversions();
        assertEquals(1.09, conv.euroToDollar(1.0), 0.01);
        assertEquals(0.0, conv.euroToDollar(0.0), 0.01);
        assertEquals(-1.09, conv.euroToDollar(-1.0), 0.01);
    }

    // Add more tests as you go
}