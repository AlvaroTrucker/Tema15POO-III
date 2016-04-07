package ejercicios;

public class PruebaInformaticos {

	public static void main(String[] args) {
		InformaticoAbs analista1 = new Analista("ABC","Base de datos");
		InformaticoAbs programador1 = new Programador("ABC", "Java");
		analista1.setSueldo(30);
		programador1.setSueldo(30);
		System.out.printf("%s, %s, %.2f%n", "ANALISTA", analista1.getEmpresa(), analista1.pagarSueldo(20));
		System.out.printf("%s, %s, %.2f%n", "PROGRAMADOR", programador1.getEmpresa(), programador1.pagarSueldo(20));
	}

}
