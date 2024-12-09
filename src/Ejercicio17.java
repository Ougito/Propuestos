import java.util.Scanner;

public class Ejercicio17 {
    
    /*
    Realiza un programa que calcule el valor de elevar (sin utilizar el operador de potencia) un
    número real, a, a un número exponente entero, b
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int producto = 1; 
        System.out.print("Introduce la base: ");
        a = input.nextInt(); input.nextLine();
        System.out.print("Introduce el exponente: ");
        b = input.nextInt(); input.nextLine();
        for (int i = 1; i <= b; i++ ) {
            producto *= a;
        }
        System.out.println("producto = " + producto);
    }
    
    
}
