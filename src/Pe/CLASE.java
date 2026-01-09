package Pe;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
public class CLASE {

	
	public static boolean esPar (int numero) {
		
		if (numero %2 == 0) {
			 return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		boolean repetir = false;
		
		
		while (!repetir) {
			
			try {
				
				System.out.println("Ingrese un número: ");
				int numero = teclado.nextInt(); 
				
				if (esPar(numero)){

					System.out.println( numero + " es un número par");
					
				} else {
					
					System.out.println(numero + " es un número impar");
					
				} repetir = true;
				
			}  catch (java.util.InputMismatchException e)  {
				
				System.out.println("Por favor introduzca solo números"); 
				
				repetir = true;
			}
			
			
			
			
		}
		

		
		
		
		
	}

}
