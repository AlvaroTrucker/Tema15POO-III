package introduccion;

public class Motocicleta extends Vehiculo {
	private int cilindrada;

	/**
	 * @param numeroRuedas
	 * @param propietario
	 * @param numeroPasajeros
	 * @param cilindrada
	 */
	public Motocicleta(String propietario, int numeroPasajeros, int cilindrada) {
		super(2, propietario, numeroPasajeros);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", getPropietario()=" + getPropietario()
				+ ", getNumeroRuedas()=" + getNumeroRuedas() + ", getFechaCompra()=" + getFechaCompra()
				+ ", getNumeroPasajeros()=" + getNumeroPasajeros() + "]";
	}

	
}
