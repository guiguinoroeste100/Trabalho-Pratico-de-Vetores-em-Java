package Application;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de elementos no vetor: ");
        int N = scanner.nextInt();

        int[] vetor = new int[N];
        int somaPares = 0;
        int countPares = 0;

        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                countPares++;
            }
        }

        if (countPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaPares = (double) somaPares / countPares;
            System.out.printf("Média dos números pares: %.1f%n", mediaPares);
        }
    }
}


