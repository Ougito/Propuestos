import java.util.Scanner;

public class Ejercicio3 {

    /*
    Realiza un programa que dado el precio de un artículo y el IVA a aplicar mostrará como resultado el precio con el
    iva aplicado. Siendo los IVAS posibles: 4 %, 10 % y 21 %
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double precio;
        int iva;
        char continuar = 's';

        do {
            System.out.print("Introduce el precio del producto: ");
            precio = input.nextDouble();input.nextLine();
            System.out.print("Introduce el tipo de IVA: ");
            iva = input.nextInt();input.nextLine();

            switch (iva) {
                case 4:
                    System.out.printf("El precio neto es: %.2f\n", precio*1.04);
                    System.out.print("¿Quieres continuar? (s/n): ");
                    continuar = input.next().charAt(0);input.nextLine();
                    break;
                case 10:
                    System.out.printf("El precio neto es: %.2f\n", precio*1.10);
                    System.out.print("¿Quieres continuar? (s/n): ");
                    continuar = input.next().charAt(0);input.nextLine();
                    break;
                case 21:
                    System.out.printf("El precio neto es: %.2f\n", precio*1.21);
                    System.out.print("¿Quieres continuar? (s/n): ");
                    continuar = input.next().charAt(0);input.nextLine();
                    break;
                default:
                    System.out.println("El tipo de IVA introducido no es válido.");
            }
        } while (continuar == 's');

        System.out.println("Saliendo...");
    }
}