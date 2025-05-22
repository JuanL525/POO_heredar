public class EstudianteVirtual extends Estudiantes {
    public String plataforma;
    public String tutor;

    public EstudianteVirtual(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int anionacimiento, String plataforma, String tutor) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel, anionacimiento);
        this.plataforma = plataforma;
        this.tutor = tutor;
    }
    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Tutor: " + tutor);
    }
}
