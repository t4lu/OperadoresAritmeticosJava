package Exercícios;
/* Função: Exercício 6
Autora: Talu - Turma 25
Data: 16.06.2021
-----------------
Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
*/

import java.util.Scanner;


public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double x1, x2, y1, y2;
		double px, py, p;
		
		System.out.println("Qual é o valor de x1?");
		x1 = entrada.nextDouble();
		
		System.out.println("Qual é o valor de x2?");
		x2 = entrada.nextDouble();
		
		System.out.println("Qual é o valor de y1?");
		y1 = entrada.nextDouble();
		
		System.out.println("Qual é o valor de y2?");
		y2 = entrada.nextDouble();
		
		px = (x2 - x1) * (x2 - x1);
		py = (y2 - y1) * (y2 - y1);
	
		p = Math.sqrt(px + py);
				
		System.out.println("A distância entre os dois pontos é: " + p);
		entrada.close();
	}
}