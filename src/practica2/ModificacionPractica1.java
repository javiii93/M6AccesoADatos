package practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ModificacionPractica1 {
	static Map<String, Float> productos = new HashMap<String, Float>();
	static Scanner sc = new Scanner(System.in);
	static int opcion;
	static boolean salida = true;
	static File ficheroDatos = new File("ficheroDatos.txt");

	public static void main(String[] args) {

		do {
			menu();
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					sc.nextLine();
					System.out.println("1.- INSERTAR");
					insertar();
					break;
				case 2:
					System.out.println("2.- MODIFICAR ");
					if (comprobarSiEstaVacia()) {
						System.out.println("NO SE PUEDE MODIFICAR YA QUE ESTA VACIA");
					} else {
						modificar();
					}
					break;
				case 3:
					System.out.println("3.- ELIMINAR VIDEOJUEGO");
					if (comprobarSiEstaVacia()) {
						System.out.println("NO SE PUEDE ELIMINAR YA QUE ESTA VACIA");
					} else {
						eliminar();
					}
					break;
				case 4:
					System.out.println("4.- MOSTRAR PRODUCTOS");
					if (comprobarSiEstaVacia()) {
						System.out.println("NO SE PUEDE MOSTRAR YA QUE ESTA VACIA");
					} else {
						mostrar();
					}
					break;
				case 5:
					salida = false;
					System.out.println("SALIENDO DEL PROGRAMA");
					break;

				default:
					break;
				}
			} else {
				System.out.println("OPCION NO RECONOCIDA, VOLVER A INTRODUCIR");
				sc.nextLine();
			}

		} while (salida);

	}

	public static void guardarContenidoMapsEnFichero() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(ficheroDatos);
		Iterator it = productos.keySet().iterator();
		String nom;
		while (it.hasNext()) {
			nom = (String) it.next();
			pw.write(nom + productos.get(nom) + "\r\n");
		}
		pw.close();
	}

	public static void guardarContenidoDelFicheroEnMaps() throws FileNotFoundException {
		Scanner sc = new Scanner(ficheroDatos);
		float preu;
		String nombre = "";
		int i = 2;
		boolean sal = true;
		while (sc.hasNextLine()) {
			sal = true;
			while (sal) {
				if (i % 2 == 0) {
					nombre = sc.next();
				} else {
					preu = sc.nextFloat();
					productos.put(nombre, preu);
					sal = false;
				}
				i++;

			}
		}
		System.out.println("Mostrando el contenido del maps: ");
		mostrar();

	}

	public static void menu() {
		System.out.println("MENU VIDEOJUEGOS");
		System.out.println("1.- INSERTAR");
		System.out.println("2.- MODIFICAR");
		System.out.println("3.- ELIMINAR VIDEOJUEGO");
		System.out.println("4.- MOSTRAR PRODUCTOS");
		System.out.println("5.- SALIDA");
		System.out.println("INTRODUCE EL NUMERO DE LA OPCION QUE QUIERA ELEGIR: ");

	}

	public static void insertar() {
		String nombre3 = introducirNombreVideojuego();
		float precio3 = precioVideojuego();
		productos.put(nombre3, precio3);
		System.out.println("VIDEOJUEGO INTRODUCIDO CORRECTAMENTE\n");
	}

	public static void modificar() {
		String nombre = introducirNombreVideojuego();

		if (comprobarSiVideojuegoExiste(nombre)) {

			productos.put(nombre, precioVideojuego());
			System.out.println("EL VIDEOJUEGO " + nombre + " SE HA ACTUALIZADO CON EXITO");
		} else {
			System.out.println("NO SE PUEDE MODIFICAR PORQUE NO EXISTE");
		}
	}

	public static void mostrar() {
		Iterator it = productos.keySet().iterator();
		String nom;
		while (it.hasNext()) {
			nom = (String) it.next();
			System.out.println(nom + "---> " + productos.get(nom));
		}

	}

	public static void eliminar() {
		String nom = introducirNombreVideojuego();
		if (comprobarSiVideojuegoExiste(nom)) {
			productos.remove(nom);
			System.out.println("SE HA ELIMINADO EL VIDEOJUEGO " + nom);
		}

	}

	public static boolean comprobarSiEstaVacia() {
		return productos.isEmpty();

	}

	public static boolean comprobarSiVideojuegoExiste(String nombreJuego) {
		return productos.containsKey(nombreJuego);

	}

	public static String introducirNombreVideojuego() {
		String nom = "";
		boolean ok = true;
		while (ok) {
			sc.nextLine();
			System.out.println("INTRODUCE EL NOMBRE DEL VIDEOJUEGO");
			nom = sc.nextLine().toLowerCase();
			if (nom.equals("")) {
				System.out.println("EL CAMPO NOMBRE TIENE QUE ESTAR COMPLETO");
			} else {
				ok = false;
			}
		}
		return nom;

	}

	public static float precioVideojuego() {
		boolean salida1 = true;
		float precio1 = 0f;
		sc.nextLine();
		while (salida1) {
			System.out.println("INTRODUCE EL PRECIO DEL VIDEOJUEGO");
			if (sc.hasNextFloat()) {
				precio1 = sc.nextFloat();
				salida1 = false;
			} else {
				System.out.println("PRECIO NO RECONOCIDO, VUELVA A IUNTRODUCIRLO");
				sc.nextLine();
			}

		}
		return precio1;
	}

}
