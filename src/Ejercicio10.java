import java.util.Scanner;

public class Ejercicio10 {

    // Realiza un programa para leer 10 números no nulos y que visualice un mensaje de si ha leído
    // algún número negativo o no. (comprobación para un número menor)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int negativos = 0;
        for (int i = 1; i<=10; i++) {
            System.out.print("Introduce un número entero: ");
            num = input.nextInt();
            if (num < 0) negativos++;
        }
        if (negativos > 0) System.out.printf("Se han introducido %d números negativos.", negativos);
        else System.out.println("No se ha introducido ningún número negativo");
    }

}