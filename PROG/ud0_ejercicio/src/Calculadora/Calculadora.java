package Calculadora;
import java.util.Scanner;

public class Calculadora 

	{ public static void main (String [] args)
		{ Scanner entrada = new Scanner (System.in);
		
			System.out.print ("Introduce un número: ");
				int numero1 = entrada.nextInt ();
				
			System.out.print ("Introduce otro número: ");
				int numero2 = entrada.nextInt ();
						
			if (numero1 <0 || numero2 <0)
				{ System.out.print ("No se admiten números negativos.");
				} 	else {int multiplicacion = numero1 * numero2;
				  	System.out.println ("El resultado es: " + multiplicacion);
					   	 }
		 entrada.close();
		}
	}