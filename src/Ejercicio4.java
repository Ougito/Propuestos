import java.util.Scanner;

public class Ejercicio4 {

    /*
    Escribe un programa que lea una nota numérica entre 0 y 10 y muestre si el resultado es: insufi-
    ciente (menos de 5), suficiente (entre 5 y 6), bien (entre 6 y 7), notable (entre 7 y 9), excelente
    (entre 9 y 10) o matrícula de honor (10).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una nota para obtener su significado correspondiente: ");
        double nota = input.nextDouble();input.nextLine();

        if (nota < 5)
            System.out.println("Insuficiente.");
        else if (nota < 6)
            System.out.println("Suficiente.");
        else if (nota < 7)
            System.out.println("Bien.");
        else if (nota < 9)
            System.out.println("Notable.");
        else if (nota < 10)
            System.out.println("Excelente.");
        else if (nota == 10)
            System.out.println("Matrícula de honor.");
    }
}
