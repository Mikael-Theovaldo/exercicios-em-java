package conteudos.map.exercicios.pesquisaMap;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.adicionarProduto(1L, "Produto A",10,4.99);
        estoque.adicionarProduto(2L, "Produto B",6,9.50);

        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }
}
