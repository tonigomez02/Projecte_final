import java.util.List;

public class Usuario extends Persona {
    private Integer telefono;
    private String dirección;
    private Integer codigo_postal;
    private String correo_electronico;
    private List<Reserva> lista_reservas;

    public Usuario(String nombre, String apellido1, String apeellido2, Integer edad) {
        super(nombre, apellido1, apeellido2, edad);
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

   /* public Usuario(String nombre, String apellido1, String apeellido2, Integer edad, Integer telefono, String dirección, String correo_electronico, Integer codigo_postal, List<Reserva> lista_reservas) {
        super(nombre, apellido1, apeellido2, edad);
        this.telefono=telefono;
        this.dirección=dirección;
        this.correo_electronico = correo_electronico;
        this.codigo_postal=codigo_postal;
        this.lista_reservas= lista_reservas;
    }
    public Usuario(){
        super();
    }*/
}
