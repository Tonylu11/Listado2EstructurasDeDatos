package testListaPersonas;

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
public class Persona {
	/**
	 * Nombre de la persona.
	 */
	private String nombre;
	/**
	 * Apellidos de la persona.
	 */
	private String apellidos;

	/**
	 * Constructor para la clase persona.
	 * 
	 * @param nombre
	 *            Nombre de la persona.
	 * @param apellidos
	 *            Apellidos de la persona.
	 */
	Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * M&eacute;todo para mostrar una persona.
	 */
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellidos: " + apellidos;
	}

}
