package Exerc�cios;
/* Fun��o: Exerc�cio 4
Autora: Talu - Turma 25
Data: 16.06.2021
*/

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int a,b,c;
		int r = 0, s = 0, d;
		
		System.out.println("Qual � o valor de A?");
		a = entrada.nextInt();
		
		System.out.println("Qual � o valor de B?");
		b = entrada.nextInt();
		
		System.out.println("Qual � o valor de C?");
		c = entrada.nextInt();
		
		r = (a + b)  * (a + b);
		s = (b + c)  * (b + c);
		d = (r + s) / 2;
		
		System.out.println("O resultado �: " + d);
		
		entrada.close();
	}
}