import java.util.Scanner;

public class Ejercicio8 {

    // Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
    // por teclado. Así como el sumatorio y producto de todos ellos.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número N (máx. 100): ");
        long num = input.nextInt();
        while (num > 100) {
            System.out.println("El valor máximo soportado es 100.");
            System.out.print("Introduce un número N (máx. 100): ");
            num = input.nextInt();
        }
        int sumatorio = 0;
        double producto = 1;
        for (int i = 1; i <= num; i++) {
            if (i<num) System.out.print(i+", ");
            else System.out.println(i+".");
            sumatorio += i;
            producto *= i;
        }
        System.out.println(sumatorio);
        System.out.println(producto);
    }

}
