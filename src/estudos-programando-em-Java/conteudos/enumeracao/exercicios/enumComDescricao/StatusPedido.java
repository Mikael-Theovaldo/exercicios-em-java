package conteudos.enumeracao.exercicios.enumComDescricao;

public enum StatusPedido {
    PENDENTE("Aguardando pagamento"),
    PAGO("Pagamento confirmado"),
    ENVIADO("Pedido enviado"),
    ENTREGE("Pedido entregue");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
