/*	Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.	
C = (5 * (F-32) / 9)
F = ((C*1.8)+32)
*/

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		System.out.println("Diga a temperatura em graus Celsius: ");
		double grausC= leia.nextDouble();
		double grausF = ((grausC*1.8)+32); 
		System.out.println("A temperatura em graus Farenheit é : " + grausF);
	}

}
