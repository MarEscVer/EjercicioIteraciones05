package unico;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

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