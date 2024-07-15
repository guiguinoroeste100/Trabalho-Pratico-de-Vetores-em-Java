package Application;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja cadastrar? ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        
        double maiorNumero = numeros[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("\nO maior número é: " + maiorNumero);
        System.out.println("Posição do maior elemento: " + posicaoMaior);
    }


}


