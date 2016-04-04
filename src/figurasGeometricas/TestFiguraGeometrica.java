package figurasGeometricas;

public class TestFiguraGeometrica {

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(3);
		System.out.println(c);
		Rectangulo r = new Rectangulo(2,3);
		System.out.println(r);
		Triangulo tE = new TrianguloEquilatero(2);
		System.out.println(tE);
		Triangulo tR = new TrianguloRectangulo(2,3);
		System.out.println(tR);
		System.out.println("Numero de figuras creadas: "+tR.numeroFiguras);
		System.out.println("Numero de triangulos: "+Triangulo.numeroTriangulos);
		System.out.println("Numero de cuadrilateros: "+Cuadrilatero.numeroCuadrilateros);

	}

}
