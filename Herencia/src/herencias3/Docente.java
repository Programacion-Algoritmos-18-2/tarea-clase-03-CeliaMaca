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
public class Docente extends Persona {
    // atributos globales

    private double sueldo;

    // constructor de clase 
    public Docente(String n, String a, int e, double sueld) {
        super(n, a, e);
        setSueldo(sueld);

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

    public void setSueldo(double sueld) {
        sueldo = sueld;
    }

    public double getSueldo() {
        return sueldo;
    }

    // sobre escribiendo metodo toString.
    @Override
    public String toString() {

        return String.format("%s - Sueldo: %.2f", super.toString(), getSueldo());
    }

}
