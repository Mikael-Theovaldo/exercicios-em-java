package exercicios.exerciciosGenericos;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int palpite = 0;
            char continuar = 's';

                System.out.println("----------------------");
                System.out.println("*  JOGO ADIVINHAÇÃO  *");
                System.out.println("----------------------");


                    int n = random.nextInt(11);
                    do {
                        while (palpite != n) {
                            System.out.println("Digite seu palpite: ");
                            palpite = scanner.nextInt();

                            if (palpite > n) {
                                System.out.println("Quase lá, o número secreto é MENOR");

                            } else if (palpite < n) {
                                System.out.println("Essa foi por pouco, o número secreto é MAIOR");

                            } else {
                                System.out.println("PARABÉNS, você acertou!");
                            }
                        }

                        System.out.println("Deseja jogar novamente?(s/n)");
                        continuar = scanner.next().charAt(0);

                    }while (continuar == 's' || continuar == 'S' );






        }
}

