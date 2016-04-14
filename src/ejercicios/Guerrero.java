package ejercicios;

public class Guerrero extends Personaje {
	private String arma;

	/**
	 * @param nombre
	 * @param energia
	 * @param arma
	 */
	public Guerrero(String nombre, int energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
	}
	
	/*public Guerrero(String nombre, String arma) {
		super(nombre, 200); //con energia inicial de 200
		this.arma = arma;
	}*/
	
	public String combatir(int energiaGastada){
		if (this.getEnergia() >= energiaGastada){
			this.setEnergia(this.getEnergia()-energiaGastada);
			return this.arma+" "+energiaGastada;
		}
		else return "No hay energia suficiente";
			
	}
	
	
}
