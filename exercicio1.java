package Exerc�cios;
/* Fun��o: Exerc�cio 1
Autora: Talu - Turma 25
Data: 16.06.2021
-----------------------
/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos,
 * meses e dias e mostre-a expressa apenas em dias.*/

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		
	int dias, meses, anos, idade;
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("H� quantos dias voc� aniversariou ou debutou esse m�s? ");
	dias = entrada.nextInt();
	
	System.out.println("H� quantos meses voc� aniversariou ou debutou? ");
	meses = entrada.nextInt();
	
	System.out.println("Quantos anos voc� tem?");
	anos = entrada.nextInt();
	
	idade = 365 * anos + meses * 30 + dias;
	
	System.out.println("Sua idade em dias �: " + idade + "! Uau!");
	
	entrada.close();
	}
}