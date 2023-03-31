package src.efficienza;

public class EsempioConfrontoStringhe {
		
		
		public boolean confrontaStringhe(String s1, String s2) {			
	        
	        char[] s1Chars = s1.toCharArray();
	        char[] s2Chars = s2.toCharArray(); 
			
	        for (int i = 0; i < s1Chars.length; i++) {
	            if (s1Chars[i] != s2Chars[i]) {
	                return false;
	            }
	        }	        
	        return true;
		}

	public boolean confrontaStringheE(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();       
        
		
        for (int i = 0; i < s1Chars.length; i++) {
            if (s1Chars[i] != s2Chars[i]) {
                return false;
            }
        }
        
        return true;
	}

}
