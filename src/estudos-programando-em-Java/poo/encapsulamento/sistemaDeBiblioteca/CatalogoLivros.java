package poo.encapsulamento.sistemaDeBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private static List <Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public CatalogoLivros(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo,autor,ano));
    }

    public static void adicionarLivro(String titulo, String autor, int ano) {
    }

    public static List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livrosPorAntervaloAnos.add(l);
                }

            }
        }
        return livrosPorAntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }

            }
        }
        return livroPorTitulo;

    }









}
