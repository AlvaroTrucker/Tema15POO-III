package ejercicios;

public class TestHerencia {

	public static void main(String[] args) {
		Profesor p1 = new ProfesorInterino("yo", 22, "111", "yo","11/01/2013");
		Profesor p2 = new ProfesorTitular("yo", 22, "111", "yo",3);
		System.out.println(p1);
		System.out.println(p2);

	}

}
