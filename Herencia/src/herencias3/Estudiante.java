
package herencias3;


public class Estudiante extends Persona {

    private double matricula;

    public Estudiante(String n, String a, int e, double mat) {
        super(n, a, e);
        setMatricula(mat);
    }
    // metodos de la clase
    @Override
    public void setNombre(String n) {
        nombre = n.toUpperCase();
    }

    @Override
    public void setApellido(String n) {
        apellido = n.toUpperCase();
    }

    public void setMatricula(double mat) {
        matricula = mat;
    }

    public double getMatricula() {
        return matricula;
    }
    // sobre escribiendo metodo toString.
    @Override
    public String toString() {
        return String.format("%s - Matricula: %.2f", super.toString(), getMatricula());
    }
}
