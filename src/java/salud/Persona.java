package salud;
public class Persona {
    //Inicio herencia
    /**
     * @return the cedula
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the cedula to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //Fin herencia
    //Atributos de la clase
    private String codigo;
    private String nombre;
    private String apellido;
    private String sexo;
    // constructor
    public Persona() {
    }
// Constructor sobrecargado
    public Persona(String codigo, String nombre, String apellido, String sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }
}
