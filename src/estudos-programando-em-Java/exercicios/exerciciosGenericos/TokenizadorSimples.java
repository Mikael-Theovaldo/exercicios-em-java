package exercicios.exerciciosGenericos;

import java.util.StringTokenizer;

public class TokenizadorSimples {
    public static void main(String[] args) {
        String texto = "Java é uma linguagem poderosa para PLN!";
        StringTokenizer tokenizer = new StringTokenizer(texto);

        System.out.println("Palavras encontradas:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
