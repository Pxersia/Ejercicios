import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> usuarios = new HashSet<>();

        System.out.print("¿Cuántos usuarios desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Usuario " + i + ": ");
            String nombre = sc.nextLine();

            boolean agregado = usuarios.add(nombre);

            if (!agregado) {
                System.out.println("Usuario repetido");
            }
        }

        System.out.println("\nUsuarios únicos:");

        for (String usuario : usuarios) {
            System.out.println("- " + usuario);
        }

        System.out.println("\nCantidad de usuarios únicos: " + usuarios.size());

        sc.close();
    }
}