/*	Tendo como dados de entrada a altura de uma pessoa, construa um 
algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
(72.7*altura) - 58	*/

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Diga a sua altura: ");
		double altura = leia.nextDouble();
		double pesoIdeal= ((72.7*altura) -58) ;
		System.out.println("O peso ideal de acordo com a sua altura é: " + pesoIdeal);

	}

}
