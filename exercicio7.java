package Exerc�cios;
/* Fun��o: Exerc�cio 7
Autora: Talu - Turma 25
Data: 16.06.2021
-----------------

Escreva um sistema que l� os coeficientes a,b,c,d,e e f
e calcula e mostra os valores de x e y. 
*/

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double a, b, c, d, e, f, x,y;
		
		System.out.println("Qual � o valor de A?");
		a = entrada.nextDouble();
		
		System.out.println("Qual � o valor de B?");
		b = entrada.nextDouble();
		
		System.out.println("Qual � o valor de C?");
		c = entrada.nextDouble();
		
		System.out.println("Qual � o valor de D?");
		d = entrada.nextDouble();
		
		System.out.println("Qual � o valor de E?");
		e = entrada.nextDouble();
		
		System.out.println("Qual � o valor de F?");
		f = entrada.nextDouble();
		
		x = ((c*e) - (b*f) / (a*e) - (b*d));
		y = ((a*f) - (c*d) / (a*e) - b*d);
		
		System.out.println("O valor de x �: " + x);
		System.out.println("O valor de y �: " + y);
		
		entrada.close();
		
	}
}
