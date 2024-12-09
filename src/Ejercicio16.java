public class Ejercicio16 {

    /*
    Realiza un programa que sume independendientemente los números pares y los impares com-
    prendidos entre 100 y 200
    */

    public static void main(String[] args) {
        var sumaPares = 0;
        var sumaImpares = 0;
        for (int i=100; i<= 200; i++) {
            if (i % 2 == 0) sumaPares+=i;
            else sumaImpares+=i;
        }
        System.out.println("sumaPares = " + sumaPares);
        System.out.println("sumaImpares = " + sumaImpares);
    }
}
