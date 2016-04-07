package ejercicios;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	private LocalDate fecha;

	/**
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param especialidad
	 * @param fecha
	 */
	public ProfesorInterino(String nombre, int edad, String dni, String especialidad, LocalDate fecha) {
		super(nombre, edad, dni, especialidad);
		this.fecha = fecha;
	}
	
	
}
