import java.util.Scanner;

    /*
    Realiza un programa que lea 2 números y muestre el mensaje “Son iguales” o que muestre el
    número más grande.
    */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduce el primer número: ");
        num1 = input.nextInt();input.nextLine();
        System.out.print("Introduce el segundo número: ");
        num2 = input.nextInt();input.nextLine();

        if (num1 == num2)
            System.out.println("Los números son iguales.");
        else {
            if (num1>num2)
                System.out.printf("El número %d es mayor que el número %d.", num1, num2);
            else
                System.out.printf("El número %d es mayor que el número %d.", num2, num1);
        }
    }
}