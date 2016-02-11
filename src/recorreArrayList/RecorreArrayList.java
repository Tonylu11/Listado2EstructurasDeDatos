package recorreArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 2. A continuación se muestra parte de una clase denominada RecorreArrayList:
 * a. Compila y entrega el código donde se invoquen cada uno de los métodos ant
 * eriores. Utiliza una lista de String. b. Implementa cómo recorrer una lista
 * al revés en la misma clase
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class RecorreArrayList {
	static ArrayList<String> arrayList = new ArrayList<String>();

	public static void main(String[] args) {
		arrayList.add("Elemento 1");
		arrayList.add("Elemento 2");
		arrayList.add("Elemento 3");
		arrayList.add("Elemento 4");
		System.out.println("Metodo show(): ");
		show();
		System.out.println("Metodo showWithIterator(): ");
		showWithIterator();
		System.out.println("Metodo showWithIterator2(): ");
		showWithIterator2();
		System.out.println("Metodo showWithGet(): ");
		showWithGet();
		System.out.println("Metodo showWithForEach(): ");
		showWithForEach();
		System.out.println("Metodo showReverse(): ");
		showReverse();
	}

	/**
	 * Muestra el ArrayList
	 */
	static void show() {
		System.out.println(arrayList);
	}

	/**
	 * Muestra el ArrayList mediante un iterador con el bucle while.
	 */
	static void showWithIterator() {
		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println("\t" + it.next());
		}
	}

	/**
	 * Muestra el ArrayList mediante un iterador con el bucle for.
	 */
	static void showWithIterator2() {
		for (Iterator<String> it = arrayList.iterator(); it.hasNext();) {
			System.out.println("\t" + it.next());

		}
	}

	/**
	 * Muestra el ArrayList mediante un for clásico, accediendo mediante la
	 * posición (índices)
	 */
	static void showWithGet() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("\t" + arrayList.get(i));
		}
	}

	/**
	 * Muestra el ArrayList mediante un for mejorado.
	 */
	static void showWithForEach() {
		for (String elemento : arrayList) {
			System.out.println("\t" + elemento);
		}
	}

	/**
	 * Muestra el ArrayList al revés mediante un bucle while
	 */
	static void showReverse() {
		ListIterator<String> li = arrayList.listIterator(arrayList.size());
		while (li.hasPrevious()) {
			System.out.println("\t" + li.previous());
		}
	}
}
