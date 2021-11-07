package practica8;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	int opc;
	Zoo zoo = new Zoo();
	
	do {
		System.out.println();
		System.out.println("--- | Opciones | ---");
		System.out.println("1.- Mostrar animal");
		System.out.println("2.- Capturar animal");
		System.out.println("3.- Eliminar animal");
		System.out.println("4.- Salir");
		opc = CapturaEntrada.capturarEntero(">> Su elección");
		switch(opc) {
		case 1:	{
			zoo.imprimir();
			break;
			}
		case 2:{
			zoo.agregar(CapturaEntrada.CapturarString("Agregar"));
			break;
			}
		case 3:{
			zoo.quitar();
			break;
			}
		}
		
		} while(opc!=4);
		System.out.println("Programa finalizado.");
	}
	public static class CapturaEntrada {
		
		   public static int capturarEntero(String msg){
		        Scanner sc = new Scanner(System.in);System.out.println("" + msg+":");
		        return (sc.nextInt());
		    }
		    public static float CapturarFloat(String msg){
		        Scanner sc = new Scanner(System.in); System.out.println("" + msg+":");
		        return (sc.nextFloat());
		    }
		    public static double capturaDoble(String msg){
		    	Scanner sc = new Scanner(System.in); System.out.print(""+msg+": ");
		    	return (sc.nextDouble());
		    	}
		    public static String CapturarString(String msg){
		        Scanner sc = new Scanner(System.in);System.out.println("" + msg+ ":");
		        return (sc.nextLine());
		    }
		  }
}
