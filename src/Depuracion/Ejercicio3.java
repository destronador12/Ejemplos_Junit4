package Depuracion;
import java.util.Scanner;

public class Ejercicio3 {

	/**

	Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números
	primos que queremos mostrar.

	*/
	

	// Inicio del programa y declaración de variables:

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int numPrimos;
			int contador;
			boolean esPrimo;
			int divisor;
			int num;
	// Inicio del programa, explicación al usuario
			System.out.println("El programa nos muestra una cantidad solicitada de números primos.");
	// Pedimos datos al usuario
			System.out.print("Indicanos la cantidad de los primeros números primos que deseas conocer: ");
			numPrimos = scanner.nextInt();
	// Iniciamos el ciclo para calcular el tiempo.   
			System.out.println("1: 2");
			contador = 1;
			num = 3;
			while (contador <= numPrimos) {
				esPrimo = true;
				divisor = 3;
				while ((divisor <= Math.sqrt((num))) && esPrimo) {
					if (num % divisor == 0) {
						esPrimo = false;
					}
					divisor += 2;
				}
				if (esPrimo) {
					contador += 2;
					System.out.println(contador + ": " + num);
				}
				num += 2;
			}
		}
	}


