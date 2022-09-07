package testebiblioteca;

import java.util.List;

public class Biblioteca {
    private String cnpj;
    private String nome;
    private List<Livro> livros;

    public Biblioteca() {
    }

    public Biblioteca(String cnpj, String nome, List<Livro> livros) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.livros = livros;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void imprimir(){
        System.out.println(
            "Biblioteca: \n CNPJ: " + cnpj +
            "\nNome: " + nome
            );

        for(Livro li: livros) {
            li.Imprimir();
        }
    }

    

    

    
    
}
