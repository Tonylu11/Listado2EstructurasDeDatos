package lista;

import java.util.ArrayList;
import java.util.Iterator;

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
public class Lista {
	/**
	 * ArrayList objetivo.
	 */
	static ArrayList lista = new ArrayList();

	/**
	 * Añade un elemento al final del ArrayList.
	 * 
	 * @param o
	 *            elemento a añadir.
	 * @return Devuelve un mensaje exitoso.
	 */
	String annadir(Object o) {
		lista.add(o);
		return "Elemento añadido con éxito";
	}

	/**
	 * Añade un elemento al ArrayList
	 * 
	 * @param o
	 *            Elemento a a&ntilde;adir.
	 * @param posicion
	 *            posici&oacute; donde a&ntilde;adir el elemento.
	 * @return Devuelve un mensaje exitoso si ha conseguido a&ntilde;adir en la
	 *         posici&oacute;n indicada.
	 */
	String annadirEnPosicion(Object o, int posicion) {
		if (comprobarPosicion(posicion)) {
			lista.add(posicion, o);
			return "Elemento añadido con éxito en la posición " + posicion;
		}
		return "El elemento no se ha podido añadir..";
	}

	/**
	 * Reemplaza un elemento por otro.
	 * 
	 * @param elementoNuevo
	 *            Elemento nuevo.
	 * @param elementoAntiguo
	 *            Elemento existente en la lista.
	 * @return Devuelve un mensaje exitoso, de lo contrario indicara que no se
	 *         ha podido modificar.
	 */

	String modificarElemento(Object elementoNuevo, Object elementoAntiguo) {
		if (contieneElemento(elementoAntiguo)) {
			lista.set(lista.indexOf(elementoAntiguo), elementoNuevo);
			return "El elemento " + elementoAntiguo + " ha sido modificado.";
		}
		return "El elemento no se ha podido modificar..";
	}

	/**
	 * Muestra el tamaño de la lista.
	 * 
	 * @return Devuelve un mensaje con el tamaño de la lista.
	 */
	String tamannoLista() {
		return "La lista contiene " + lista.size() + " elemento/s";
	}

	/**
	 * Elimina un elemento de la lista.
	 * 
	 * @param o
	 *            el elemento que queremos eliminar de la lista.
	 * @return Devuelve un mensaje exitoso, de lo contrario mostrar&aacute; que
	 *         no se ha podido eliminar.
	 */
	String eliminar(Object o) {
		if (contieneElemento(o)) {
			lista.remove(o);
			return "El elemento " + o + " ha sido eliminado con éxito.";
		}
		return "El elemento no ha podido ser eliminado.";
	}

	/**
	 * Comprueba si en la lista esta ese elemento.
	 * 
	 * @param o
	 *            elemento a revisar.
	 * @return Devuelve true si lo contiene, false de lo contrario.
	 */
	private boolean contieneElemento(Object o) {
		if (lista.contains(o))
			return true;
		return false;
	}

	/**
	 * Busca el elemento que le indica el usuario.
	 * 
	 * @param o
	 *            Elemento a buscar.
	 * @return Devuelve un mensaje exitoso si lo encuentra, fracasado si no.
	 */
	String buscarElemento(Object o) {
		if (contieneElemento(o)) {
			return "El elemento " + o + " ha sido encontrado en la posición " + lista.indexOf(o);
		}
		return "El elemento no ha sido encontrado..";
	}

	/**
	 * Comprueba si la posición esta en la lista.
	 * 
	 * @param posicion
	 *            posición a comprobar.
	 * @return Devuelve false si la posición es incorrecta, true si es correcta.
	 */
	private boolean comprobarPosicion(int posicion) {
		if (posicion > lista.size() || posicion < 0)
			return false;
		return true;
	}

	/**
	 * Copia la lista a otra lista.
	 * 
	 * @param listaCopia
	 *            lista en la que se almacenará la otra lista.
	 * @return Devuelve un mensaje con la lista copia.
	 */
	ArrayList copiarLista(ArrayList listaCopia) {
		listaCopia = (ArrayList) lista.clone();
		return listaCopia;
	}

	/**
	 * M&eacute;todo para mostrar la lista mediante un iterador.
	 */
	@Override
	public String toString() {
		String cadena = "";
		int i = 1;
		Iterator iterator = lista.iterator();
		while (iterator.hasNext()) {
			cadena += "Elemento " + i + " de la lista: " + iterator.next() + "\n";
			i++;
		}
		return cadena;
	}
}
