public class EstudiantePresencial extends Estudiantes{
    public int horasPresencial;
    public String horario;

    public EstudiantePresencial(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int anionacimiento, int horasPresencial, String horario) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel, anionacimiento);
        this.horasPresencial = horasPresencial;
        this.horario = horario;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Horas presencial: " + horasPresencial);
        System.out.println("Horario: " + horario);
    }
}
