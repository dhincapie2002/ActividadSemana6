package salud;

public class Hospital implements Imprimir {

    ListaPaciente listaHos = new ListaPaciente();

    @Override

    public String impresion() {
        return listaHos.listaHospital();
    }

    public Hospital() {
    }

}
