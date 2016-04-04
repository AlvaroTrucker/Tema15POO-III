package figurasGeometricas;

public class TrianguloEquilatero extends Triangulo {
	private int lado;

	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @param lado
	 */
	public TrianguloEquilatero(int lado) {
		super("Triangulo equilatero", lado, lado, lado);
		this.lado = lado;
	}
	
	public double getArea(){
		return Math.sqrt(3)*Math.pow(this.lado, 2)/4;
	}

	@Override
	public String toString() {
		return super.toString() + " y area "+this.getArea()+" y lado "+this.lado;
	}
	
	
	
}
