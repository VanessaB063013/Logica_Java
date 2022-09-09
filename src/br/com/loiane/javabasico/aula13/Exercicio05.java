//Faça um Programa que converta metros para centímetros.


package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio05 {

public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Digite o valor em  metros: ");
	double metros = leia.nextDouble();
	double centimetros = metros*100;
	
	System.out.println("Este valor convertido em centímetros é: " + centimetros);
	
	
	
}
	
	
}
