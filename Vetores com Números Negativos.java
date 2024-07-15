package entities;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Lê o número inteiro positivo N
        System.out.print("Digite um número inteiro positivo (máximo 10): ");
        int N = scanner.nextInt();

        // Verifica se N está dentro do limite
        if (N > 0 && N <= 10) {
            int[] numeros = new int[N];

            // Lê os N números inteiros e armazena no vetor
            System.out.println("Digite " + N + " números inteiros:");
            for (int i = 0; i < N; i++) {
                numeros[i] = scanner.nextInt();
            }

            // Mostra os números negativos lidos
            System.out.println("Números negativos lidos:");
            for (int i = 0; i < N; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("O número deve ser positivo e no máximo 10.");
        }

        scanner.close();
    }


	}


