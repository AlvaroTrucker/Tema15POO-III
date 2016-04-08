package ejercicios;

public class ProfesorTitular extends Profesor {
	private int antigüedad;

	/**
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param especialidad
	 * @param antigüedad
	 */
	public ProfesorTitular(String nombre, int edad, String dni, String especialidad, int antigüedad) {
		super(nombre, edad, dni, especialidad);
		this.antigüedad = antigüedad;
	}

	public int getAntigüedad() {
		return antigüedad;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [antigüedad=" + antigüedad + ", toString()=" + super.toString() + "]";
	}
	
}
