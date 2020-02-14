package practicelab4;

import java.util.Scanner;

public class Practicelab4 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.print(" Ingrese nombre del equipo: ");
            String nameTeam = leer.next();
            System.out.print(" Ingrese nombre del estadio: ");
            String nameStadium = leer.next();
            System.out.print(" Ingrese nombre del pais: ");
            String pais = leer.next();
            System.out.print(" Ingrese nombre del entrenador: ");
            String entrenador = leer.next();
            System.out.print(" Ingrese nombre del duenio: ");
            String duenio = leer.next();
            System.out.print(" Ingrese nombre de la mascota: ");
            String mascota = leer.next();

        }

    }

}
