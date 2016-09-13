import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 256.254624444343434 on 12/09/2016.
 */
public class Biblioteca {
    private String nome;
    Scanner ler = new Scanner(System.in);
    ArrayList <Livro> listaLivros;
    ArrayList <Autor> listaAutor;
    ArrayList <Editora> listaEditora;


    public Biblioteca(String nome)
    {
        this.nome = nome;
        listaLivros = new ArrayList<Livro>();
        listaAutor = new ArrayList<Autor>();
        listaEditora = new ArrayList<Editora>();


    }

    public void addLivro(){

        String titulo;
        String numeroPaginas;
        String numeroExemplares;

        System.out.println("**** Cadastrando Livro ****");
        do{
            System.out.printf("Nome do Livro: ");
            titulo = ler.next();
            if (titulo.length() < 5){
                System.out.println("*** Digite um nome com mais de 5 caracteres *** ");
                titulo="";
            }
        }while (titulo =="");

        System.out.printf("Numero de Paginas: ");
        numeroPaginas = ler.next();
        System.out.printf("Numero de Exemplares: ");
        numeroExemplares = ler.next();


        Livro livro = new Livro(titulo,numeroPaginas,numeroExemplares,addAutor(),addEditora());
        listaLivros.add(livro);
        System.out.println("*** Livro Cadastrado com Sucesso! ***");
        /*atualização*/
    }


    public Autor addAutor(){
        String nome, sobrenome, email;
        Autor autor;
        System.out.println("*** Cadastrando Autor ***");
        do{
            System.out.printf("Nome: ");
            nome = ler.next();

            if (!nome.matches("^[A-Za-z]*$")){
                System.out.println("Informe Nome Valido!: ");
                nome = "";
            }
        }while (nome == "");


        System.out.printf("Sobrenome: ");
        sobrenome = ler.next();
        System.out.printf("email: ");
        email = ler.next();
        autor = new Autor(nome,sobrenome,email);
        listaAutor.add(autor);
        return autor;

    }


    public Editora addEditora(){
        String nome, endereco, email;
        Editora editora;
        System.out.println("*** Cadastrando Editora ***");
        System.out.printf("Nome: ");
        nome = ler.next();
        System.out.printf("Endereco: ");
        endereco = ler.next();
        do{
            System.out.printf("Email: ");
            email = ler.next();
            if (!email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$")){
                System.out.println("Informe um email valido!");
                email = "";
            }

        }while (email=="");

        editora = new Editora(nome, endereco,email);
        listaEditora.add(editora);
        return editora;
    }

    public void editarLivro() {
        String busca;
        String titulo;
        String numeroPaginas;
        String numeroExemplares;
        System.out.println("*** Editando Livro ***");
        System.out.printf("Informe o Nome do Livro para busca:  ");
        busca = ler.next();
            for (int i = 0; i < listaLivros.size(); i++) {
                if (busca.equals(listaLivros.get(i).getTitulo())) {
                    System.out.println("Nome do Livro:  " + listaLivros.get(i).getTitulo());
                    System.out.println("*** Informe Novos dados Para esse Livro *** ");


                    System.out.printf("Nome do Livro: ");
                    titulo = ler.next();
                    System.out.printf("Numero de Paginas: ");
                    numeroPaginas = ler.next();
                    System.out.printf("Numero de Exemplares: ");
                    numeroExemplares = ler.next();
                    Autor autor= addAutor();
                    Editora editora = addEditora();

                    listaLivros.get(i).setLivro(titulo, numeroPaginas, numeroExemplares, autor, editora);

                    System.out.println("*** Livro " + listaLivros.get(i).getTitulo() + " Alterado com Sucesso! ***");
                    System.out.println();
                    System.out.println();

                }
            }
         }
        public void tipoBusca(){
        int opcao=0;
        String busca;
        System.out.println("*** BUSCA DIVERSAS ***");
        System.out.printf("Informe Tipo de Busca 1- editor | 2- autor | 3- titulo do livro");
        opcao = ler.nextInt();
        switch (opcao){
            case 1:{
                System.out.printf("Informe Nome do Editora: ");
                busca = ler.next();
                for(int i=0; i < listaLivros.size(); i++){
                    if(busca.equals(listaEditora.get(i).getNome())){
                        System.out.println("*** LISTAGEM DO LIVRO A BAIXO ***");
                        System.out.println("Titulo: "+listaLivros.get(i).getTitulo());
                        System.out.println("Numero Paginas: "+listaLivros.get(i).getnPaginas());
                        System.out.println("Numero Exemplares: "+listaLivros.get(i).getnExemplares());
                        System.out.println("Autor: "+listaAutor.get(i).getNome()+" "+listaAutor.get(i).getSobrenome());
                        System.out.println("Email: "+listaAutor.get(i).getEmail());
                        System.out.println("Editora: "+listaEditora.get(i).getNome());
                        System.out.println("Endereco: "+listaEditora.get(i).getEndereco());
                        System.out.println("Email: "+listaEditora.get(i).getEmail());
                    }
                }
                break;
            }

            case 2:{
                System.out.printf("Informe Nome do Autor: ");
                busca = ler.next();
                for(int i=0; i < listaLivros.size(); i++){
                    if(busca.equals(listaAutor.get(i).getNome())){
                        System.out.println("*** LISTAGEM DO LIVRO A BAIXO ***");
                        System.out.println("Titulo: "+listaLivros.get(i).getTitulo());
                        System.out.println("Numero Paginas: "+listaLivros.get(i).getnPaginas());
                        System.out.println("Numero Exemplares: "+listaLivros.get(i).getnExemplares());
                        System.out.println("Autor: "+listaAutor.get(i).getNome()+" "+listaAutor.get(i).getSobrenome());
                        System.out.println("Email: "+listaAutor.get(i).getEmail());
                        System.out.println("Editora: "+listaEditora.get(i).getNome());
                        System.out.println("Endereco: "+listaEditora.get(i).getEndereco());
                        System.out.println("Email: "+listaEditora.get(i).getEmail());
                    }
                }
                break;
            }
            case 3:{
                System.out.printf("Informe Titulo do Livro: ");
                busca = ler.next();
                for(int i=0; i < listaLivros.size(); i++){
                    if(busca.equals(listaLivros.get(i).getTitulo())){
                        System.out.println("*** LISTAGEM DO LIVRO A BAIXO ***");
                        System.out.println("Titulo: "+listaLivros.get(i).getTitulo());
                        System.out.println("Numero Paginas: "+listaLivros.get(i).getnPaginas());
                        System.out.println("Numero Exemplares: "+listaLivros.get(i).getnExemplares());
                        System.out.println("Autor: "+listaAutor.get(i).getNome()+" "+listaAutor.get(i).getSobrenome());
                        System.out.println("Email: "+listaAutor.get(i).getEmail());
                        System.out.println("Editora: "+listaEditora.get(i).getNome());
                        System.out.println("Endereco: "+listaEditora.get(i).getEndereco());
                        System.out.println("Email: "+listaEditora.get(i).getEmail());
                    }
                }
                break;
            }
        }
        }

        public void deletaLivro(){
            String deleta;
            System.out.println("Informe nome do Livro a Ser deletado: ");
            deleta = ler.next();

            for(int i=0; i <listaLivros.size(); i++){
                if(deleta.equals(listaLivros.get(i).getTitulo())){
                    listaLivros.remove(i);
                    System.out.println("*** Livro deletado com Sucesso! ***");
                }
            }
        }






}
