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
		 * texto: Yo s�lo puedo mostrarte la puerta, t� eres quien la tiene que
		 * atravesar. Si ejecutas el programa dos veces, �Qu� ocurre? �C�mo lo
		 * solucionamos? me he quedado en la creacion de la array y guardar todo el
		 * contenido del archivo matrix en la arraypara luego escribirlo
		 */
		PrintWriter pw;
		String ruta = "frasesmatrix.txt";
		File matrix = new File(ruta);
		Scanner sc = null;
		ArrayList<String>contenidoFichero=new ArrayList<String>();
		
		if (matrix.exists()) {
			System.out.println("El archivo matrix.txt ya existe");
			 sc = new Scanner(matrix);
			
			
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				contenidoFichero.add(linea);
			}
			sc.close();
			
			pw = new PrintWriter(matrix);
			for (int i=0;i<contenidoFichero.size();i++) {
				pw.write(contenidoFichero.get(i)+" \r\n");
			}
			pw.write("Yo s�lo puedo mostrarte la puerta, t� eres quien la tiene que atravesar \r\n");
		} else {
			matrix.createNewFile();
			System.out.println("se ha creado el archivo matrix.txt en "+matrix.getAbsolutePath());
			pw = new PrintWriter(matrix);
			pw.write("Yo s�lo puedo mostrarte la puerta, t� eres quien la tiene que atravesar \r\n");
		}

		pw.close();

	}

}
