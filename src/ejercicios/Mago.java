package ejercicios;

public class Mago extends Personaje {
	private String poder;

	/**
	 * @param nombre
	 * @param energia
	 * @param poder
	 */
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
	
	public String encantar(){
		if(this.getEnergia() >= 2)
			this.setEnergia(this.getEnergia()-2);
		return this.poder;
	}
	
}
