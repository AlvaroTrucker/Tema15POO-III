package figurasGeometricas;

public class FiguraGeometrica {
	public static int numeroFiguras = 0;
	private String nombre;
	private int numeroLados;
	
	/**
	 * @param nombre
	 * @param numeroLados
	 */
	public FiguraGeometrica(String nombre, int numeroLados) {
		this.nombre = nombre;
		this.numeroLados = numeroLados;
		numeroFiguras++;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + ", numeroLados=" + numeroLados + "]";
	}
	
	
}
