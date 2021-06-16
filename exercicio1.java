package Exercícios;
/* Função: Exercício 1
Autora: Talu - Turma 25
Data: 16.06.2021
-----------------------
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 * meses e dias e mostre-a expressa apenas em dias.*/

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		
	int dias, meses, anos, idade;
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Há quantos dias você aniversariou ou debutou esse mês? ");
	dias = entrada.nextInt();
	
	System.out.println("Há quantos meses você aniversariou ou debutou? ");
	meses = entrada.nextInt();
	
	System.out.println("Quantos anos você tem?");
	anos = entrada.nextInt();
	
	idade = 365 * anos + meses * 30 + dias;
	
	System.out.println("Sua idade em dias é: " + idade + "! Uau!");
	
	entrada.close();
	}
}