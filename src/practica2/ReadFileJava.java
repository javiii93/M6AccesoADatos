package practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileJava {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String ruta = "C:\\Users\\super\\eclipse-workspace\\M06\\src\\practica2\\ReadFileJava.java";
		File file = new File(ruta);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			//aqui lo leo por palabras
			System.out.println(sc.next());
		}
		sc.close();
	}

}
