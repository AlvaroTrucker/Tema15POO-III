package ejercicios;

public class InformaticoAbs {
	private String empresa;
	private double sueldo;
	
	/**
	 * @param empresa
	 */
	public InformaticoAbs(String empresa) {
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double pagarSueldo(double horas){
		return this.sueldo * horas;
	}
	
}
