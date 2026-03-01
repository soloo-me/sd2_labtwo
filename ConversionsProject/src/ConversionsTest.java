// Student name : Solomon Kipkosgei
// Student ID : 3140848

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ConversionsTest {
	
    
    Conversions converter = new Conversions();
    
    @Test
    public void testSwitchCase() {
        assertEquals("hELLO wORLD", converter.switchCase("Hello World"), "Mixed case should be switched");
        assertEquals("java", converter.switchCase("JAVA"), "Uppercase should become lowercase");
        assertEquals("TESTING", converter.switchCase("testing"), "Lowercase should become uppercase");
    }
}