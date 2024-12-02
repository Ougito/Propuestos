import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduzca el primer número: ");
        num1 = input.nextInt(); input.nextLine();
        System.out.print("Introduzca el segundo número: ");
        num2 = input.nextInt(); input.nextLine();
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);

        // suma resta producto y potencia y division

    }
}
