import java.util.Scanner;

public class Ejercicio15 {

    /*
    Realiza un programa para leer una secuencia de notas (con valores que van de 0 a 10) que acaba
    con el valor -1 y nos dice si hay o no alguna nota de valor 10
    */

    public static void main(String[] args) {
        byte notas;
        short contador10 = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Introduce notas (finaliza con -1): ");
            notas = input.nextByte();
            if (notas == 10) contador10++;
        } while (notas != -1);

        System.out.println("El número de veces que se ha introducir un 10 es: " + contador10);
    }
}
