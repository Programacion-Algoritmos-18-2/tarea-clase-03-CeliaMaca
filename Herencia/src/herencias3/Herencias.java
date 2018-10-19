
package herencias3;

public class Herencias {

    public static void main(String[] args) {
        // Instanciacion de las clases Estudiante, Docente, Policia.
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);

        Docente d = new Docente("Luis", "Alvarez", 33, 1000);
        System.out.println(d);

        Policia p = new Policia("ALEX", "MENDOZA", 33, "Cabo");
        System.out.println(p);

    }

}
