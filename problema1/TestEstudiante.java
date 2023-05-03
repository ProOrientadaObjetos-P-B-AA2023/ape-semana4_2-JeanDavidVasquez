
class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;

    public Estudiante() {
    }
    public Estudiante(String nombre, double nota1, double nota2, double nota3,  Universidad universidad) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        this.promedio = (getNota1() + getNota2() + getNota3() / 3);
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", promedio=" + promedio +
                ", universidad=" + universidad +
                '}';
    }
}


class Universidad {
    public Universidad(String nombre, String direcccion) {
        this.nombre = nombre;
        this.direcccion = direcccion;
    }

    private String nombre;
    private String direcccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", direcccion='" + direcccion + '\'' +
                '}';
    }
}
public class TestEstudiante {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTPL","CLODOVEO");
        Estudiante estudiante1 = new Estudiante("Jean",6,10,10, universidad1);
        estudiante1.calcularPromedio();
        System.out.printf(String.valueOf(estudiante1));
    }
}
