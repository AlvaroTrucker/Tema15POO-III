package ejercicios;

public class TestVideojuego {

	public static void main(String[] args) {
		Personaje m1 = new Mago("merlin","bola de fuego");
		Mago m2 = new Mago("gandalf","llama de udum");
		String encantamiento2 = m2.encantar();
		String encantamiento = ((Mago) m1).encantar();
		m1.incrementarNivelEnergia(10); //definido en personaje
		m2.incrementarNivelEnergia(10);
		System.out.println(m2.encantar());
		System.out.println(((Mago) m1).encantar());
		Personaje g1 = new Guerrero("Tor",200,"espada");
		Guerrero g2 = new Guerrero("Conan",155,"hacha");
		
		//accedemos a incrementarNivelEnergia y combatir
		g1.incrementarNivelEnergia(100);
		g2.incrementarNivelEnergia(100);
		System.out.println(g2.combatir(125));
		System.out.println(((Guerrero) g1).combatir(125));
	
	}
	
}