package testebiblioteca;
public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor, int isbn, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String EmprestadoDevolvido(){
        if (emprestado == true){
            return "Livro Emprestado";
        } else {
            return "Livro Devolvido";
        }
    }

    public void Imprimir(){
        System.out.println(
            "Título do Livro: " + titulo +
            "\nAutor: " + autor +
            "\nISBN: " + isbn + "\n" +
            EmprestadoDevolvido()
        );
    }


}
    

