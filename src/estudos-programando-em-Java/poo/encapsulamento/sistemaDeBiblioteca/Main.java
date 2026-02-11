package poo.encapsulamento.sistemaDeBiblioteca;


import static poo.encapsulamento.sistemaDeBiblioteca.CatalogoLivros.adicionarLivro;

public class Main {
    public static void main(String[] args) {
        adicionarLivro("Livro 1", " Autor 1", 1998);
        adicionarLivro("Livro 2", " Autor 2", 1999);
        adicionarLivro("Livro 3", " Autor 3", 1996);
        adicionarLivro("Livro 4", " Autor 4", 1995);
        adicionarLivro("Livro 5", " Autor 5", 1993);
        adicionarLivro("Livro 6", " Autor 6", 1990);
        adicionarLivro("Livro 7", " Autor 7", 1991);
        System.out.println(CatalogoLivros.pesquisarPorAutor("Autor 2"));

    }
}
