/* Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário. */

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Área de um quadrado : A=L²
		
		System.out.println("Digite o tamanho do lado do quadrado: " );
		double lado = leia.nextDouble();
		double area = lado*lado;
		double dobro = area*2;
		System.out.println("A area do quadrado é  " + area + " e o dobro desta área é  " + dobro);
	}

}
