import java.util.Scanner;

    /*
    Realiza un programa que lea dos números, calcule y muestre el valor de su suma, resta, producto,
    potencia y división. (Ten en cuenta que no se puede dividir por cero).
     */

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2;

        // Introducción de datos

        System.out.print("Introduzca el primer número: ");
        num1 = input.nextInt(); input.nextLine();
        System.out.print("Introduzca el segundo número: ");
        num2 = input.nextInt(); input.nextLine();

        // Cálculo de la suma y la resta

        int suma = num1 + num2;
        int resta = num1 - num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);

        // Cálculo del producto, la potencia y la división

        int producto = num1 * num2;
        double potencia =  Math.pow(num1, num2);
        System.out.println("El resultado del producto es: " + producto);
        System.out.println("El resultado de la potencia es: " + potencia);
        int division;
        if (num2 == 0) {
            System.out.println("La división por cero no se puede realizar.");
        } else {
            division = num1/num2;
            System.out.println("El resultado de la division es: " + division);
        }
    }
}