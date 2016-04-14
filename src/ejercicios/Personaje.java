package ejercicios;

public class Personaje {
	private String nombre;
	private int energia;
	
	/**
	 * @param nombre
	 * @param energia
	 */
	public Personaje(String nombre, int energia) {
		this.nombre = nombre;
		this.energia = energia;
	}
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void incrementarNivelEnergia(int energia){
		this.energia += energia;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", energia=" + energia + "]";
	}

}
