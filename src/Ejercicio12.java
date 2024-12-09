public class Ejercicio12 {

    // Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números naturales

    public static void main(String[] args) {
        double cuadrados = 0;
        for (int i = 1; i<=5; i++) cuadrados += Math.pow(i, 2);
        System.out.printf("La suma de los cuadrados de los 5 primeros números naturales es: %1.0f", cuadrados);
    }
}