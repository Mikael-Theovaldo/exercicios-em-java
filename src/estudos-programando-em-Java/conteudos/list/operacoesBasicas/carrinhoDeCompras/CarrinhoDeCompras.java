package conteudos.list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List <Item> listItem = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        listItem.add(new Item(nome,preco, quantidade));
    }

    /*public void removerItem(Item item){
        List <Item> itemremovido = new ArrayList<>();
        if(item.getNome().equalsIgnoreCase(g)){
            for (Item i : listItem){
                if(i.getNome().)
            }
        }
        listItem.remove(new Item(nome));
    }*/

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : listItem){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println(valorTotal);
    }

    public void exibirItens(){
        System.out.println(listItem);
    }

}
