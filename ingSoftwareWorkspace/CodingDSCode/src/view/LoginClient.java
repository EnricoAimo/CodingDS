package view;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import controller.Controller;
import model.Utente;
public class LoginClient {

	public static void main(String[] args) {	
		
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Inserisci l'username");
		String username = scanner.nextLine();		
		System.out.println("Hai inserito: " + username);
		
		System.out.println("Inserisci la password");
		String password = scanner.nextLine();		
		System.out.println("Hai inserito: " + password);
		
		Utente utente = new Utente(username);
		Controller controller = new Controller();
		try {
			String passMd5 = controller.eseguiMD5(password);
			utente.setPassword(passMd5);
			System.out.println("Md5: " + passMd5);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		scanner.close();
		
		
		try {
			if(controller.eseguiMD5(password).equals(utente.getPassword())) {
				System.out.println("Login ok");
			}else{
				System.out.println("Login Ko");
			}
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	}

}
