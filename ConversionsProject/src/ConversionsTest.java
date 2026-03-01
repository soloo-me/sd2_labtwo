// Student name : Solomon Kipkosgei
// Student ID : 3140848

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ConversionsTest {
	
    
    Conversions converter = new Conversions();
    
    @Test
    public void testIntegerToString() {
        assertEquals("100", converter.integerToString(100), "Integer 100 should convert to string '100'");
        assertEquals("-50", converter.integerToString(-50), "Integer -50 should convert to string '-50'");
        assertEquals("0", converter.integerToString(0), "Integer 0 should convert to string '0'");
    }
}