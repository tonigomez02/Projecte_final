public class Bibliotecario extends Persona{
    private String NIF;
    private String contraseña;
    private String puesto_de_trabajo;

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPuesto_de_trabajo() {
        return puesto_de_trabajo;
    }

    public void setPuesto_de_trabajo(String puesto_de_trabajo) {
        this.puesto_de_trabajo = puesto_de_trabajo;
    }

    public Bibliotecario(String nombre, String apellido1, String apeellido2, Integer edad,String NIF, String contraseña, String puesto_de_trabajo) {
        super(nombre, apellido1, apeellido2,edad);
        this.NIF=NIF;
        this.contraseña=contraseña;
        this.puesto_de_trabajo=puesto_de_trabajo;
    }
}
