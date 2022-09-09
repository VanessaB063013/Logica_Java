/*	Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).	*/

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga a temperatura em graus Farenheit : ");
		double grausF = leia.nextDouble();
		double grausC= (5*(grausF-32)/9);
		System.out.println("A temperatura em graus Celsius é : " + grausC);
		
	}

}

