import java.util.Scanner;

public class Libro {
    private Integer ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer nº_copias = 1;
    private Integer nº_copias_disponibles = 1;
    private Integer contador;

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public Libro() {

    }

    public Libro(Integer ISBN, String titulo, String autor, String editorial, Integer nº_copias, Integer nº_copias_disponibles, Integer contador) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.nº_copias = nº_copias;
        this.nº_copias_disponibles = nº_copias_disponibles;
        this.contador = contador;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getNº_copias() {
        return nº_copias;
    }

    public void setNº_copias(Integer nº_copias) {
        this.nº_copias = nº_copias;
        if (this.nº_copias == 0) {
            System.out.println("No hay copias disponible");
        }
    }

    public Integer getNº_copias_disponibles() {
        return nº_copias_disponibles;
    }

    public void setNº_copias_disponibles(Integer nº_copias_disponibles) {
        this.nº_copias_disponibles = nº_copias_disponibles;
    }

    public static void añadirLibro() {
        Libro libro = new Libro();
        Scanner pedir_libros = new Scanner(System.in);
        System.out.println("Escriba el titulo del libro ");
        String titulo = pedir_libros.nextLine();
        libro.setTitulo(titulo);
        System.out.println("Deme el ISBN del libro ");
        Integer ISBN = Integer.parseInt(pedir_libros.nextLine());
        libro.setISBN(ISBN);
        System.out.println("Que autor tiene el libro");
        String autor=pedir_libros.nextLine();
        libro.setAutor(autor);
        System.out.println("A que editorial pertenece");
        String editorial= pedir_libros.nextLine();
        libro.setEditorial(editorial);

    }
public static void eliminarLibro(){

}
}

