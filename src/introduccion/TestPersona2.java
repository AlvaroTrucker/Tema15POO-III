package introduccion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPersona2 {

	public static void main(String[] args) {
		Set<Persona2> setPersona = new HashSet<Persona2>();
		List<Persona2> listPersona = new ArrayList<Persona2>();
		
		Persona2 p1 = new Persona2(12,"juan garcia","11");
		Persona2 p2 = new Persona2(12,"juan garcia","11");
		Persona2 p3 = new Persona2(12,"juan garcia","11");
		
		setPersona.add(p1); listPersona.add(p1);
		setPersona.add(p2); listPersona.add(p2);
		setPersona.add(p3); listPersona.add(p3);
		
		System.out.println("Tamaño coleccion set: "+setPersona.size());
		System.out.println("Tamaño coleccion list: "+listPersona.size());
		System.out.println("==================\n");
		
		try {
			Persona2 p1Clonado = (Persona2)p1.clone();
			System.out.println(p1);
			System.out.println(p1Clonado);
			p1.setEdad(100);
			System.out.println(p1.getEdad());
			System.out.println(p1Clonado.getEdad());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
