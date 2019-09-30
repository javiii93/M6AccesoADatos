package practica2;

import java.io.File;
import java.io.IOException;

public class CreacionDirectorioFile {
	

	public static void main(String[] args) throws IOException {
		// Realiza un programa que cree un directorio ("myFiles"). Crea dos ficheros
		// ("fichero1", "fichero2").
		// Renombra "fichero2" -> "ficheroRenombrado". Lista el contenido de "MyFiles".
		// Borra "fichero1".Lista el contenido de "MyFiles"
		String rutaDirectorio = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles";
		String rutaFichero1 = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles\\fichero1";
		String rutaFichero2 = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles\\fichero2";

		File directorio = new File(rutaDirectorio);
		File file1 = new File(rutaFichero1);
		File file2 = new File(rutaFichero2);
		directorio.mkdir();
		System.out.println("DIRECTORIO myFiles CREADO");
		if(comprobarExiste(file1)) {
			System.out.println("El archivo ya existe");
		}else {
			file1.createNewFile();
		}if(comprobarExiste(file2)) {
			System.out.println("El archivo ya existe");
		}else {
			file2.createNewFile();
		}
		
		
		System.out.println("FICHEROS CREADOS");
		file2.renameTo(
				new File("C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\myFiles\\ficheroRenombrado"));
		
		mostrarArray(directorio);
		//aqui mostramos los ficheros del directorio
		System.out.println("--------------------");
		
		file1.delete();
		//borra el fichero1
		mostrarArray(directorio);
		//aqui volvemos a mostrar los ficheros del directorio
		System.out.println("--------------------");

	}
	public static boolean comprobarExiste(File fichero) {
		if(fichero.exists()) {
			return true;
		}
		return false;
		
	}

	public static void mostrarArray(File directorio) {
		//metodo para mostrar el directorio
		String[] ficherosDirectorio = directorio.list();
		int cantidad = ficherosDirectorio.length;
		for (int i = 0; i < cantidad; i++) {
			System.out.println(ficherosDirectorio[i]);
		}

	}

}
