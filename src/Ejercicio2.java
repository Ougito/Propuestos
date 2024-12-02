import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduce el primer número: ");
        num1 = input.nextInt();input.nextLine();
        System.out.print("Introduce el segundo número: ");
        num2 = input.nextInt();input.nextLine();

        if (num1 == num2) {
            System.out.printf("El número %d y el número %d son iguales.", num1, num2);
        } else {
            System.out.printf("El número %d y el número %d son diferentes.", num1, num2);
        }
    }
}
