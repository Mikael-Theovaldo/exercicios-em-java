package conteudos.map.exercicios.agenda;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Theo", 77777777);
        agendaContatos.adicionarContato("Theo", 77777777);
        agendaContatos.adicionarContato("Theovaldo", 56456456);
        agendaContatos.adicionarContato("Theo Silva", 78790545);
        agendaContatos.adicionarContato("Theo Carvalho", 123454534);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Theo Silva");
        agendaContatos.exibirContato();

    }
}
