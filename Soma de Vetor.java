package entities;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Lê o número inteiro positivo N
        System.out.print("Digite o número de elementos (N): ");
        int N = scanner.nextInt();

        // Declara o vetor para armazenar os números reais
        double[] numeros = new double[N];

        // Lê os N números reais e armazena no vetor
        System.out.println("Digite " + N + " números reais:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Imprime todos os elementos do vetor
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < N; i++) {
            System.out.println(numeros[i]);
        }

        // Calcula a soma e a média dos elementos do vetor
        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma += numeros[i];
        }
        double media = soma / N;

        // Mostra a soma e a média dos elementos do vetor
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);

        scanner.close();
    }


}
