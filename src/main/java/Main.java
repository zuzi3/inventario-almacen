import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n=== MENÚ BODEGA ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Ver inventario");
            System.out.println("4. Ver stock crítico");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1:
                    registrarProducto(inventario, sc);
                    break;
                case 2:
                    venderProducto(inventario, sc);
                    break;
                case 3:
                    inventario.mostrarInventario();
                    break;
                case 4:
                    inventario.mostrarStockCritico();
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static void registrarProducto(Inventario inventario, Scanner sc) {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = leerEntero(sc);
        if (cantidad > 0) {
            inventario.registrar(nombre, cantidad);
            System.out.println("Producto registrado.");
        } else {
            System.out.println("La cantidad debe ser un número mayor que 0.");
        }
    }

    private static void venderProducto(Inventario inventario, Scanner sc) {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Cantidad a vender: ");
        int cantidad = leerEntero(sc);
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número mayor que 0.");
        } else if (inventario.vender(nombre, cantidad)) {
            System.out.println("Venta realizada.");
        } else {
            System.out.println("No se pudo vender: el producto no existe o no hay stock suficiente.");
        }
    }

    private static int leerEntero(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}