/*	Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela 
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/

package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Quanto você ganha por hora trabalhada? ");
		double horaTrabalho = leia.nextDouble();
		System.out.println("Quantas hotas você trabalha por mês? ");
		double horasMes = leia.nextDouble();
		double salarioBruto = horaTrabalho*horasMes;
		System.out.println("Seu salário bruto é de R$ " + salarioBruto);
		double iR = 11.00/100.00;
		double iNss = 8.00/100.00;
		double sindicato = 5.00/100.00;
		double valorIr =  (iR*salarioBruto);
		System.out.println("Você paga R$ " + valorIr + " de imposto de renda");
		double valorInss = (iNss*salarioBruto);
		System.out.println("Você paga R$ " + valorInss + " de INSS");
		double valorSindicato = (sindicato*salarioBruto);
		System.out.println("Você paga R$ " + valorSindicato + " para o sindicato");
		double salarioLiquido = salarioBruto-valorIr-valorInss-valorSindicato;
		System.out.println("Portanto, seu salário líquido é de R$ " + salarioLiquido);
	}

}
