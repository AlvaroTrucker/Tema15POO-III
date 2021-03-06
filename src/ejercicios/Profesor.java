package ejercicios;

public class Profesor extends Persona {
	private String especialidad;

	/**
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param especialidad
	 */
	public Profesor(String nombre, int edad, String dni, String especialidad) {
		super(nombre, edad, dni);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
}
