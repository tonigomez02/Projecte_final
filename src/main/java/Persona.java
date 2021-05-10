

public abstract class  Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;

    public Persona(String nombre, String apellido1, String apeellido2, Integer edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apeellido2;
        this.edad = edad;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApeellido2() {
        return apellido2;
    }

    public void setApeellido2(String apeellido2) {
        this.apellido2 = apeellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}

