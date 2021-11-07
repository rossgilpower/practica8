package practica8;


public class Pez extends Animales {
	public Pez( String nombre, int edad) {
		
		super(nombre, edad);
	}
	public void eat() {
		System.out.println("[ "+nombre + " está comiendo ]");
	}
	public void nadar() {
		System.out.println("[ "+nombre + " está nadando ]");
	}
	
}
