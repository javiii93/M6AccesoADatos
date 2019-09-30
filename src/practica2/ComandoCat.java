package practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ComandoCat {

	public static void main(String[] args) throws FileNotFoundException {
		String rutaBuscar = "";
		// SE PUEDE INTRODUCIR LA RUTA MANUALMENTE O DESCOMENTAR EL CODIGO
		// E INTRODUCIRLO POR PANTALLA
		/*
		 * Scanner sc2=new Scanner(System.in);
		 * System.out.println("Introduce la ruta del archivo a visualizar:");
		 * rutaBuscar=sc2.next();
		 */

		rutaBuscar = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles";
		File searchFile = new File(rutaBuscar);
		if (comprobarExiste(searchFile)) {
			if (comprobarSiEsDirectorio(searchFile)) {
				System.out.println("'ruta' no es un fichero, es un directorio");
			} else {
				Scanner sc = new Scanner(searchFile);
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				sc.close();
			}

		} else {
			System.out.println("El archivo a visualizar no existe");
		}

	}

	public static boolean comprobarExiste(File fichero) {
		if (fichero.exists()) {
			return true;
		}
		return false;

	}

	public static boolean comprobarSiEsDirectorio(File fichero) {
		if (fichero.isDirectory()) {
			return true;
		}
		return false;

	}
}
