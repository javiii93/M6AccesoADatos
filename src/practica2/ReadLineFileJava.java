package practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLineFileJava {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String ruta = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\ReadLineFileJava.java";
		File file = new File(ruta);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			//aqui lo leo por lineas
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}