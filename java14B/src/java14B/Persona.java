package java14B;

import java.util.Scanner;

/*Confeccionar una clase que permita carga el nombre y la edad de una persona.
Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)*/

public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;

	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("ingrese nombre");
		nombre = teclado.next();
		System.out.println("Ingrese edad");
		edad = teclado.nextInt();
	}

	public void imprimir() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	public void esMayorEdad() {
		if (edad >= 18) {
			System.out.println(nombre + " es mayor de edad.");
		} else {
			System.out.println(nombre + " es menor de edad.");
		}
	}

	public static void main(String[] args) {
		Persona miguel;
		miguel = new Persona();
		miguel.inicializar();
		miguel.imprimir();
		miguel.esMayorEdad();
			
	}
}
