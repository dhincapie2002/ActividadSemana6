package salud;

import java.util.ArrayList;

public class ListaPaciente {
// Creacion de Array para almacenar los datos
    ArrayList<String> direccion = new ArrayList<String>();
    ArrayList<String> lugarAtendido = new ArrayList<String>();
    ArrayList<String> motivoConsulta = new ArrayList<String>();
    ArrayList<String> medicoAtendio = new ArrayList<String>();
    ArrayList<String> fecha = new ArrayList<String>();
    ArrayList<String> codigo = new ArrayList<String>();
    ArrayList<String> nombre = new ArrayList<String>();
    ArrayList<String> apellido = new ArrayList<String>();
    ArrayList<String> sexo = new ArrayList<String>();
// Fin Creacion de Array para almacenar los datos
    //Datos para llenar la lista de Pacientes en las cLinica
    public String listaClinica() {

        Paciente pacienteClin1 = new Paciente("calle 1 8-12", "Clinica", "Dolor de cabaza", "Juan Felipe", "enero 12 del 2022", "12345", "Andres", "Rey", "Masculino");
        direccion.add(pacienteClin1.getDireccion());
        lugarAtendido.add(pacienteClin1.getLugarAtendido());
        motivoConsulta.add(pacienteClin1.getMotivoConsulta());
        medicoAtendio.add(pacienteClin1.getMedicoAtendio());
        fecha.add(pacienteClin1.getFecha());
        codigo.add(pacienteClin1.getCodigo());
        nombre.add(pacienteClin1.getNombre());
        apellido.add(pacienteClin1.getApellido());
        sexo.add(pacienteClin1.getSexo());

        Paciente pacienteClin2 = new Paciente("Kr 10 15", "Clinica", "Dolor de rodilla", "Dayan Alexander", "febrero 12 del 2022", "12346", "Adriana", "Sanches", "Femenino");
        direccion.add(pacienteClin2.getDireccion());
        lugarAtendido.add(pacienteClin2.getLugarAtendido());
        motivoConsulta.add(pacienteClin2.getMotivoConsulta());
        medicoAtendio.add(pacienteClin2.getMedicoAtendio());
        fecha.add(pacienteClin2.getFecha());
        codigo.add(pacienteClin2.getCodigo());
        nombre.add(pacienteClin2.getNombre());
        apellido.add(pacienteClin2.getApellido());
        sexo.add(pacienteClin2.getSexo());

        Paciente pacienteClin3 = new Paciente("calle 6 8-14", "Clinica", "Dolor de barriga", "Dayan Alexander", "marzo 1 del 2022", "12347", "Camilo", "Villa", "Masculino");
        direccion.add(pacienteClin3.getDireccion());
        lugarAtendido.add(pacienteClin3.getLugarAtendido());
        motivoConsulta.add(pacienteClin3.getMotivoConsulta());
        medicoAtendio.add(pacienteClin3.getMedicoAtendio());
        fecha.add(pacienteClin3.getFecha());
        codigo.add(pacienteClin3.getCodigo());
        nombre.add(pacienteClin3.getNombre());
        apellido.add(pacienteClin3.getApellido());
        sexo.add(pacienteClin3.getSexo());

        Paciente pacienteClin4 = new Paciente("calle 1 8-15", "Clinica", "Dolor de cabaza", "Juan Felipe", "Abril 2 del 2022", "12348", "Carolina", "Monrey", "Femenino");
        direccion.add(pacienteClin4.getDireccion());
        lugarAtendido.add(pacienteClin4.getLugarAtendido());
        motivoConsulta.add(pacienteClin4.getMotivoConsulta());
        medicoAtendio.add(pacienteClin4.getMedicoAtendio());
        fecha.add(pacienteClin4.getFecha());
        codigo.add(pacienteClin4.getCodigo());
        nombre.add(pacienteClin4.getNombre());
        apellido.add(pacienteClin4.getApellido());
        sexo.add(pacienteClin4.getSexo());

        Paciente pacienteClin5 = new Paciente("Kr 10 19", "Clinica", "Dolor de rodilla", "Juan Felipe", "Novienbre 20 del 2022", "12349", "Carol", "Garcia", "Femenino");
        direccion.add(pacienteClin5.getDireccion());
        lugarAtendido.add(pacienteClin5.getLugarAtendido());
        motivoConsulta.add(pacienteClin5.getMotivoConsulta());
        medicoAtendio.add(pacienteClin5.getMedicoAtendio());
        fecha.add(pacienteClin5.getFecha());
        codigo.add(pacienteClin5.getCodigo());
        nombre.add(pacienteClin5.getNombre());
        apellido.add(pacienteClin5.getApellido());
        sexo.add(pacienteClin5.getSexo());
// ciclo repetitivo para almacenar los datos de cada paciente en un string
        String lista = "";
        for (int i = 0; i < direccion.size(); i++) {
            lista = lista + ("------------------------------------------------------");
            lista = lista + "<br>" + "<br>";
            lista = lista + "    - Fecha: " + fecha.get(i) + "<br>" + "    - Codigo del Paciente: " + codigo.get(i) + "<br>" + "    - Nombre y Apellido del Paciente: " + nombre.get(i) + " " + apellido.get(i) + "<br>" + "    - Sexo: " + sexo.get(i) + "<br>" + "    - Dirección del Paciente: " + direccion.get(i) + "<br>" + "    - Lugar donde fue atendido: " + lugarAtendido.get(i) + "<br>" + "    - Motivo de la consulta: " + motivoConsulta.get(i) + "<br>" + "    - Medico Que Atendio: " + medicoAtendio.get(i);
            lista = lista + ("<br>" + "<br>");
        }
        return lista;
    }
//Fin Datos para llenar la lista de Pacientes en las cLinica
    //Datos para llenar la lista de Pacientes en los Hospitales
    public String listaHospital() {
        Paciente pacienteHos1 = new Paciente("calle 1 8-17","Hospital","Dolor de cabaza","Valentina Catañeda","enero 12 del 2022","12350","Claudia","Rofriguez","Femenino");
        direccion.add(pacienteHos1.getDireccion());
        lugarAtendido.add(pacienteHos1.getLugarAtendido());
        motivoConsulta.add(pacienteHos1.getMotivoConsulta());
        medicoAtendio.add(pacienteHos1.getMedicoAtendio());
        fecha.add(pacienteHos1.getFecha());
        codigo.add(pacienteHos1.getCodigo());
        nombre.add(pacienteHos1.getNombre());
        apellido.add(pacienteHos1.getApellido());
        sexo.add(pacienteHos1.getSexo());

        Paciente pacienteHos2 = new Paciente("calle 1 8-18","Hospital","Dolor de barriga","Juliana Reyes","febrero 12 del 2022","12351","Daniel","Polo","Masculino");
        direccion.add(pacienteHos2.getDireccion());
        lugarAtendido.add(pacienteHos2.getLugarAtendido());
        motivoConsulta.add(pacienteHos2.getMotivoConsulta());
        medicoAtendio.add(pacienteHos2.getMedicoAtendio());
        fecha.add(pacienteHos2.getFecha());
        codigo.add(pacienteHos2.getCodigo());
        nombre.add(pacienteHos2.getNombre());
        apellido.add(pacienteHos2.getApellido());
        sexo.add(pacienteHos2.getSexo());

        Paciente pacienteHos3 = new Paciente("calle 19 8-19","Hospital","Dolor de rodilla","Valentina Catañeda","marzo 1 del 2022","12352","Hugo","Gomez","Masculino");
        direccion.add(pacienteHos3.getDireccion());
        lugarAtendido.add(pacienteHos3.getLugarAtendido());
        motivoConsulta.add(pacienteHos3.getMotivoConsulta());
        medicoAtendio.add(pacienteHos3.getMedicoAtendio());
        fecha.add(pacienteHos3.getFecha());
        codigo.add(pacienteHos3.getCodigo());
        nombre.add(pacienteHos3.getNombre());
        apellido.add(pacienteHos3.getApellido());
        sexo.add(pacienteHos3.getSexo());

        Paciente pacienteHos4 = new Paciente("calle 9 10-20","Hospital","Dolor de cabaza","Juliana Reyes","Abril 2 del 2022","12353","Ingrid","Torres","Femenino");
        direccion.add(pacienteHos4.getDireccion());
        lugarAtendido.add(pacienteHos4.getLugarAtendido());
        motivoConsulta.add(pacienteHos4.getMotivoConsulta());
        medicoAtendio.add(pacienteHos4.getMedicoAtendio());
        fecha.add(pacienteHos4.getFecha());
        codigo.add(pacienteHos4.getCodigo());
        nombre.add(pacienteHos4.getNombre());
        apellido.add(pacienteHos4.getApellido());
        sexo.add(pacienteHos4.getSexo());

        Paciente pacienteHos5 = new Paciente("calle 1 8-21","Hospital","Dolor de cabaza","Valentina Catañeda","Novienbre 20 del 2022","12354","Jennyfer","Toro","Femenino");
        direccion.add(pacienteHos5.getDireccion());
        lugarAtendido.add(pacienteHos5.getLugarAtendido());
        motivoConsulta.add(pacienteHos5.getMotivoConsulta());
        medicoAtendio.add(pacienteHos5.getMedicoAtendio());
        fecha.add(pacienteHos5.getFecha());
        codigo.add(pacienteHos5.getCodigo());
        nombre.add(pacienteHos5.getNombre());
        apellido.add(pacienteHos5.getApellido());
        sexo.add(pacienteHos5.getSexo());
// ciclo repetitivo para almacenar los datos de cada paciente en un string
        String lista = "";
        for (int i = 0; i < direccion.size(); i++) {
            lista = lista + ("------------------------------------------------------");
            lista = lista + "<br>" + "<br>";
            lista = lista + "    - Fecha: " + fecha.get(i) + "<br>" + "    - Codigo del Paciente: " + codigo.get(i) + "<br>" + "    - Nombre y Apellido del Paciente: " + nombre.get(i) + " " + apellido.get(i) + "<br>" + "    - Sexo: " + sexo.get(i) + "<br>" + "    - Dirección del Paciente: " + direccion.get(i) + "<br>" + "    - Lugar donde fue atendido: " + lugarAtendido.get(i) + "<br>" + "    - Motivo de la consulta: " + motivoConsulta.get(i) + "<br>" + "    - Medico Que Atendio: " + medicoAtendio.get(i);
            lista = lista + ("<br>" + "<br>");
        }
        return lista;
    //Fin Datos para llenar la lista de Pacientes en las hospitales
//Datos para llenar la lista de Pacientes en los Centros medicos
    }
    public String listaCentro() {
        Paciente pacienteCen1 = new Paciente("Kr 12 17","Centro de Salud","Dolor de barriga","Julian Prieto","enero 12 del 2022","12355","Jorge","Nieto","Masculino");
        direccion.add(pacienteCen1.getDireccion());
        lugarAtendido.add(pacienteCen1.getLugarAtendido());
        motivoConsulta.add(pacienteCen1.getMotivoConsulta());
        medicoAtendio.add(pacienteCen1.getMedicoAtendio());
        fecha.add(pacienteCen1.getFecha());
        codigo.add(pacienteCen1.getCodigo());
        nombre.add(pacienteCen1.getNombre());
        apellido.add(pacienteCen1.getApellido());
        sexo.add(pacienteCen1.getSexo());

        Paciente pacienteCen2 = new Paciente("calle 1 8-23","Centro de Salud","Dolor de cabaza","Andrez Gonzales","febrero 12 del 2022","12356","Juan","Mendeoza","Masculino");
        direccion.add(pacienteCen2.getDireccion());
        lugarAtendido.add(pacienteCen2.getLugarAtendido());
        motivoConsulta.add(pacienteCen2.getMotivoConsulta());
        medicoAtendio.add(pacienteCen2.getMedicoAtendio());
        fecha.add(pacienteCen2.getFecha());
        codigo.add(pacienteCen2.getCodigo());
        nombre.add(pacienteCen2.getNombre());
        apellido.add(pacienteCen2.getApellido());
        sexo.add(pacienteCen2.getSexo());

        Paciente pacienteCen3 = new Paciente("calle 48 8-24","Centro de Salud","Dolor de rodilla","Julian Prieto","marzo 1 del 2022","12357","Laura","Mendez","Femenino");
        direccion.add(pacienteCen3.getDireccion());
        lugarAtendido.add(pacienteCen3.getLugarAtendido());
        motivoConsulta.add(pacienteCen3.getMotivoConsulta());
        medicoAtendio.add(pacienteCen3.getMedicoAtendio());
        fecha.add(pacienteCen3.getFecha());
        codigo.add(pacienteCen3.getCodigo());
        nombre.add(pacienteCen3.getNombre());
        apellido.add(pacienteCen3.getApellido());
        sexo.add(pacienteCen3.getSexo());

        Paciente pacienteCen4 = new Paciente("calle 80 8-25","Centro de Salud","Dolor de barriga","Julian Prieto","Abril 2 del 2022","12358","Maria","Camargo","Femenino");
        direccion.add(pacienteCen4.getDireccion());
        lugarAtendido.add(pacienteCen4.getLugarAtendido());
        motivoConsulta.add(pacienteCen4.getMotivoConsulta());
        medicoAtendio.add(pacienteCen4.getMedicoAtendio());
        fecha.add(pacienteCen4.getFecha());
        codigo.add(pacienteCen4.getCodigo());
        nombre.add(pacienteCen4.getNombre());
        apellido.add(pacienteCen4.getApellido());
        sexo.add(pacienteCen4.getSexo());

        Paciente pacienteCen5 = new Paciente("calle 1 8-26","Centro de Salud","Dolor de rodilla","Andrez Gonzales","Novienbre 20 del 2022","12359","Jose","Romero","Masculino");
        direccion.add(pacienteCen5.getDireccion());
        lugarAtendido.add(pacienteCen5.getLugarAtendido());
        motivoConsulta.add(pacienteCen5.getMotivoConsulta());
        medicoAtendio.add(pacienteCen5.getMedicoAtendio());
        fecha.add(pacienteCen5.getFecha());
        codigo.add(pacienteCen5.getCodigo());
        nombre.add(pacienteCen5.getNombre());
        apellido.add(pacienteCen5.getApellido());
        sexo.add(pacienteCen5.getSexo());
// ciclo repetitivo para almacenar los datos de cada paciente en un string
        String lista = "";
        for (int i = 0; i < direccion.size(); i++) {
            lista = lista + ("------------------------------------------------------");
            lista = lista + "<br>" + "<br>";
            lista = lista + "    - Fecha: " + fecha.get(i) + "<br>" + "    - Codigo del Paciente: " + codigo.get(i) + "<br>" + "    - Nombre y Apellido del Paciente: " + nombre.get(i) + " " + apellido.get(i) + "<br>" + "    - Sexo: " + sexo.get(i) + "<br>" + "    - Dirección del Paciente: " + direccion.get(i) + "<br>" + "    - Lugar donde fue atendido: " + lugarAtendido.get(i) +"<br>" +  "    - Motivo de la consulta: " + motivoConsulta.get(i) + "<br>" + "    - Medico Que Atendio: " + medicoAtendio.get(i);
            lista = lista + ("<br>" + "<br>");
        }
        return lista;
    }
    //Fin Datos para llenar la lista de Pacientes en las Centro de Salud
}
