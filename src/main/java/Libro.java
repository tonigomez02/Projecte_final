import java.util.Scanner;

public class Libro {
    private Integer ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer nº_copias = 1;
    private Integer nº_copias_disponibles = 1;


    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", nº_copias=" + nº_copias +
                ", nº_copias_disponibles=" + nº_copias_disponibles +
                '}';
    }

    public Libro() {

    }

    public Libro(Integer ISBN, String titulo, String autor, String editorial) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;

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

    //Mètode verificat
    public static void añadirLibro() {
        Libro libro = new Libro();
        Scanner pedir_libros = new Scanner(System.in);
        boolean entrada = true;
        int ayuda = 0;

        System.out.println("Escriba el titulo del libro ");
        String titulo = pedir_libros.nextLine();
        libro.setTitulo(titulo);
        System.out.println("Deme el ISBN del libro ");
        Integer ISBN = Integer.parseInt(pedir_libros.nextLine());
        libro.setISBN(ISBN);
        System.out.println("Que autor tiene el libro");
        String autor = pedir_libros.nextLine();
        libro.setAutor(autor);
        System.out.println("A que editorial pertenece");
        String editorial = pedir_libros.nextLine();
        libro.setEditorial(editorial);
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {

            if (entrada) {
                if (Biblioteca.getLista_libros().get(i).getISBN().equals(ISBN)) {
                    Biblioteca.getLista_libros().get(i).setNº_copias(Biblioteca.getLista_libros().get(i).getNº_copias() + 1);
                    Biblioteca.getLista_libros().get(i).setNº_copias_disponibles(Biblioteca.getLista_libros().get(i).getNº_copias_disponibles() + 1);
                    entrada = false;
                } else{
                    ayuda +=1;
                }
            }

        }
        if (ayuda == Biblioteca.getContador()){
            Biblioteca.añadirLibro(libro);
            Biblioteca.setContador(Biblioteca.getContador()+1);
        }
    }

    public static void eliminarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un ISBN para buscar el libro");
        Integer isbn = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
            if (Biblioteca.getLista_libros().get(i).getISBN().equals(isbn)) {

            } else {

            }
        }

    }

    //Mètode verificat
    public static void buscarISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un ISBN para buscar el libro");
        Integer isbn = Integer.valueOf(scanner.nextLine());
        boolean verificat = false;
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
            if (Biblioteca.getLista_libros().get(i).getISBN().equals(isbn)) {
                System.out.println("El libro se llama: " + Biblioteca.getLista_libros().get(i).toString());
                verificat = true;
            }
        }
        if (verificat) {
            System.out.println("Busca satisfactoria");
        } else {
            System.out.println("No se encontró el libro");
        }

    }

    //Mètode verificat, pulir cerca.
    public static void buscarTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el título para buscar el libro");
        String titulo = scanner.nextLine();
        boolean verificat = false;
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
            if (Biblioteca.getLista_libros().get(i).getTitulo().equals(titulo)) {
                System.out.println("El libro se llama " + titulo);
                verificat = true;
            } else {
                System.out.println("");
            }
        }
        if (verificat) {
            System.out.println("Busca satisfactoria");
        } else {
            System.out.println("No se encontró el libro");
        }
    }

}

