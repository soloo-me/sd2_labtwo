// Student name : Solomon Kipkosgei
// Student ID : 3140848

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ConversionsTest {
	public double euroToDollar(double euro) {
	    return euro * 1.08;
	}
    
    Conversions converter = new Conversions();
    
    @Test
    public void testEuroToDollar() {
        assertEquals(10.80, converter.euroToDollar(10.0), 0.01, "10 euros should be approximately 10.80 dollars");

        assertEquals(0.0, converter.euroToDollar(0.0), 0.01, "0 euros should be 0 dollars");
        
        assertEquals(-5.40, converter.euroToDollar(-5.0), 0.01, "Negative euros should convert to negative dollars");
    }
}