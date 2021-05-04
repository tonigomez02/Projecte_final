import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Reserva {

    private Libro libro;
    private LocalDateTime fecha;

    public Reserva(Libro libro, LocalDateTime fecha) {
        this.libro = libro;
        this.fecha = fecha;
    }

    public Reserva() {
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public static void reservarLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la reserva de libros");
        System.out.println("Solicitar telefono del usuario");
        Integer telefono = scanner.nextInt();
        System.out.println("Solicitar correo electronico");
        String correoElec = scanner.next();
        System.out.println("Datos recogidos");

        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
            if (Biblioteca.getLista_usuarios().get(i).getTelefono().equals(telefono) && Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(correoElec)){
                System.out.println("ISBN del libro");
                Integer isbn = scanner.nextInt();
                for (int j = 0; j < Biblioteca.getLista_libros().size(); j++) {
                    if (Biblioteca.getLista_libros().get(i).getISBN().equals(isbn) && !Biblioteca.getLista_libros().get(i).getNº_copias_disponibles().equals(0)){
                        System.out.println(Biblioteca.getLista_libros().get(i).toString());
                        Reserva reserva = new Reserva();
                        reserva.setLibro(Biblioteca.getLista_libros().get(i));
                        reserva.setFecha(LocalDateTime.now());
                        Biblioteca.getLista_libros().get(i).setNº_copias_disponibles(Biblioteca.getLista_libros().get(i).getNº_copias_disponibles()-1);
                        Biblioteca.getLista_usuarios().get(i).añadirReserva(reserva);
                        System.out.println("Reserva realizada");
                    }
                }
            }
        }

    }

    public static void devolverLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la devolución de libros");
        System.out.println("Solicitar teléfono de usuario");
        Integer telefono = scanner.nextInt();
        System.out.println("Solicitar correo electrónico");
        String coreo_electronico = scanner.nextLine();
        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
            if (Biblioteca.getLista_usuarios().get(i).getTelefono().equals(telefono) && Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(coreo_electronico)) {
                System.out.println("Deme su ISBN");
                Integer isbn= scanner.nextInt();



            }
        }
    }
    }



