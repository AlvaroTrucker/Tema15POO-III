package introduccion;

public class TestModificador {

	public static void main(String[] args) {
		//creamos objeto modificador
		Modificador m = new Modificador(1,2,3,4);
		
		//accediendo a public int valor1
		System.out.println(m.valor1);
		
		//accediendo a protected int valor2
		System.out.println(m.valor2);
		
		//accediendo a (package) int valor3
		System.out.println(m.valor3);
		
		//accediendo a private int valor4
		//System.out.println(m.valor4); no es posible
		
		//¿Se pueden modificar los valores?
		m.valor1 *= 2;
		m.valor2 *= 2;
		m.valor3 *= 2;
		System.out.println(m.valor1+" "+m.valor2+" "+m.valor3);
		
		//llamando a metodos: public, proteced, private
		System.out.println(m.devolverValorVariablePrivadaPublic());
		System.out.println(m.devolverValorVariablePrivadaProtected());
		System.out.println(m.devolverValorVariablePrivadaPackage());
		//System.out.println(m.devolverValorVariablePrivadaPrivate());

	}

}
