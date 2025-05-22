public class Docente extends Persona {
    public String FacultadPertenece;
    public int HorasAsignadas;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String FacultadPertenece, int HorasAsignadas) {
        super(cedula, nombre, direccion, correo, telefono);
        this.FacultadPertenece = FacultadPertenece;
        this.HorasAsignadas = HorasAsignadas;
    }

    public Docente(String cedula, String nombre, String direccion, String correo, String FacultadPertenece, int HorasAsignadas) {
        super(cedula, nombre, direccion, correo);
        this.FacultadPertenece = FacultadPertenece;
        this.HorasAsignadas = HorasAsignadas;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Facultad: " + FacultadPertenece);
        System.out.println("Horas asignadas: " + HorasAsignadas);
    }
}
