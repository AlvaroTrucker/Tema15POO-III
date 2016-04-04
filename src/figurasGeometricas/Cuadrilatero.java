package figurasGeometricas;

public class Cuadrilatero extends FiguraGeometrica {
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	public static int numeroCuadrilateros = 0;
	
	/**
	 * @param nombre
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @param lado4
	 */
	public Cuadrilatero(String nombre, int lado1, int lado2, int lado3, int lado4) {
		super(nombre, 4);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		numeroCuadrilateros++;
	}
	
	public int getPerimetro(){
		return this.lado1+this.lado2+this.lado3+this.lado4;
	}

	@Override
	public String toString() {
		return "Cuadrilatero [toString()=" + super.toString() + "] con perimetro"+this.getPerimetro();
	}
	
	
	
	
}
