import java.util.Scanner;

public class Ejercicio11 {

    // Realiza un programa para leer 20 números no nulos y que visualice un mensaje indicando cuantos
    // son positivos y cuantos negativos. (comprobación para un número menor)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int negativos = 0;
        int positivos = 0;
        for (int i = 1; i<=20; i++) {
            System.out.print("Introduce un número entero: ");
            num = input.nextInt();
            if (num < 0) negativos++;
            else positivos++;
        }
        if (negativos > 0) System.out.printf("Se han introducido %d números negativos.", negativos);
        else System.out.println("No se ha introducido ningún número negativo");
        if (positivos > 0) System.out.printf("Se han introducido %d números positivos", positivos);
        else System.out.println("No se han introducido números positivos.");
    }
}