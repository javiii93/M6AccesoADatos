package practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribeLineas {

	public static void main(String[] args) throws FileNotFoundException {
//escribeLineas.txt. Escribe 10 lineas separadas para un salto de linea cada una.
		String ruta = "escribeLineas.txt", linea = "\r\nLinea numero ";
		File escribe = new File(ruta);
		PrintWriter pw = new PrintWriter(escribe);
		for (int i = 1; i <= 10; i++) {

			pw.write(linea + i);

		}
		System.out.println("Escribelineas.txt creado en " + escribe.getAbsolutePath());
		pw.close();

	}

}
