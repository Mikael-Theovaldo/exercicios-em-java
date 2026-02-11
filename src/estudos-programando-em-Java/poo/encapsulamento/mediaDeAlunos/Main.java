package poo.encapsulamento.mediaDeAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Mikael","201337756",8,6,7.5);
        Scanner sc = new Scanner(System.in);

        aluno.getNome();
        aluno.getMatricula();
        aluno.verificarAprovacao();


    }
}
