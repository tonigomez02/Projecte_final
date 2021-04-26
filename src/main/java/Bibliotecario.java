import java.util.Scanner;

public class Bibliotecario extends Persona{
    private String NIF;
    private String contraseña;
    private String puesto_de_trabajo;

    public Bibliotecario() {
    }

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

    public static void añadirUsuario(){
        Scanner recogidaDatos = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Crear nuevos usuarios");
        System.out.println("Nombre del usuario:");
        String nombre = recogidaDatos.nextLine();
        usuario.setNombre(nombre);
        System.out.println("Primer apellido del usuario:");
        String apellido1 = recogidaDatos.nextLine();
        usuario.setApellido1(apellido1);
        System.out.println("Segundo apellido del usuario:");
        String apellido2 = recogidaDatos.nextLine();
        usuario.setApeellido2(apellido2);
        System.out.println("Edad del usuario:");
        Integer edad = Integer.valueOf(recogidaDatos.nextLine());
        usuario.setEdad(edad);
        System.out.println("Telefono del usuario:");
        Integer telefono = Integer.valueOf(recogidaDatos.nextLine());
        usuario.setTelefono(telefono);
        System.out.println("Dirección del usuario:");
        String direccion = recogidaDatos.nextLine();
        usuario.setDirección(direccion);
        System.out.println("Codigo postal del usuario:");
        Integer codiPostal = Integer.valueOf(recogidaDatos.nextLine());
        usuario.setCodigo_postal(telefono);
        System.out.println("Correo electronico postal del usuario:");
        String codiElec = recogidaDatos.nextLine();
        usuario.setCorreo_electronico(codiElec);
        Biblioteca.añadirUsuario(usuario);


    }
}
