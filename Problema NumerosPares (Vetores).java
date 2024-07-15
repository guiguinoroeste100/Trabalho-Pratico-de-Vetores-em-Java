package entities;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja cadastrar? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("\nNúmeros pares:");
        int quantidadePares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                quantidadePares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + quantidadePares);
    }
}

		

	