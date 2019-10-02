package practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ComandoCp {

	public static void main(String[] args) throws FileNotFoundException {

		// Crea un programa que simule el comportamiento de cp, el primer argumento es
		// la ruta
		// del fichero a copiar, el segundo argumento es la ruta del fichero copia.
		String ruta = "ficheroAcopiar.txt";
		File fitx = new File(ruta);
		PrintWriter pw = new PrintWriter(fitx);
		pw.write("Hola buenas");
		pw.close();
		cp(ruta, "ArchivoCopiado.txt");

	}

	public static void cp(String rutaFichero, String rutaDestino) throws FileNotFoundException {
		File fitxer = new File(rutaFichero);
		Scanner sc = new Scanner(fitxer);
		ArrayList<String> contenido = new ArrayList<>();
		while (sc.hasNextLine()) {
			contenido.add(sc.nextLine());
		}
		sc.close();
		File nuevoFichero = new File(rutaDestino);
		PrintWriter pw = new PrintWriter(nuevoFichero);
		for (int i = contenido.size() - 1; i >= 0; i--) {
			pw.write(contenido.get(i));
		}
		pw.close();
		System.out.println("Archivo copiado");
	}

}
