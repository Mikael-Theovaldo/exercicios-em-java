package conteudos.enumeracao.exercicios.sistemaDePedidos;

public class Pedido {
    int id;
    StatusPedidos status;

    public Pedido(int id, StatusPedidos status){
        this.id = id;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", status=" + status.getDescricao() + "}";
    }
}
