package introduccion;

public class Modificador {
	public int valor1;
	protected int valor2;
	int valor3;
	private int valor4;
	
	/**
	 * @param valor1
	 * @param valor2
	 * @param valor3
	 * @param valor4
	 */
	public Modificador(int valor1, int valor2, int valor3, int valor4) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}
	
	//metodo con modificador publico
	public int devolverValorVariablePrivadaPublic(){
		return this.valor4;
	}
	
	//metodo con modificador protected
	protected int devolverValorVariablePrivadaProtected(){
		return this.valor4;
	}
	
	//metodo con modificador package
	int devolverValorVariablePrivadaPackage(){
		return this.valor4;
	}
	
	//metodo con modificador private
	private int devolverValorVariablePrivadaPrivada(){
		return this.valor4;
	}
}
