package ejercicios;

public class Analista extends InformaticoAbs {
	private String especialidad;

	/**
	 * @param empresa
	 * @param especialidad
	 */
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}

	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas) * 1.25;
	}

}
