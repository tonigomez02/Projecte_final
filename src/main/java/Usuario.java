import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario extends Persona {

    private Integer telefono;
    private String dirección;
    private Integer codigo_postal;
    private String correo_electronico;
    private List<Reserva> lista_reservas = new ArrayList<>();

    @Override
    public String toString() {
        if (Biblioteca.getLista_usuarios().isEmpty()) {
            return "\n" + "No hay usuarios registrados." + "\n";
        } else {
            return "\n" +
                    "Nombre: " + getNombre() + "\n" +
                    "Primer apellido: " + getApellido1() + "\n" +
                    "Segundo apellido: " + getApeellido2() + "\n" +
                    "Edad: " + getEdad() + "\n" +
                    "Telefono: " + telefono + "\n" +
                    "Dirección: " + dirección + "\n" +
                    "Codigo postal: " + codigo_postal + "\n" +
                    "Lista de reservas: " + lista_reservas + "\n";
        }
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public Integer getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(Integer codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public List<Reserva> getLista_reservas() {
        return lista_reservas;
    }

    public void setLista_reservas(List<Reserva> lista_reservas) {
        this.lista_reservas = lista_reservas;
    }


    public Usuario(String nombre, String apellido1, String apeellido2, Integer edad, Integer telefono, String dirección, String correo_electronico, Integer codigo_postal) {
        super(nombre, apellido1, apeellido2, edad);
        this.telefono = telefono;
        this.dirección = dirección;
        this.correo_electronico = correo_electronico;
        this.codigo_postal = codigo_postal;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apeellido2, Integer edad) {
        super(nombre, apellido1, apeellido2, edad);
    }


    public static void mostrarUsuarios() {
        if (Biblioteca.getLista_usuarios().isEmpty()) {
            System.out.println("No hay usuarios registrados en la biblioteca");
        } else {
            for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
                System.out.println(Biblioteca.getLista_usuarios().get(i).toString());
            }
        }

    }


}
