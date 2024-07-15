package Application;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos deseja nos vetores? ");
        int n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        
        System.out.println("\nVetor C (soma dos elementos de A e B):");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }

}


