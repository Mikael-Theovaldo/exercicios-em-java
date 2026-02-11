package exercicios.exerciciosGenericos;

import java.util.Scanner;
  
public class MediaAlunos {
    public static void main(String[]args) {

        Scanner dados = new Scanner(System.in);
        
        float n1 = 0;
        float n2 = 0;
        float media = 0;
        int cont = 0;
        int quant = 0;

        System.out.println("Informe a quantidade de alunos desejada para obter a média das notas: ");
        quant = dados.nextInt();
       
        do {
        String nome = dados.nextLine();
        System.out.println("Digite o nome do aluno:" );
        nome = dados.nextLine();
        System.out.println("Informe a primeira nota:" );
        n1 = dados.nextFloat();
        System.out.println("Informe a segunda nota:" );
        n2 = dados.nextFloat();
        media = (n1 + n2) / 2;
        if(media < 6) {
          System.out.println("Aluno "+ nome + " não obteve a média necessária: " + media);
        }
        else{
          System.out.println("Aluno " + nome + " obteve a média necessária: " + media);
        }
        
        cont = cont + 1;
      
        }while (cont < quant);
        
      


       


      


      
    }
}





