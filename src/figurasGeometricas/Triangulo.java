package figurasGeometricas;

public class Triangulo extends FiguraGeometrica {
	private double lado1;
	private double lado2;
	private double lado3;
	public static int numeroTriangulos = 0;
	
	/**
	 * @param nombre
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(String nombre, double lado1, double lado2, double lado3) {
		super(nombre, 3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		numeroTriangulos++;
	}
	
	public double getPerimeto(){
		return Math.round((this.lado1 + this.lado2 + this.lado3)*100)/100.0;
	}

	@Override
	public String toString() {
		return super.toString() + " y perimetro "+this.getPerimeto();
	}
	
	
	
}
