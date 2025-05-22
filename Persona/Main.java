

public class Main {
    public static void main(String[] args) {
         Estudiantes estudiante = new Estudiantes("182649812946", "Juan", "PedroCepero", "juan@gmail.com", "128791729428",  "Software", "3er Semestre", 2005);
        estudiante.MostrarInfo();
        estudiante.calcularEdad();
        System.out.println("---------------------------------------");
        Docente docente = new Docente("124124212", "Yadira", "Toledo", "yadira@gmail.com", "1241242214","Tecnologos", 3);
        docente.MostrarInfo();
        System.out.println("---------------------------------------");

        System.out.println("Estudiante Virtual");
        EstudianteVirtual estudianteVirtual1 = new EstudianteVirtual("1241241412", "juan", "aqsfasfas", "JABFSKJAS", "1124241242", "sOFTWARE", "3ERO",2006,"ZOOM", "yADIRA");
        estudianteVirtual1.MostrarInfo();
        estudianteVirtual1.calcularEdad();

        System.out.println("---------------------------------------");
        System.out.println("Estudiante presencial");
        EstudiantePresencial estudiantePresencial1 = new EstudiantePresencial("124124","Juan", "PedroCepero", "juan@gmail.com", "1924701270", "Software", "3ero", 2004, 6, "7 a 10");
        estudiantePresencial1.MostrarInfo();
        estudiantePresencial1.calcularEdad();

    }
}
