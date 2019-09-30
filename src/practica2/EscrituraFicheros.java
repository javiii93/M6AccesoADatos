package practica2;

import java.io.FileWriter;

public class EscrituraFicheros {

	public static void main(String[] args) {

		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };


		FileWriter fichero = null;
		try {

			fichero = new FileWriter("fichero_escritura.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepci�n: " + ex.getMessage());
		}
	}
}