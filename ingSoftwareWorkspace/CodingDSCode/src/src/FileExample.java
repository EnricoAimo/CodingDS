package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {
	
	public static void main(String[] args) { 
		
		// Primo caso, percorso corretto
		System.out.println("Primo test - percorso corretto");
		String path = "../CodingDSCode/src/asset/input.txt";
		leggiFile(path);
		
		// Secondo caso, percorso errato
		System.out.println("Secondo test - percorso errato");
		path = "../asset/input.txt";
		leggiFile(path);
	
	}
	
	public static void leggiFile(String path) { 
    	
    	//Leggiamo un file in base al path che riceviamo in input
        File file = new File(path);
        // Stampiamo il percorso relativo
        System.out.println("file path: " + file.getPath());
        // Stampiamo il percorso assoluto
        System.out.println("file absolutePath: " + file.getAbsolutePath());
        // clausola try-catch per gestire l'eccezione FileNotFoundException 
   	    // che potrebbe verificarsi se il file non viene trovato
        // In questo modo, il codice gestisce eventuali errori 
        // in modo sicuro e affidabile
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            // viene chiamato il metodo scanner.close() per liberare 
            // le risorse utilizzate dalla classe Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
            // Mostro l'eccezione in console
            e.printStackTrace();
        }
        // questo codice dimostra buone pratiche di programmazione 
        // che aiutano a garantire l'affidabilità del software
    }
}
