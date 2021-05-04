import java.util.Scanner;

public class Utils {

    private static boolean salida = true;
    private static Integer opcionMenu = 0;
    private static Biblioteca biblioteca = new Biblioteca();

    public static Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public static void setBiblioteca(Biblioteca biblioteca) {
        Utils.biblioteca = biblioteca;
    }

    public static boolean getSalida() {
        return salida;
    }

    public static void setSalida(boolean salida) {
        Utils.salida = salida;
    }

    public static boolean isSalida() {
        return salida;
    }

    public static Integer getOpcionMenu() {
        return opcionMenu;
    }

    public static void setOpcionMenu(Integer opcionMenu) {
        Utils.opcionMenu = opcionMenu;
    }

    public static void inicializar() {
        Bibliotecario bibliotecario = new Bibliotecario("Admin", "AdminApellido1", "AdminApellido2", 45, "12345678A", "biblioteca", "Jefazo");
        Usuario primerUsuario = new Usuario("Pepe", "Martínez", "Eastwood", 77, 971674856, "Carrer de la vida", "pepemartinez@gmail.com", 07567);
        Biblioteca.añadirUsuarioUnico(primerUsuario);
        Libro libro = new Libro(2323, "Padrino", "Mario Puzzo", "Los mejores libros", false);
        Biblioteca.añadirLibroUnico(libro);
        Scanner pedir_datos = new Scanner(System.in);

        System.out.println("Bienvenido a la biblioteca");
        while (Utils.getSalida()) {
            System.out.println("Escriba el nombre de la biblioteca");
            String nombre = pedir_datos.nextLine();
            biblioteca.setNombre(nombre);

        }

    }
}
