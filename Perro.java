package practica8;


public class Perro extends Animales {
	public Perro(String nombre, int years){
		super(nombre, years);
		}
		public void eat(){
			System.out.println("[ El perro " + nombre + " est� comiendo ]");
		}
		public void morderhueso(){
		System.out.println("[ "+nombre + " est� mordiendo su hueso ]");
		}
		public void ladrar(){
		System.out.println("[ "+nombre + " est� ladrando]");
		}
	}
