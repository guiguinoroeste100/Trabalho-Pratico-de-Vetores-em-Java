package Application;

import java.util.Scanner;

public class AbaixoDaMédia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de elementos no vetor: ");
        int N = scanner.nextInt();

        double[] vetor = new double[N];
        double soma = 0.0;

        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        
        double media = soma / N;

        
        System.out.printf("Média aritmética: %.3f%n", media);

        
        System.out.println("Elementos abaixo da média:");
        for (double elemento : vetor) {
            if (elemento < media) {
                System.out.printf("%.1f%n", elemento);
            }
        }
    }
}
		

		

