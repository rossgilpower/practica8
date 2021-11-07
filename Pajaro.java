package practica8;


public class Pajaro extends Animales {
	public Pajaro(String nombre, int edad){
		super(nombre, edad);
		}
	public void eat(){
		System.out.println("[ "+nombre + " come semillas]");
		}
	public void volar(){
		System.out.println("[ "+nombre + " vuela]");
		}
	}

