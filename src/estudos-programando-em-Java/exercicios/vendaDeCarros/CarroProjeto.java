package exercicios.vendaDeCarros;
import java.util.Scanner;

public class CarroProjeto {
        public static void main( String [] args){
        
        Carro carro1 = new Carro();
        Comprador cliente = new Comprador();      
        
        Scanner leia = new Scanner (System.in);
        char compra;
        
        System.out.println("Informe seu nome:");
        cliente.nome = leia.nextLine();
        System.out.println("------------------Carros disponíveis-------------------");
        System.out.println("1- Chevrolet Onix\n" + 
                        "2- Volkswagen Golf\n" + 
                        "3- Ford Mustang\n" + 
                        "4- Toyota Corolla\n" + 
                        "5- Honda Civic\n" + 
                        "");
        
                        System.out.println("Digite o número que representa o carro de seu interesse: ");
                        int num = leia.nextInt();
                        System.out.println();

        switch (num) {
            case 1 :
                carro1.nome = "Chevrolet Onix";
                System.out.println(carro1.nome+"\n"+
                                "Preço: R$ 94.900\n"+
                                "Ano: 2025"); 
                System.out.println("Efetuar compra? (s/n)");
                compra = leia.next().charAt(0);
                    if (compra == 's' || compra == 'S'){
                        System.out.println("Cliente: " + cliente.nome + "\n"+
                                        "Carro: "+ carro1.nome +"\n"+
                                        "Venda efetuada com sucesso!" );
                    }
                    else if (compra == 'n' || compra == 'N'){
                        System.out.println("Obrigado! fique de olho nas promoções.");
                    }

                break;
            case 2 :
                carro1.nome = "Volkswagen Golf";
                System.out.println(carro1.nome+"\n"+
                                "Preço: R$ 63.500\n"+
                                "Ano: 2022");
                System.out.println("Efetuar compra? (s/n)");
                compra = leia.next().charAt(0);
                    if (compra == 's' || compra == 'S'){
                        System.out.println("Cliente: " + cliente.nome + "\n"+
                                        "Carro: "+ carro1.nome +"\n"+
                                        "Venda efetuada com sucesso!" );
                    }
                    else if (compra == 'n' || compra == 'N'){
                        System.out.println("Obrigado! fique de olho nas promoções.");
                    }
                break;
            case 3 :
                carro1.nome = "Ford Mustang";
                System.out.println(carro1.nome+"\n"+
                                "Preço: R$ 277.000\n"+
                                "Ano: 2018");
                System.out.println("Efetuar compra? (s/n)");
                compra = leia.next().charAt(0);
                    if (compra == 's' || compra == 'S'){
                        System.out.println("Cliente: " + cliente.nome + "\n"+
                                        "Carro: "+ carro1.nome +"\n"+
                                        "Venda efetuada com sucesso!" );
                    }
                    else if (compra == 'n' || compra == 'N'){
                        System.out.println("Obrigado! fique de olho nas promoções.");
                    }
                break;
            case 4 :
                carro1.nome = "Toyota Corolla";
                System.out.println(carro1.nome+"\n"+
                                "Preço: R$ 102.040\n"+
                                "Ano: 2020");
                System.out.println("Efetuar compra? (s/n)");
                compra = leia.next().charAt(0);
                    if (compra == 's' || compra == 'S'){
                        System.out.println("Cliente: " + cliente.nome + "\n"+
                                        "Carro: "+ carro1.nome +"\n"+
                                        "Venda efetuada com sucesso!" );
                    }
                    else if (compra == 'n' || compra == 'N'){
                        System.out.println("Obrigado! fique de olho nas promoções.");
                    }
                break;
            case 5 :
                carro1.nome = "Honda Civic";
                System.out.println(carro1.nome+"\n"+
                                "Preço: R$ 44.000\n"+
                                "Ano: 2008");
                System.out.println("Efetuar compra? (s/n)");
                compra = leia.next().charAt(0);
                    if (compra == 's' || compra == 'S'){
                        System.out.println("Cliente: " + cliente.nome + "\n"+
                                        "Carro: "+ carro1.nome +"\n"+
                                        "Venda efetuada com sucesso!" );
                    }
                    else if (compra == 'n' || compra == 'N'){
                        System.out.println("Obrigado! fique de olho nas promoções.");
                    }
                break;
            default:
                System.out.println("Opção errada.");
                break;
        }
    }
}
