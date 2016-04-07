package ejercicios;

public class Programador extends InformaticoAbs {
	private String lenguaje;

	/**
	 * @param empresa
	 * @param lenguaje
	 */
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}

	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas) * 1.5;
	}
	
	
}
