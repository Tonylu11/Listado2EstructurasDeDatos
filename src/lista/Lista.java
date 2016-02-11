package lista;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 3. Entrega la clase Lista que: a. A�ada al final de la lista b. Inserte un
 * elemento en una determinada posici�n c. Modifique un elemen to reemplaz�ndolo
 * por otro d. Conozca el tama�o de la lista e. Elimine elementos de la lista f.
 * Busque elementos en la lista g. Copie la lista Util�zala en un ejemplo
 * TestLista (por ejemplo, la alineaci�n de un equipo de f�tbol, con titulares y
 * reservas) y entr�galo correctamente identificado y documentado, incluyendo
 * JavaDoc. Deber�s implementar un men� con las opciones posibles para que el
 * usuario lo uti lice f�cilmente
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
	 * A�ade un elemento al final del ArrayList.
	 * 
	 * @param o
	 *            elemento a a�adir.
	 * @return Devuelve un mensaje exitoso.
	 */
	String annadir(Object o) {
		lista.add(o);
		return "Elemento a�adido con �xito";
	}

	/**
	 * A�ade un elemento al ArrayList
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
			return "Elemento a�adido con �xito en la posici�n " + posicion;
		}
		return "El elemento no se ha podido a�adir..";
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
	 * Muestra el tama�o de la lista.
	 * 
	 * @return Devuelve un mensaje con el tama�o de la lista.
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
			return "El elemento " + o + " ha sido eliminado con �xito.";
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
			return "El elemento " + o + " ha sido encontrado en la posici�n " + lista.indexOf(o);
		}
		return "El elemento no ha sido encontrado..";
	}

	/**
	 * Comprueba si la posici�n esta en la lista.
	 * 
	 * @param posicion
	 *            posici�n a comprobar.
	 * @return Devuelve false si la posici�n es incorrecta, true si es correcta.
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
	 *            lista en la que se almacenar� la otra lista.
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
