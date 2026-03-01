// Student name : Solomon Kipkosgei
// Student ID : 3140848

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ConversionsTest {
	
    
    Conversions converter = new Conversions();
    
    @Test
    public void testDollarToEuro() {
        // Test positive value (using approximate rate 0.93)
        assertEquals(9.30, converter.dollarToEuro(10.0), 0.01, "10 dollars should be approximately 9.30 euros");
        
        // Test zero
        assertEquals(0.0, converter.dollarToEuro(0.0), 0.01, "0 dollars should be 0 euros");
        
        // Test negative value
        assertEquals(-4.65, converter.dollarToEuro(-5.0), 0.01, "Negative dollars should convert to negative euros");
    }
}