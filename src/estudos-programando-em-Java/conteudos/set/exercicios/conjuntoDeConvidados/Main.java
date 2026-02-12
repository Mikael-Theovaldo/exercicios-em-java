package conteudos.set.exercicios.conjuntoDeConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("convidado 1", 1435);
        conjuntoConvidados.adicionarConvidado("convidado 2", 1435);
        conjuntoConvidados.adicionarConvidado("convidado 3", 7844);
        conjuntoConvidados.adicionarConvidado("convidado 4", 9012);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1435);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();



    }
}
