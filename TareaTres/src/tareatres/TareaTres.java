package tareatres;

import java.util.Scanner;

public class TareaTres {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
         // Una condición para pedir al usuario cuantos nombres quiere ingresar
        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        }
       
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);

        System.out.println("Llegue");

        System.out.println("Sueldos mensuales o semanales  1 o 2");
        int numero_sueldo = scanner.nextInt();
         // una condicion para pedir que ingrese el sueldo mensual o semanal.
        if (numero_sueldo == 1) {
            System.out.println("Ingrese el sueldo del trabajador");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        } else {
            // se creo un arreglo para guardos los sueldos semanales.
            double[] sueldos_semanales = new double[4];
            System.out.println("Ingrese el sueldo uno");
            double s1 = scanner.nextDouble();
            System.out.println("Ingrese el sueldo dos");
            double s2 = scanner.nextDouble();
            System.out.println("Ingrese el sueldo tres");
            double s3 = scanner.nextDouble();
            System.out.println("Ingrese el sueldo cuatro");
            double s4 = scanner.nextDouble();
            sueldos_semanales[0] = s1;
            sueldos_semanales[1] = s2;
            sueldos_semanales[2] = s3;
            sueldos_semanales[3] = s4;
            t.agregar_sueldo(sueldos_semanales);
        }

        System.out.printf("Los datos del trabajador son: %s\n", t);
    }

}
