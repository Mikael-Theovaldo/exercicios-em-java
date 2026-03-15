package conteudos.enumeracao.exercicios.sistemaDePedidos;

public enum StatusPedidos {
    CRIANDO("Criando pedido"),
    PAGO("Pedido pago"),
    ENVIADO("Pedido enviado"),
    CANELADO("Pedido cancelado");

    String descricao;

    StatusPedidos(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
