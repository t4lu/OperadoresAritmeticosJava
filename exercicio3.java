package Exerc�cios;
/* Fun��o: Exerc�cio 3
Autora: Talu - Turma 25
Data: 16.06.2021
-----------------------
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento
 * em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.  */

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int hora, minuto, duracaoSegundos;
		
		System.out.println("Qual foi a dura��o do seu evento em segundos?");
		duracaoSegundos = entrada.nextInt();
		
		hora = duracaoSegundos / (60 * 60);//calcula primeiro a multiplicacao
		minuto = (duracaoSegundos % (60*60)) /60;
		
	//	minuto = duracaoSegundos /60; necessario SOMENTE se eu quisesse saber os minutos do evento.
		
		System.out.println("Seu evento durou " + hora + " hora(s), e " + minuto + " minuto(s).");
		
		entrada.close();
	}
}
