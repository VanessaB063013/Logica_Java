/*	Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês	*/

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		//valorHoraTrabalho
		//numeroHorasNoMes
		//Mostrar total do salario 
		
		System.out.println("Quanto você recebe por hora trabalhada? ");
		double valorHoraTrabalhada = leia.nextDouble();
		System.out.println("Quantas horas você trabalhou este mês? ");
		double numeroHorasNoMes= leia.nextDouble();
		double salario = valorHoraTrabalhada*numeroHorasNoMes;
		System.out.println(" O seu salário este mês será de : " + salario);
		
	}

}
