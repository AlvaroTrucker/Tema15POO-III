package figurasGeometricas;

public class TrianguloRectangulo extends Triangulo {
	private double cateto1;
	private double cateto2;
	
	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @param cateto1
	 * @param cateto2
	 */
	public TrianguloRectangulo(double cateto1, double cateto2) {
		super("Triangulo rectangulo", cateto1, cateto2, Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public double getArea(){
		return ((this.cateto1 * this.cateto2) / 2);
	}

	@Override
	public String toString() {
		return super.toString()+" y area "+this.getArea()+" y cateto1 "+this.cateto1+" y cateto2 "+this.cateto2;
	}
	
	
	
}
