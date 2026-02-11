package exercicios.exerciciosGenericos;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int numeroAleatorio = random.nextInt(100) + 1;
            int palpite = 0;

            System.out.println("Tente adivinhar o número entre 1 e 100!");

            while (true) {
                try {
                    System.out.print("Digite seu palpite: ");
                    palpite = scanner.nextInt();

                    if (palpite < 1 || palpite > 100) {
                        System.out.println("Por favor, insira um número entre 1 e 100.");
                        continue;
                    }

                    if (palpite == numeroAleatorio) {
                        System.out.println("Parabéns! Você acertou!");
                        break;
                    } else if (palpite < numeroAleatorio) {
                        System.out.println("O número é maior.");
                    } else {
                        System.out.println("O número é menor.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                    scanner.next(); // Limpa a entrada inválida
                }
            }

            System.out.print("Deseja jogar novamente? (1 para Sim, 0 para Não): ");
            try {
                int resposta = scanner.nextInt();
                if (resposta == 0) {
                    jogarNovamente = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Encerrando o jogo.");
                jogarNovamente = false;
            }
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}
