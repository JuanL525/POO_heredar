public class Estudiantes extends Persona {
    public String carrera;
    public String nivel;
    public int anionacimiento;
    public int anioactual = 2025;

    public Estudiantes(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int anionacimiento) {

        super(cedula, nombre, direccion, correo, telefono);
        this.carrera = carrera;
        this.nivel = nivel;
        this.anionacimiento = anionacimiento;
    }

    public void calcularEdad(){
        System.out.println("La edad es: " + (anioactual - anionacimiento) + " años");
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
    }
}
