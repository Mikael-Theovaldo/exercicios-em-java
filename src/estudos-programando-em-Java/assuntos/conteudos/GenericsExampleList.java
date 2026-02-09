package assuntos.conteudos;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {

        //  Exemplo sem GENERICS
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);   // permite adicionar qualquer tipo de objeto

        //  Exemplo com GENERICS
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //      Interando sobre a lista  COM GENERICS
        for(String elemento : listaGenerics){
            System.out.println(elemento);
        }

        //      Interando sobre a lista  SEM GENERICS ( Necessário fazer 'CAST' --> converter um valor de um tipo para outro)
        for(Object elemento : listaGenerics){
            String str = (String) elemento;
            System.out.println(elemento);
        }
    }
}
