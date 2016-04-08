package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListinProfesores {
	private Set<Profesor> listinProfesores = new HashSet<Profesor>();

	/**
	 * @param listinProfesores
	 */
	public ListinProfesores(Set<Profesor> listinProfesores) {
		this.listinProfesores = listinProfesores;
	}
	
	public ListinProfesores(String nombreFichero){
		this.listinProfesores = new HashSet<Profesor>();
		try (Scanner sc = new Scanner(new File(nombreFichero));) {
			String cabecera = sc.nextLine();
			while(sc.hasNextLine()){
				String[] campos = sc.nextLine().split(";");
				if (campos[4].trim().equalsIgnoreCase("SI")){
					Profesor p = new ProfesorTitular(campos[0],Integer.parseInt(campos[1]),campos[2],campos[3],campos[4],campos[5]);
				this.listinProfesores.add(p);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ListinProfesores l = new ListinProfesores("Archivos/profesores.txt");
		System.out.println(l);
	}
	
}
