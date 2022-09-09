package br.com.loiane.javabasico.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Tendo como entrada a altura e o sexo de uma pessoa, construa um programa que exibe o peso ideal para ela, em quilos. Use as seguintes fórmulas (adote ℎ como a altura e em metros):
• Homens: 72,7 × ℎ − 58
• Mulheres: 62,1 × ℎ − 44,7*/
public class exercicio18 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("##.##");
		
		System.out.println("Entre com a altura: ");
		double altura = leia.nextDouble();
		System.out.println("Digite F para feminino e M para masculino:");
		String sexo = leia.next();
		
		double pesoIdealM = (62.1*altura) - 44.7;
		double pesoIdealH = ((72.7*altura) - 58);
		
		
		if(sexo.equalsIgnoreCase("f")) {
			
			System.out.println("Seu peso ideal é : " + formatador.format(pesoIdealM));
		}else {
			System.out.println("Seu peso ideal é: " + formatador.format(pesoIdealH));
		}
		
		
		
	}

}
