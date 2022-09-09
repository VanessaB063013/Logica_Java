//Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área
package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Sabemos que Raio = C/2*PI
		// Area = PI* r²
		System.out.println("Digite o raio de um círculo: ");
		double raio = leia.nextDouble();
		double area ;
		area = Math.PI * (raio*raio);
		System.out.println("A área da circunferência é: " + area);
		
		

	}

}
