package figurasGeometricas;

public class Rectangulo extends Cuadrilatero {
	private int base;
	private int altura;
	
	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @param lado4
	 * @param base
	 * @param altura
	 */
	public Rectangulo(int base, int altura) {
		super("Rectangulo", base, altura, base, altura);
		this.base = base;
		this.altura = altura;
	}
	
	public int getArea(){
		return this.base * this.altura;
	}

	@Override
	public String toString() {
		return super.toString()+", de area"+this.getArea()+" de base"+this.base+" de altura"+this.altura;
	}

	
	
	
	
}
