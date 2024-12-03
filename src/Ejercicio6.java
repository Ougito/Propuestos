public class Ejercicio6 {

    // Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200, sumando de 2 en 2

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i == 50 || i == 100 || i == 150)
                    System.out.println(",");
                else if (i < 200)
                    System.out.print(", ");
                else
                    System.out.println(".");
            }
        }
    }
}
