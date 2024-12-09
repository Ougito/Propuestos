import java.util.Scanner;

public class Ejercicio18 {

    /*
    Realiza una versión diferente del programa 1. En este programa se mostrarán las diferentes ope-
    raciones en un menú (donde se incluya la opción de Salir) para que el usuario elija la operación
    que quiere realizar. El usuario seleccionará la opción Salir para finalizar
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        byte opcion;

        // Introducción de datos

        System.out.println("*** BIENVENIDO A OPERARCIONES ***");
        do {
            System.out.println("\n1. Introducir operandos");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Potencia");
            System.out.println("7. Salir\n");

            System.out.print("Introduce la opción que desees (1-7): ");
            opcion = input.nextByte();input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el primer número: ");
                    num1 = input.nextInt(); input.nextLine();

                    System.out.print("Introduzca el segundo número: ");
                    num2 = input.nextInt(); input.nextLine();
                    break;

                case 2:
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
                    break;

                case 3:
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;

                case 4:
                    int producto = num1 * num2;
                    System.out.println("El resultado del producto es: " + producto);
                    break;

                case 5:
                    int division;
                    if (num2 == 0) {
                        System.out.println("La división por cero no se puede realizar.");
                    } else {
                        division = num1 / num2;
                        System.out.println("El resultado de la division es: " + division);
                    }
                    break;

                case 6:
                    double potencia = Math.pow(num1, num2);
                    System.out.println("El resultado de la potencia es: " + potencia);
                    break;
            }
        } while(opcion != 7);
    }
}