package Application;

import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        int qtHomens = 0;
        int qtMulheres = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaMulheres = 0.0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Altura da pessoa " + (i + 1) + " (em centímetros): ");
            double altura = scanner.nextDouble();

            System.out.print("Gênero (M/F): ");
            char genero = scanner.next().charAt(0);

            if (genero == 'M') {
                qtHomens++;
            } else if (genero == 'F') {
                qtMulheres++;
                somaAlturaMulheres += altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / qtMulheres;

        System.out.println("Maior altura: " + maiorAltura + " cm");
        System.out.println("Menor altura: " + menorAltura + " cm");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " cm");
        System.out.println("Número de homens: " + qtHomens);

        scanner.close();
    }
}
	
		

