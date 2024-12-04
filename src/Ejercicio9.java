import java.util.Scanner;

public class Ejercicio9 {

    // Realiza un programa para leer un número positivo N y que calcule y visualice su factorial N!

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int num = input.nextInt();
        int factorial = 1;
        if (num != 1 && num != 0) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.printf("El factorial del número %d es %d%n", num, factorial);
        }
        else
            System.out.printf("El factorial del número %d es 1%n", num);
    }
}
