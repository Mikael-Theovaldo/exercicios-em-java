package assuntos.comparableXcomparator;
import java.util.Comparator;

    // classe Livro que implementa Comparable
public class Livro implements Comparable<Livro> {
        private String titulo;
        private String autor;
        private int ano;

        //  construtor
        public Livro(String tit, String aut, int ano){
            this.titulo = tit;
            this.autor = aut;
            this.ano = ano;
        }

        //  usado para ordenar livros por ano
        public int compateTo(Livro 1){
            return titulo.compareTo(1.titulo);
        }

        //  metodos getters para acessar os dados privados
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAno() {
            return ano;
        }

        class CompararAnoAutorTitulo implements Comparator<Livro>{
            @Override
            public int compare(Livro l1, Livro l2){
                int ano = Integer.compare(l1.getAno(), 12.getAno());
                if(ano!= 0)
                    return ano;

                int autor = l1.getAutor().compareTo(l2.getAutor());
                if (autor != 0)
                    return autor;

                return l1.getTitulo().compareTo(l2.getTitulo());
            }
        }


    }
