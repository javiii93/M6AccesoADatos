package practica2;

import java.io.File;
import java.io.IOException;

public class CreacionDirectorioFile {

	public static void main(String[] args) throws IOException {

		String rutaDirectorio = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles";
		String rutaFichero1 = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles\\fichero1";
		String rutaFichero2 = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles\\fichero2";

		File directorio = new File(rutaDirectorio);
		File file1 = new File(rutaFichero1);
		File file2 = new File(rutaFichero2);
		if (comprobarExiste(directorio)) {
			System.out.println("El archivo " + directorio.getName() + "ya existe");
		} else {
			directorio.mkdir();
			System.out.println("DIRECTORIO myFiles CREADO");
		}

		if (comprobarExiste(file1)) {
			System.out.println("El archivo " + file1.getName() + " ya existe");
		} else {
			file1.createNewFile();
			System.out.println(file1.getName() + " CREADO");
		}
		if (comprobarExiste(file2)) {
			System.out.println("El archivo " + file2.getName() + " ya existe");
		} else {
			file2.createNewFile();
			System.out.println(file2.getName() + " CREADO");
		}

		file2.renameTo(
				new File("C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles\\ficheroRenombrado"));
		System.out.println("EL FICHERO2 HA SIDO RENOMBRADO");

		mostrarArray(directorio);
		// aqui mostramos los ficheros del directorio
		System.out.println("--------------------");

		file1.delete();
		// borra el fichero1
		mostrarArray(directorio);
		// aqui volvemos a mostrar los ficheros del directorio
		System.out.println("--------------------");

	}

	public static boolean comprobarExiste(File fichero) {
		if (fichero.exists()) {
			return true;
		}
		return false;

	}

	public static void mostrarArray(File directorio) {
		System.out.println("Listando ficheros de " + directorio.getName());
		// metodo para mostrar el directorio
		String[] ficherosDirectorio = directorio.list();
		for (int i = 0; i < ficherosDirectorio.length; i++) {
			System.out.println(ficherosDirectorio[i]);
		}

	}

}
