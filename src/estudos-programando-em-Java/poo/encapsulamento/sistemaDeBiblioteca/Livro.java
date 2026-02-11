package poo.encapsulamento.sistemaDeBiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    //  construtor
    public Livro(String tit, String aut, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }
}
