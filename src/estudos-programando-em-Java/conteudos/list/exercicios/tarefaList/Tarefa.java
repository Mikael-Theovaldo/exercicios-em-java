package conteudos.list.exercicios.tarefaList;

public class Tarefa {

    // atributo privado
    private String descricao;

    //construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }


    @Override
    public String toString() {
        return descricao ;
    }
}
