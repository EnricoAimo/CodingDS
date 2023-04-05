package controller;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class Controller {

	public String eseguiMD5(String password) throws UnsupportedEncodingException {		
		MessageDigest md;
		String result = null;
		try {
			byte[] bytesOfMessage = password.getBytes("UTF-8");
			md = MessageDigest.getInstance("MD5");
			byte[] theMD5digest = md.digest(bytesOfMessage);
			result = new String(theMD5digest, StandardCharsets.UTF_8);			
		} catch (NoSuchAlgorithmException e) {			
			e.printStackTrace();
		}		
		return result;
	}
}
