
public class DocenteLinea extends Docente {
    public String tipoContrato;

    public DocenteLinea(String cedula, String nombre, String direccion, String correo, String FacultadPertenece, int HorasAsignadas, String tipoContrato) {
        super(cedula, nombre, direccion, correo, FacultadPertenece, HorasAsignadas);
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Tipo de contrato: " + tipoContrato);
    }
}
