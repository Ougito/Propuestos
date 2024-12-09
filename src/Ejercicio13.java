import java.util.Scanner;

public class Ejercicio13 {

    /* Realiza un programa para leer una secuencia de números no nulos que finalice con la introducción
       de un 0, y que obtenga e imprima si ha leído algún número negativo, cuantos positivos y cuantos
       negativos
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;
        do {
            System.out.print("Introduce números no nulos (finaliza con un 0): ");
            num = input.nextInt();
            if (num > 0) positivos++;
            else if (num < 0) negativos++;

        } while (num != 0);

        System.out.printf("%n%d son positivos%n%d son negativos", positivos, negativos);
    }
}