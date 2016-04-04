package figurasGeometricas;

public class Cuadrado extends FiguraGeometrica {
	private int lado;
	
	/**
	 * @param nombre
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @param lado4
	 * @param lado
	 */
	public Cuadrado(int lado) {
		super("Cuadrado", lado);
		this.lado = lado;
	}
	
	public int getArea(){
		return this.lado * this.lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [toString()=" + super.toString() + "] de area "+getArea()+" de lado "+this.lado;
	}
	
	
	
	
	
	
}
