package Exerc�cios;
/* Fun��o: Exerc�cio 2
Autora: Talu - Turma 25
Data: 16.06.2021
-----------------------
2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

import java.util.Scanner;
public class exercicio2 {
	
	public static void main(String[] args) {
		int ano, dias, meses, idade;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantos dias de vida voc� tem?");
		idade = entrada.nextInt();
		
		ano = idade / 365;//vou dividir a idade do usuario em dias por 365 (1ano)
		meses = (idade %365) / 30; // divido o resto dos "anos" por 30 (media de dias em um m�s)
		dias = (idade %365) %30;
		
		System.out.println("Voc� tem " + ano + " anos, " + meses + " meses e " + dias + " dias. For�as �cone!");
		entrada.close();
	}
}