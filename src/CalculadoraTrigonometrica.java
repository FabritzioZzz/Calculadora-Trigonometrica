import java.util.Scanner;

public class CalculadoraTrigonometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora Trigonométrica ===");
        System.out.println("1. Seno (sin)");
        System.out.println("2. Coseno (cos)");
        System.out.println("3. Tangente (tan)");
        System.out.println("4. Arcoseno (arcsin)");
        System.out.println("5. Arcocoseno (arccos)");
        System.out.println("6. Arcotangente (arctan)");
        System.out.println("7. Seno hiperbólico (sinh)");
        System.out.println("8. Coseno hiperbólico (cosh)");
        System.out.println("9. Tangente hiperbólica (tanh)");
        System.out.println("10. Salir");
        System.out.print("Seleccione una opción (1-10): ");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el valor α (en radianes): ");
        double alpha = scanner.nextDouble();
        scanner.close();
    }
}
