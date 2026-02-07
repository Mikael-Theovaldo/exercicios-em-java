
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String  agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Por favor! digite seu nome:");
        nomeCliente = sc.nextLine();
        System.out.println("Informe sua agência:");
        agencia = sc.nextLine();
        System.out.println("Digite o número da sua conta:");
        numero = sc.nextInt();
        System.out.println("Informe o saldo:");
        saldo = sc.nextDouble();
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

