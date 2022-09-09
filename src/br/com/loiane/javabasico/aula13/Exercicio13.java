/*	Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, utilizando as 
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou 
abaixo do peso */

package br.com.loiane.javabasico.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		// Dados de entrada: altura e sexo e peso 
		
		System.out.println("Digite sua altura: " );
		double altura = leia.nextDouble();
		System.out.println("Digite F para informar se você é do sexo feminino ou digite M para masculino : ");
		String sexo = leia.next(); 
		System.out.println("Agora informe seu peso atual : ");
		double peso = leia.nextDouble();
		
		
		DecimalFormat formatador = new DecimalFormat("##.##");
		double imcM = peso / (altura*altura);
		double imcH = peso / (altura*altura);
		double pesoIdealM =(61.2*altura)-44.7;
		double pesoIdealH = (72.7*altura)-58;
		

	
		
		
		
		if(sexo.equalsIgnoreCase("f")) {
			
			
			
			if(imcM >= 25 && imcM >= 30) {
				
				System.out.println( "Você está acima do peso !");
				System.out.println("O peso ideal para a sua altura é " + formatador.format(pesoIdealM) + "kg.");
				
			} else if (imcM < 18.5 ) {
				
				System.out.println(" Você está abaixo do peso !");
				System.out.println("O peso ideal para a sua altura é " + formatador.format(pesoIdealM) + "kg.");
	 			
			} else if(imcM >= 18.5 && imcM <= 25) {
				
				System.out.println( "Parabéns, você está dentro do peso! !");
				System.out.println("O peso ideal para a sua altura é " + formatador.format(pesoIdealM) + "kg.");
			}
		}
		 
		if(sexo.equalsIgnoreCase("M")) {
			
			if(imcH >= 25 && imcH >= 30) {
				
				System.out.println( "Você está acima do peso !");
				System.out.println("O peso ideal para a sua altura é " + formatador.format(pesoIdealH) + "kg.");
				
			} else if (imcH < 18.5 ) {
				
				System.out.println(" Você está abaixo do peso !");
				System.out.println("O peso ideal para a sua altura é " + formatador.format(pesoIdealH) + "kg.");
	 			
			} else if(imcH >= 18.5 && imcH <= 25) {
				
				System.out.println( "Parabéns, você está dentro do peso! !");
				System.out.println("O peso ideal para a sua altura é " + formatador.format(pesoIdealH) + "kg.");
			}
		}
		
		
		
		
		
		
		}
	
		
		}
	



