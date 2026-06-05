import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Producto " + i + ": ");
            String producto = sc.nextLine();

            productos.add(producto);
        }

        System.out.println("\nProductos registrados:");

        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        System.out.println("\nCantidad de productos: " + productos.size());

        sc.close();
    }
}