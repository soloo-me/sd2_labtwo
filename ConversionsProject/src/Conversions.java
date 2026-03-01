// Student name : Solomon Kipkosgei
// Student ID : 3140848

public class Conversions {
    
	public double euroToDollar(double euro) {
	    return euro * 1.08;
	}
    
	public double dollarToEuro(double dollar) {
	    return dollar * 0.93;
	}
    
	public int stringToInteger(String val) {
	    return Integer.parseInt(val);
	}
    

	public String integerToString(int val) {
	    return String.valueOf(val);
	}
    
	public String switchCase(String input) {
	    StringBuilder result = new StringBuilder();
	    for (char c : input.toCharArray()) {
	        if (Character.isUpperCase(c)) {
	            result.append(Character.toLowerCase(c));
	        } else {
	            result.append(Character.toUpperCase(c));
	        }
	    }
	    return result.toString();
	}
}