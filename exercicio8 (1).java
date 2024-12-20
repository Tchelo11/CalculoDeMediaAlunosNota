import java.util.Scanner;

public class exercicio8 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    for (int aluno = 1; aluno <= 5; aluno++) {
        double nota1 = 0;
        double nota2 = 0;

        do {
            System.out.print("Digite a primeira nota do aluno " + aluno + " (entre 0 e 10): ");
            nota1 = scanner.nextDouble();

            if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            }
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a segunda nota do aluno " + aluno + " (entre 0 e 10): ");
            nota2 = scanner.nextDouble();

            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            }
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média do aluno %d é: %.2f\n", aluno, media);
        }
    }
}
