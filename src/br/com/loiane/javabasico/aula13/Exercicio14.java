/*	João Papo-de-Pescador, homem de bem, comprou um 
microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido 
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve 
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que 
você faça um programa que leia a variável peso (peso de peixes) e 
verifique se há excesso. Se houver, gravar na variável excesso e na 
variável multa o valor da multa que João deverá pagar. Caso contrário 
mostrar tais variáveis com o conteúdo ZERO*/

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variaveis: pesoDePeixe, excesso, multa
		int excesso = 0;
		
		int multa = 4 ;
		
		System.out.println("digite quantos quilos de peixe há : ");
		int pesoDePeixe = leia.nextInt();
		
	
		if(pesoDePeixe>50) {
			excesso= pesoDePeixe-50;
			multa= excesso*4;
			System.out.println("A quantidade excedeu em: " + excesso + " quilos e você deverá pagar R$ " + multa + " reais de multa");
			
		}else {
			multa=0;
			excesso=0;
			System.out.println("Você não tem multas a pagar.");
			System.out.println("multa : R$ " + multa + ",00");
			System.out.println("excesso: " + excesso);
		}
		
		
		

	}
	
	// o excesso é aquilo que ultrapassa 50
	
	// como demonstrar ? 

}
