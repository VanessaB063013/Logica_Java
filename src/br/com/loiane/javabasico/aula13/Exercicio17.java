/*	7.Faça um Programa para uma loja de tintas. O programa deverá pedir o 
tamanho em metros quadrados da área a ser pintada. Considere que a 
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a 
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em 
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas 
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o 
menor. Acrescente 10% de folga e sempre arredonde os 
valores para cima, isto é, considere latas cheias.*/
package br.com.loiane.javabasico.aula13;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		System.out.println("entre com o tamanho em metros a ser pintado: ");
		double tamanhoMetros = leia.nextDouble();
		
		double tintaPequenaLitros = 3.6;
		double tintaPequenaCobertura= 21.6;
		double tintaPequenaPreco = 25.00;
		
		double tintaGrandeLitros = 18.00;
		double tintaGrandeCobertura= 108.00;
		double tintaGrandePreco = 80.00;
		
		
		double quantidadeTotalTintasGrande = tamanhoMetros/tintaGrandeCobertura ;
		double arredondamentoLataGrande = quantidadeTotalTintasGrande * 1.10;
		double quantidadeFinalTintaGrande = quantidadeTotalTintasGrande + arredondamentoLataGrande;
		double valorFinalLataGrande = quantidadeTotalTintasGrande * tintaGrandePreco ;
		
		double quantidadeTotalTintasPequena = tamanhoMetros/tintaPequenaCobertura;
		double arredondamentoLataPequena = quantidadeTotalTintasPequena * 1.10;
		double quantidadeFinalTintaPequena = quantidadeTotalTintasPequena + arredondamentoLataPequena;
		double valorFinalLataPequena = quantidadeTotalTintasPequena* tintaPequenaPreco;
		
		
		System.out.println("Escolha  uma opção: ");
		System.out.println("Digite 1 para usar apenas galões de 18L");
		System.out.println("Digite 2 para usar apenas galões de 3,6L");
		System.out.println("Digite 3 para usar ambos os galões ");
		int opcao = leia.nextInt();
		
		if(opcao==1) {
			
			System.out.println("Você usará " + quantidadeFinalTintaGrande + " latas de tinta e gastará R$" + valorFinalLataGrande );
			
			
		}
		
		
		
		// voce vai precisar de X galões de 18 e X galões de 3,6
		
		//quantidadeMetros>coberturaLataGrande
		
		
		
		
		
		

	}

}
