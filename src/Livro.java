import java.util.Scanner;

/**
 * Created by 256.254624444343434 on 11/09/2016.
 */
public class Livro {
    private  String titulo;
    private  String nPaginas;
    private  String nExemplares;
    private  Autor autor;
    private Editora editora;

    public Livro (String titulo, String numeroPaginas, String numeroExemplares, Autor autor, Editora editora){
        this.titulo = titulo;
        this.nPaginas = numeroPaginas;
        this.nExemplares = numeroExemplares;
        this.autor = autor;
        this.editora = editora;
    }
    public  String getTitulo(){
        return titulo;
    }
    public String getnPaginas(){
        return nPaginas;
    }
    public String getnExemplares(){
        return nExemplares;
    }
    public Autor getAutor(){
        return autor;
    }
    public Editora getEditora(){
        return editora;
    }

    public void setLivro(String titulo, String nPaginas, String nExemplares, Autor autor, Editora editora){
        this.titulo = titulo;
        this.nPaginas = nPaginas;
        this.nExemplares = nExemplares;
        this.autor = autor;
        this.editora = editora;
    }




}
