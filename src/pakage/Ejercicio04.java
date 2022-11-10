package pakage;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		int i;
		
		
		System.out.print("Introduzca un número: ");
		n = Integer.parseInt(teclado.nextLine());
		
		
		i = 1;
		while(i<=n) {
			System.out.print(i);
			i++;
			

		}
		System.out.println();
		
		i = 1;
		do {
			System.out.print(i);
			i++;
		}while(i<=n);
			System.out.print(i);
			
		}
		

}

