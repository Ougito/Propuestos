import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduzca el primer número: ");
        num1 = input.nextInt(); input.nextLine();
        System.out.print("Introduzca el segundo número: ");
        num2 = input.nextInt(); input.nextLine();

        // suma y resta

        int suma = num1 + num2;
        int resta = num1 - num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);

        // producto, potencia y división

        int producto = num1 * num2;
        double potencia =  Math.pow(num1, num2);
        int division = num1/num2;
        System.out.println("El resultado del producto es: " + producto);
        System.out.println("El resultado de la potencia es: " + potencia);
        System.out.println("El resultado de la division es: " + division);
    }

}
