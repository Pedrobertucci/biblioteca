import java.util.Scanner;

/**
 * Created by 256.254624444343434 on 11/09/2016.
        */
public class Editora {
    private String nome;
    private String endereco;
    private String email;

    public Editora(String nome, String endereco, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    public String getNome(){
        return  nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return endereco;
    }


    public void setEditora(String nome, String endereco, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
}
