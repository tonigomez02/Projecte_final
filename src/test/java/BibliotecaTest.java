import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class BibliotecaTest {
// Comprobacón Nombre correcto biblioteca
    @Test
    void comprovarMajuscula(){
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu el nom de la biblioteca");
        String nomBiblio = scanner.nextLine();
        biblioteca.setNombre(nomBiblio);

    }

    @Test
    //Creacion de instancia de libros
    void añadirLibro(){
        Libro libro = new Libro();
        libro.añadirLibro();
    }

}
