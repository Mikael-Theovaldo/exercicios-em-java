import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {

       try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("digite sua idade:");
            int idade = scanner.nextInt();
       }
       catch (InputMismatchException e) {
           System.out.println("o campo idade precisa ser numerico (inteiro)");
       }
    }
}
