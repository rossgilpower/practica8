package practica8;

public class Veterinaria {
	
	private String nombre;
	private double salario;
	
	public Veterinaria (String nombre, double salario){
	setSalario(salario);setNombre(nombre);
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public double getSalario(){
		return salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void vacunar(Animales an){
		an.setVacuna(true);
	}
	public void revisar(Animales an){
		if(an.vacuna) {
			System.out.println("[ "+an.nombre + " está vacunado ]");
	}
	else{
		System.out.println("[ "+an.nombre + " no está vacunado ]");
		}
	}
}

