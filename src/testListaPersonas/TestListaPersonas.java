package testListaPersonas;

import java.util.ArrayList;

/**
 * Entrega la clase TestListaPersonas que haga lo siguiente: a. Cree una lista
 * (ArrayList) de personas. ArrayList<Persona> listaPersonas = new ArrayList
 * <Persona>(); //Generics b. Añada tres personas a la lista (3 elementos). c.
 * Muestre la lista. (implementa toString() en P ersona) d. Elimine el último
 * elemento. e. Muestre la lista. f. Elimine el primer elemento. g. Muestre la
 * lista. La persona tiene al menos nombre y apellidos.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestListaPersonas {

	public static void main(String[] args) {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();// Crea la
																	// lista.
		listaPersonas.add(new Persona("Eddard", "Stark"));// Añade Elemento 1.
		listaPersonas.add(new Persona("Tyrion", "Lannister"));// Añade Elemento
																// 2.
		listaPersonas.add(new Persona("Arya", "Stark"));// Añade Elemento 3.
		System.out.println(listaPersonas);// Muestra la lista de personas.
		System.out.println(listaPersonas.remove(listaPersonas.size() - 1) + " (Eliminada)");// Elimina
																							// el
																							// ultimo
																							// elemento.
		System.out.println(listaPersonas);// Muestra la lista de personas.
		System.out.println(listaPersonas.remove(0) + " (Eliminado)");// Elimina
																		// el
																		// primer
																		// elemento.
		System.out.println(listaPersonas);// Muestra la lista de personas.
	}

}
