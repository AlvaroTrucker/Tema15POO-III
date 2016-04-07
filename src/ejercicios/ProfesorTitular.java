package ejercicios;

public class ProfesorTitular extends Profesor {
	private boolean titular;
	private int antigüedad;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param especialidad
	 * @param titular
	 * @param antigüedad
	 */
	public ProfesorTitular(String nombre, int edad, String dni, String especialidad, boolean titular, int antigüedad) {
		super(nombre, edad, dni, especialidad);
		this.titular = titular;
		this.antigüedad = antigüedad;
	}
	
	
}
