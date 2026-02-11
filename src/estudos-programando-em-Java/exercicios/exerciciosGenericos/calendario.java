package exercicios.exerciciosGenericos;


public class calendario {
    public static void main(String[] args) {
    
        System.out.println("Calendário 2025:");
    
        for (int dia = 1; dia <= 31; dia ++) {
            System.out.printf("%02d ", dia);
            if (dia % 7 == 0) {
                System.out.println(); // Nova linha a cada 7 dias
            }
        }
        
       
   
   
   
   
    }
}
