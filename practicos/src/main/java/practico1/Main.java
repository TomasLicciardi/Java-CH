package practico1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero flotante: ");
        float flotante = scanner.nextFloat();
        int entero = (int) flotante;
        System.out.println("Parte entera: " + entero);
        System.out.println("Parte decimal: " + (flotante - entero));
    }
}
