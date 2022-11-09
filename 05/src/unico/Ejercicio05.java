package unico;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/* Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
 *  A continuación, solicitará por teclado un valor que debe estar dentro del rango.
 *  Si no es asi, volverá a solicitar un número, y así repetidas veces hasta
 *  que el valor esté dentro del rango.
 */

		int min;
		int max;
		int num;
		
		System.out.print("Introduce el valor mínimo: ");
		min = Integer.parseInt(teclado.nextLine());
		
		do {
			System.out.print("Introduce el valor máximo: ");
			max = Integer.parseInt(teclado.nextLine());
		} while (max <= min);
		
		System.out.print("Introduzca un número que esté entre " + min + " y " + max + ": ");
		num = Integer.parseInt(teclado.nextLine());
		while (num < min || num > max) {
			System.out.println("Ese número no se encuentra en el rango.");
			System.out.print("Por favor, introduce otro número");
			num = Integer.parseInt(teclado.nextLine());
		}

}
}