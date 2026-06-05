import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFrutas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> frutas = new ArrayList<>();

        agregarFrutas(frutas, sc);

        System.out.println("\n--- Lista Inicial ---");
        mostrarFrutas(frutas);

        mostrarCantidad(frutas);

        reemplazarFruta(frutas, sc);

        eliminarFruta(frutas, sc);

        System.out.println("\n--- Lista Final ---");
        mostrarFrutas(frutas);

        mostrarCantidad(frutas);

        sc.close();
    }

    // Agregar frutas
    static void agregarFrutas(List<String> frutas, Scanner sc) {

        System.out.print("¿Cuántas frutas desea ingresar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese una fruta: ");
            String fruta = sc.nextLine();
            frutas.add(fruta);
        }
    }

    // Mostrar frutas
    static void mostrarFrutas(List<String> frutas) {

        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }

    // Mostrar cantidad
    static void mostrarCantidad(List<String> frutas) {

        System.out.println("\nCantidad de frutas: " + frutas.size());
    }

    // Reemplazar fruta
    static void reemplazarFruta(List<String> frutas, Scanner sc) {

        System.out.print("\nIngrese la fruta que desea reemplazar: ");
        String frutaVieja = sc.nextLine();

        if (frutas.contains(frutaVieja)) {

            System.out.print("Ingrese la nueva fruta: ");
            String frutaNueva = sc.nextLine();

            int posicion = frutas.indexOf(frutaVieja);
            frutas.set(posicion, frutaNueva);

            System.out.println("Fruta reemplazada correctamente.");

        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    // Eliminar fruta
    static void eliminarFruta(List<String> frutas, Scanner sc) {

        System.out.print("\nIngrese la fruta que desea eliminar: ");
        String frutaEliminar = sc.nextLine();

        if (frutas.contains(frutaEliminar)) {

            frutas.remove(frutaEliminar);
            System.out.println("Fruta eliminada correctamente.");

        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }
}