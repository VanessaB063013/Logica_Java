/*	Faça um programa para uma loja de tintas. O programa deverá pedir o 
tamanho em metros quadrados da área a ser pintada. Considere que a 
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
usuário a quantidades de latas de tinta a serem compradas e o preço 
total */

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Qual tamanho em metros quadrados da área a ser pintada?");
	int tamanhoEmMetrosDaArea = leia.nextInt();
	//cobertura é de 1l para cada 3 metros 
	int lataTinta = 18; //L
	int cobertura = 54; //m
	int valorTinta = 80; //reais
	
	//para cada 54m 1 lata de tinta que custa 80,00
	
	
	
	int quantidadeLatasDeTinta= tamanhoEmMetrosDaArea/cobertura;
	int valorTotal = valorTinta*quantidadeLatasDeTinta;
	
	if(quantidadeLatasDeTinta%cobertura!=0) {
		quantidadeLatasDeTinta++;
		valorTotal = valorTotal+80;
		System.out.println("Você precisará de " + quantidadeLatasDeTinta + " latas de tinta e pagará R$ " + valorTotal + " para realizar a pintura.");
	}else {
	
	System.out.println("Você precisará de " + quantidadeLatasDeTinta + " latas de tinta e pagará R$ " + valorTotal + " para realizar a pintura.");
	}
	
	
	
	

	}

}
