// Student name : Solomon Kipkosgei
// Student ID : 3140848

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ConversionsTest {
	
    
    Conversions converter = new Conversions();
    
    @Test
    public void testStringToInteger() {
        assertEquals(42, converter.stringToInteger("42"), "String '42' should convert to integer 42");
        assertEquals(-15, converter.stringToInteger("-15"), "String '-15' should convert to integer -15");
        assertEquals(0, converter.stringToInteger("0"), "String '0' should convert to integer 0");
    }
}