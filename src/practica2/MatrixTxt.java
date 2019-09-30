package practica2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixTxt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que escriba en un fichero llamado frasesMatrix.txt el
		 * texto: Yo sólo puedo mostrarte la puerta, tú eres quien la tiene que
		 * atravesar. Si ejecutas el programa dos veces, ¿Qué ocurre? ¿Cómo lo
		 * solucionamos?
		 * me he quedado en la creacion de la array y guardar todo el contenido del archivo matrix en la arraypara luego escribirlo*/
		PrintWriter pw;
		String ruta = "frasesmatrix.txt";
		File matrix = new File(ruta);
		ArrayList<String>contenidoFichero=new ArrayList<String>();
		
		if (matrix.exists()) {
			System.out.println("El archivo matrix.txt ya existe");
			Scanner sc = new Scanner(matrix);
			pw = new PrintWriter(matrix);
			
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				contenidoFichero.add(linea);
			}
			sc.close();
			
			
			for (int i=0;i<contenidoFichero.size();i++) {
				pw.write(contenidoFichero.get(i)+"\n");
			}
			pw.write("Yo sólo puedo mostrarte la puerta, tú eres quien la tiene que atravesar");
		} else {
			matrix.createNewFile();
			System.out.println("se ha creado el archivo matrix.txt");
			pw = new PrintWriter(matrix);
			pw.write("Yo sólo puedo mostrarte la puerta, tú eres quien la tiene que atravesar");
		}

		pw.close();

	}

}
