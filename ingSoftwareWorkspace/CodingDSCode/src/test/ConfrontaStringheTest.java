package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import classi.*;


public class ConfrontaStringheTest {
	
	String s1="ciaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociao";
	String s2="ciaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaocia123";

	@Test
	public void testConfronto1() {		
		EsempioConfrontoStringhe confronta = new EsempioConfrontoStringhe();		
		boolean result = confronta.confrontaStringhe(s1, s2);		
	    assertEquals(false, result);
	}
	
	@Test
	public void testConfronto2() {		
		EsempioConfrontoStringhe confronta = new EsempioConfrontoStringhe();			
		boolean result = confronta.confrontaStringheE(s1, s2);		
	    assertEquals(false, result);
	}
}
