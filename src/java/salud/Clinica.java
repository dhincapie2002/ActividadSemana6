package salud;

public class Clinica implements Imprimir {

    ListaPaciente listaClin = new ListaPaciente();

    @Override
    public String impresion() {
        return listaClin.listaClinica();
    }

    public Clinica() {
    }
}
