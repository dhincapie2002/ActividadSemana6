package salud;

public class Centro implements Imprimir {

    ListaPaciente listaCen = new ListaPaciente();

    @Override

    public String impresion() {
        return listaCen.listaCentro();
    }

    public Centro() {
    }

}
