package ejercicios;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	private String fecha;

	/**
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param especialidad
	 * @param fecha
	 */
	public ProfesorInterino(String nombre, int edad, String dni, String especialidad, String fecha) {
		super(nombre, edad, dni, especialidad);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fecha=" + fecha + ", toString()=" + super.toString() + "]";
	}

}
