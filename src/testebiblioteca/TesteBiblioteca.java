package testebiblioteca;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro l1 = new Livro("Capitães de Areia","Jorge Amado", 20, true);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 50, false);

        List<Livro> livrosList = new ArrayList<Livro>();
        livrosList.add(l1);
        livrosList.add(l2);

        Biblioteca b1 = new Biblioteca();
        b1.setCnpj("42715266000150");
        b1.setNome("Biblioteca Geral");
        b1.setLivros(livrosList);

        b1.imprimir();

        Biblioteca b2 = new Biblioteca("232650002-12", "Biblioteca da Bahia", livrosList);
        b2.imprimir();


    }
    
}
