package exercicios.exerciciosGenericos;
import java.util.Scanner;

public class CalculaePesoPeixe {
    public static void main ( String [] args){
       
        Scanner input = new Scanner( System.in);

        int quantidade = 0;
        int contador = 1;
        float peso = 0;
        float pesoTotal = 0;
        float excesso = 0;
        float limite = 50;
        float multa = 4;

        System.out.println("Informe a quantidade de peixes pescados: ");
        quantidade = input.nextInt();
        System.out.println("");

        do{
            System.out.println("Informe o peso do peixe "+ contador + " em (kg): ");
            peso = input.nextFloat();
            System.out.println("Peso do peixe "+ contador + ": "+ peso + " Kg");
            contador = contador + 1;
            pesoTotal = pesoTotal + peso;
        } while(contador < (quantidade + 1));

        System.out.println("---------------------------------------------------");

        if(pesoTotal > limite){
            excesso = pesoTotal - limite;
            multa = multa * excesso;

            System.out.println("Ops, houve um excesso do peso permitido");
            System.out.println("Peso permitido de até 50 kg");
            System.out.println("Peso total: " + pesoTotal + " kg");
            System.out.println("Excesso de peso: "+ excesso + " kg");
            System.out.println("Multa aplicada: "+ multa + " reais");
        }
        else{
            System.out.println("Peso total de peixes: "+ pesoTotal+ " kg");
        }







    }
}
    