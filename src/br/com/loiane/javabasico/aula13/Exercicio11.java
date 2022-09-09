/*	Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.	*/


package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		//peça dois numeros inteiros e um número real 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int num1 = leia.nextInt();
		System.out.println("Digite mais um valor inteiro: ");
		int num2 = leia.nextInt();
		System.out.println("Digite um número decimal: ");
		double num3 = leia.nextDouble();
		
		//Calcule e mostre:
		double result1 = ((num1*2)+num2/2);
		double result2= ((num1*3)+ num3);
		double result3 = Math.pow(num3, 3); 
		
		System.out.println("o produto do dobro do primeiro com metade do segundo é: " + result1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + result2);
		System.out.println("O terceiro elevado ao cubo é " + result3);
		
		
		
	}

}
