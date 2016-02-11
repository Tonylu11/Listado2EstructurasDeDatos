package lista;

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

/**
 * 3. Entrega la clase Lista que: a. Añada al final de la lista b. Inserte un
 * elemento en una determinada posición c. Modifique un elemen to reemplazándolo
 * por otro d. Conozca el tamaño de la lista e. Elimine elementos de la lista f.
 * Busque elementos en la lista g. Copie la lista Utilízala en un ejemplo
 * TestLista (por ejemplo, la alineación de un equipo de fútbol, con titulares y
 * reservas) y entrégalo correctamente identificado y documentado, incluyendo
 * JavaDoc. Deberás implementar un menú con las opciones posibles para que el
 * usuario lo uti lice fácilmente
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestLista {
	/**
	 * Menu general de la gesti&oacute;n del equipo de f&uacute;tbol.
	 */
	static Menu menuGeneral = new Menu("Equipo de fútbol.",
			new String[] { "Añadir al final.", "Insertar en una posición", "Modificar jugador.", "Tamaño del equipo.",
					"Eliminar jugador.", "Buscar jugador.", "Copiar el equipo. ", "Mostrar equipo.", "Salir." });
	/**
	 * lista fubol de tipo Lista.
	 */
	static Lista listaFutbol = new Lista();
	/**
	 * Lista copia de tipo ArrayList.
	 */
	static ArrayList listaCopia = new ArrayList();

	public static void main(String[] args) {
		gestionarMenuLista();
	}

	/**
	 * Gestiona el men&uacute; de la lista de futbol.
	 */
	private static void gestionarMenuLista() {
		int opcion;
		do {
			opcion = menuGeneral.gestionar();
			switch (opcion) {
			case 1:
				annadir();
				break;
			case 2:
				annadirPorPosicion();
				break;
			case 3:
				modificarElemento();
				break;
			case 4:
				System.out.println(listaFutbol.tamannoLista());
				break;
			case 5:
				eliminar();
				break;
			case 6:
				buscarElemento();
				break;
			case 7:
				copiarLista();
				break;
			case 8:
				System.out.println(listaFutbol);
				System.out.println("Lista copia: " + listaCopia);
				break;
			case 9:
				System.out.println("Adiooooss...");
				return;
			}
		} while (opcion < 9 && opcion > 0);
	}

	/**
	 * Copia la lista de jugadores a otra.
	 */
	private static void copiarLista() {
		System.out.println(listaCopia = listaFutbol.copiarLista(listaCopia));
	}

	/**
	 * Busca un jugador por su nombre.
	 */
	private static void buscarElemento() {
		System.out.println(
				listaFutbol.buscarElemento(Teclado.leerCadena("Introduce el nombre de un jugador a buscar..")));
	}

	/**
	 * Elimina un jugador por su nombre.
	 */
	private static void eliminar() {
		listaFutbol.eliminar(Teclado.leerCadena("Introduce el nombre de un jugador a eliminar.."));
	}

	/**
	 * Modifica un elemento de la lista de futbol.
	 */
	private static void modificarElemento() {
		System.out.println(listaFutbol.modificarElemento(Teclado.leerCadena("Dame el nombre de un jugador nuevo.."),
				Teclado.leerCadena("Dame el jugador a reemplazar..")));
	}

	/**
	 * A&ntilde;ade un elemento por una posici&oacute;n pedida por teclado.
	 */
	private static void annadirPorPosicion() {
		System.out.println(listaFutbol.annadirEnPosicion(Teclado.leerCadena("Introduce el nombre de un jugador."),
				Teclado.leerEntero("Dame la posición a añadir el jugador..")));
	}

	/**
	 * A&ntilde;ade un elemento al final de la lista.
	 */
	private static void annadir() {
		System.out.println(listaFutbol.annadir(Teclado.leerCadena("Introduce el nombre de un jugador.")));
	}
}
