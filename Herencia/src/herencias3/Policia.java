/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author USUARIO
 */
// clase policia
public class Policia extends Persona {

    private String puesto;
    // constructor de clase
    public Policia(String n, String a, int e, String puesto) {
        super(n, a, e);
        setPuesto(puesto);
    }

    @Override
    // metodos de la clase
    public void setNombre(String n) {
        nombre = n.toUpperCase();
    }

    @Override
    public void setApellido(String n) {
        apellido = n.toUpperCase();
    }

    public void setPuesto(String codigo) {
        puesto = codigo;
    }

    public String getPuesto() {
        return puesto;
    }
    // sobre escribiendo metodo toString.
    @Override
    public String toString() {

        return String.format("%s - Puesto: %s", super.toString(), getPuesto());
    }
}
