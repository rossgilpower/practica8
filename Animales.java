package practica8;

public class Animales {
	String nombre;
	int years;
	boolean vacuna;
	public Animales(String nombre, int years){
	this.nombre = nombre;
	this.years = years;
	}
	public void eat(){
	System.out.println(nombre +" (Comiendo...)");
	}
	public void sleep(){
	System.out.println(nombre + " (Durmiendo....)");
	}
	public void setVacuna(boolean vacuna){
	this.vacuna = vacuna;
	}
}

