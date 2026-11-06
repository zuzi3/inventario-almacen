import java.util.ArrayList;

/**
 * Gestiona la lista de productos del almacén (Bodega).
 * Persona A: registrar y vender.
 * Persona B: mostrarInventario y mostrarStockCritico.
 */
public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    // TODO (Persona A): buscar un producto por nombre (ignorar mayúsculas).
    // Devolver el Producto o null si no existe.
    public Producto buscarProducto(String nombre) {
        return null;
    }

    // TODO (Persona A): CASO DE USO 1 - Registrar.
    // Si el producto existe, sumarle el stock; si no, crearlo y agregarlo a la lista.
    public void registrar(String nombre, int cantidad) {
    }

    // TODO (Persona A): CASO DE USO 2 - Vender.
    // Devolver true si la venta se realizó; false si no existe el producto
    // o si no hay stock suficiente. NUNCA dejar stock negativo.
    public boolean vender(String nombre, int cantidad) {
        return false;
    }

    // TODO (Persona B): CASO DE USO 3 - Ver inventario.
    // Imprimir nombre y stock de cada producto.
    public void mostrarInventario() {
    }

    // TODO (Persona B): CASO DE USO 4 - Ver stock crítico.
    // Imprimir solo los productos con 5 unidades o menos.
    public void mostrarStockCritico() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
