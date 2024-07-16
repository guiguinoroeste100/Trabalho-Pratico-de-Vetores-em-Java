package Application;

import java.util.Scanner;

public class AlunosAprovados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        String[] nomes = new String[quantidadeAlunos];
        double[] notas1 = new double[quantidadeAlunos];
        double[] notas2 = new double[quantidadeAlunos];

        
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.print("Nota do 1º semestre: ");
            notas1[i] = scanner.nextDouble();

            System.out.print("Nota do 2º semestre: ");
            notas2[i] = scanner.nextDouble();
        }

        
        for (int i = 0; i < quantidadeAlunos; i++) {
            double media = (notas1[i] + notas2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println("Aluno(a) " + nomes[i] + " aprovado(a) com média " + media);
            }
        }

        scanner.close();
    }


}


