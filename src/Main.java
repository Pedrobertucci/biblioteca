import java.util.Scanner;

/**
 * Created by 256.254624444343434 on 11/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal de Capao da Canoa ");
        int cont=0;
        int opcao=0;
        try (Scanner ler = new Scanner(System.in)) {


            System.out.println("*** Sistema de Biblioteca ***");
            do {
                System.out.println(" 1-Cadastra Livro | 2- Editar Livro | 3-Deletar Livro |  4-Buscar | 5-Sair ");
                opcao = ler.nextInt();
                switch (opcao) {
                    case 1: {
                        biblioteca.addLivro();
                        break;
                    }
                    case 2:{
                        biblioteca.editarLivro();
                        break;
                    }
                    case 3:{
                        biblioteca.deletaLivro();
                        break;
                    }
                    case 4:{
                        biblioteca.tipoBusca();
                        break;
                    }


                }


            } while (opcao != 5);
        }







    }
}
