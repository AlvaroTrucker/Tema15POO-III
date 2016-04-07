package ejercicios;

import java.util.HashSet;
import java.util.Set;

public class ListinProfesores {
	private Set<Profesor> listinProfesores = new HashSet<Profesor>();

	/**
	 * @param listinProfesores
	 */
	public ListinProfesores(Set<Profesor> listinProfesores) {
		this.listinProfesores = listinProfesores;
	}

	public void addProfesor(Profesor p){
		this.listinProfesores.add(p);
	}
	
	public void removeProfesor(Profesor p){
		this.listinProfesores.remove(p);
	}
	
}
