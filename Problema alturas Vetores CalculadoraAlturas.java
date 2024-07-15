package entities;

import java.util.Scanner;

public class CalculadoraAlturas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // Coleta os dados das pessoas
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura (em metros) da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }

        // Calcula a média das alturas
        double somaAlturas = 0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        double mediaAlturas = somaAlturas / n;

        // Conta quantas pessoas têm menos de 16 anos
        int contMenoresDe16 = 0;
        for (int idade : idades) {
            if (idade < 16) {
                contMenoresDe16++;
            }
        }

        // Calcula a porcentagem de pessoas com menos de 16 anos
        double porcentagemMenoresDe16 = (contMenoresDe16 * 100.0) / n;

        System.out.println("\nMédia das alturas: " + mediaAlturas + " metros");
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagemMenoresDe16 + "%");

        // Mostra os nomes das pessoas com menos de 16 anos
        System.out.println("\nPessoas com menos de 16 anos:");
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
    }
}