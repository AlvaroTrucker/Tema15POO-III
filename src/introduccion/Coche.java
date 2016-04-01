package introduccion;

public class Coche extends Vehiculo {
	private boolean diesel;
	private boolean descapotable;
	
	/**
	 * @param numeroRuedas
	 * @param propietario
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche(String propietario, int numeroPasajeros, boolean diesel, boolean descapotable) {
		super(4, propietario, numeroPasajeros);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable + ", getPropietario()=" + getPropietario()
				+ ", getNumeroRuedas()=" + getNumeroRuedas() + ", getFechaCompra()=" + getFechaCompra()
				+ ", getNumeroPasajeros()=" + getNumeroPasajeros() + "]";
	}

	
	
	
	
}
