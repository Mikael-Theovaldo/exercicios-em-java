package conteudos.enumeracao.exercicios.sistemaDePedidos;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1232, StatusPedidos.CRIANDO);
        System.out.println(pedido);
    }
}
