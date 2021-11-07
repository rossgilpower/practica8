package practica8;
import java.util.ArrayList;
public class Zoo {
	private ArrayList<Animales> anls = new ArrayList<>();
	private Veterinaria v = new Veterinaria(Main.CapturaEntrada.CapturarString("Introduce nombre del Veterinario"),Main.CapturaEntrada.capturaDoble("Introduce Salario"));
	public void agregar(String animal){
		animal = animal.trim().toLowerCase();
		Animales a = null;
		switch(animal){
		case "perro": {
			a = new Perro(Main.CapturaEntrada.CapturarString("Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "gato": {
			a = new Gato(Main.CapturaEntrada.CapturarString("Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "pez": {
			a = new Pez(Main.CapturaEntrada.CapturarString("Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "pajaro":{
			a = new Pajaro(Main.CapturaEntrada.CapturarString(" Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		default: {
			System.out.println("Animal no permitido. Vuelva a intentarlo.");
			}
		}
		if(a != null){
			anls.add(a);
		}
}
	public void imprimir(){
		for(Animales a: anls){
			a.eat(); v.vacunar(a); v.revisar(a);
			if(a instanceof Perro){
				((Perro)a).ladrar();
				}
			else if(a instanceof Gato){
				((Gato)a).aruñar();
				}
			else if(a instanceof Pez) {
				((Pez)a).nadar();
			}
			else if(a instanceof Pajaro){
				((Pajaro)a).volar();
				}
			System.out.println();
			}
	}
	public void quitar(){
		int i = 1, op;
		for(Animales a: anls){
			System.out.println("Numero de animal: " + i); System.out.print(a.nombre + "\n"); i++;
			}
		op = Main.CapturaEntrada.capturarEntero("Introduce el numero"); anls.remove((op-1));
		System.out.println(">> Animal borrado exitosamente.");
		}
	}

