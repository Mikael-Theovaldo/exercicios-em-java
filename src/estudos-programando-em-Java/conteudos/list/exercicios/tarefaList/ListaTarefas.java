package conteudos.list.exercicios.tarefaList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List <Tarefa> tarefalist;

    public ListaTarefas(){
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasPararemover = new ArrayList<>();
       if(!tarefalist.isEmpty()) {
           for (Tarefa t : tarefalist) {
               if (t.getDescricao().equalsIgnoreCase(descricao)) {
                   tarefasPararemover.add(t);
               }
           }

           tarefalist.removeAll(tarefasPararemover);
       }else{
           System.out.println("A lista está vazia!");
       }
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterdescricoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("O número total de tarefas da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.obterdescricoesTarefas();

        System.out.println("O número total de tarefas da lista é: " + listaTarefa.obterNumeroTotalTarefas());


    }

}
