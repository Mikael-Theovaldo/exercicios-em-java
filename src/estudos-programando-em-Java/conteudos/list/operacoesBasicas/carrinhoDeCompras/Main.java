package conteudos.list.operacoesBasicas.carrinhoDeCompras;

public class Main {
    public static void main(String[]args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("banana", 1.99, 4);
        carrinho.adicionarItem("maça", 6.25, 4);
        carrinho.adicionarItem("melão", 4.99, 4);
        carrinho.adicionarItem("tomate", 0.75, 4);
        carrinho.adicionarItem("cebola", 0.60, 4);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();


    }
}
