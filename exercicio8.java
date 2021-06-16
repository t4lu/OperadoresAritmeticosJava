package Exercícios;
/* Função: Exercício 8
Autora: Talu - Turma 25
Data: 16.06.2021
----------------
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor
e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28%
e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double cFabrica, impostos,custoConsumidor;
		double porcentagem, arredondarPorcentagem, arredondarImpostos;
		
		System.out.println("Digite o Custo de Fábrica do carro:");
		cFabrica = entrada.nextDouble();
		
		impostos = (0.45 * cFabrica);
		porcentagem = (0.28 *cFabrica);
		custoConsumidor = (impostos + porcentagem + cFabrica);
		
		arredondarPorcentagem = (porcentagem);
		arredondarImpostos = (impostos);
		
		System.out.println("O total dos Impostos é: R$" + arredondarImpostos);
		System.out.println("O total de custo com o distribuidor é: R$" + arredondarPorcentagem);
		System.out.println("O total de custos para o consumidor é: R$" + custoConsumidor);
		
		entrada.close();
	}
}