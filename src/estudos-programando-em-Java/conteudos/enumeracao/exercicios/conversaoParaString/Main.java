package conteudos.enumeracao.exercicios.conversaoParaString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma String ( NORTE, SUL, LESTE, OESTE");
        String opcao = sc.nextLine().toUpperCase();
        System.out.println(Direcao.valueOf(opcao));
    }
}
