package tareatres;

/**
 *
 * @author USUARIO
 */
public class Trabajador {
  //Atributos nombre, sueldo_mensual, apellidos.
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    
   // Metodos
    public void agregar_nombres(String n) {
        nombres = n;
    }

    public void agregar_nombres(String n1, String n2) {
        nombres = String.format("%s-%s", n1, n2);
    }

    public void agregar_sueldo(double s) {
        sueldo_mensual = s;
    }

    public void agregar_sueldo(double s1, double s2, double s3, double s4) {
        sueldo_mensual = s1 + s2 + s3 + s4;
    }

    public void agregar_sueldo(double[] a) {
        double aux = 0;
        for (int i = 0; i < a.length; i++) {
            aux = aux + a[i];

        }
        sueldo_mensual = aux;
    }

    public void agregar_apellidos(String n) {
        apellidos = n;
    }

    public String obtener_nombres() {
        return nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public double obtener_sueldo_mensual() {
        return sueldo_mensual;
    }

    @Override
    // sobreescribir el toString
    public String toString() {
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }

}
