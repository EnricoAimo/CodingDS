package src;

import java.util.Scanner;

public class InputExample {
	
	public static void main(String[] args) { 
    	
    	// Utilizziamo la classe Scanner di Java per leggere l'input dell'utente. 
        Scanner scanner = new Scanner(System.in);        
       
        System.out.println("Inserisci un numero: ");
        // viene eseguito un controllo per verificare che l'input 
        // sia un intero valido prima di elaborarlo.
        // In questo modo, il codice gestisce eventuali 
        // input non validi in modo sicuro e affidabile. 
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.println("Hai inserito il numero: " + numero);
            // viene chiamato il metodo scanner.close() per liberare 
            // le risorse utilizzate dalla classe Scanner
            scanner.close();             
           
        } else {
            System.out.println("Hai inserito un input non valido.");
            scanner.close();             
        }               
        // questo codice dimostra buone pratiche di programmazione 
        // che aiutano a garantire l'affidabilità del software
    }
}
