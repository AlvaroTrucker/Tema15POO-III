package introduccion;

public class TestVehiculos {

	public static void main(String[] args) {
		Coche coche1 = new Coche("joaquin",5,true,true);
		Coche coche2 = new Coche("luisa",7,false,false);
		Motocicleta moto1 = new Motocicleta("pepa",2,250);
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(moto1);
		System.out.println("Propietario coche1: "+coche1.getPropietario());
		System.out.println("Fecha de compra coche2: "+coche2.getFechaCompra());
		System.out.println("Numero de pasajeros moto1: "+moto1.getNumeroPasajeros());

	}

}
