package salud;
public class Paciente extends Persona{
    //Inicio herencia
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the lugarAtendido
     */
    public String getLugarAtendido() {
        return lugarAtendido;
    }

    /**
     * @param lugarAtendido the lugarAtendido to set
     */
    public void setLugarAtendido(String lugarAtendido) {
        this.lugarAtendido = lugarAtendido;
    }

    /**
     * @return the motivoConsulta
     */
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * @param motivoConsulta the motivoConsulta to set
     */
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    /**
     * @return the medicoAtendio
     */
    public String getMedicoAtendio() {
        return medicoAtendio;
    }

    /**
     * @param medicoAtendio the medicoAtendio to set
     */
    public void setMedicoAtendio(String medicoAtendio) {
        this.medicoAtendio = medicoAtendio;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    //Fin herencia
    //Atributos de la subclase
    private String direccion;
    private String lugarAtendido;
    private String motivoConsulta;
    private String medicoAtendio;
    private String fecha;
// constructor de la clase
    public Paciente() {
    }
// cosntructor de la subclase
    public Paciente(String direccion, String lugarAtendido, String motivoConsulta, String medicoAtendio, String fecha, String codigo, String nombre, String apellido, String sexo) {
        //Usamos el operador super para establecer el constructor de la superclase
        super(codigo, nombre, apellido, sexo);
        //Definimos los atributos propios de este objeto que hereda
        this.direccion = direccion;
        this.lugarAtendido = lugarAtendido;
        this.motivoConsulta = motivoConsulta;
        this.medicoAtendio = medicoAtendio;
        this.fecha = fecha;
    }
}
