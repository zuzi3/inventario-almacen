/**
 * Representa un producto del almacén.
 * RESPONSABLE: Persona A
 */
public class Producto {

    private String nombre;
    private int stock;

    // TODO (Persona A): constructor que reciba nombre y stock inicial
    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    // TODO (Persona A): devolver el nombre
    public String getNombre() {
        return nombre;
    }

    // TODO (Persona A): devolver el stock
    public int getStock() {
        return stock;
    }

    // TODO (Persona A): sumar unidades al stock actual
    public void agregarStock(int cantidad) {
        this.stock += cantidad;
    }

    // TODO (Persona A): restar unidades al stock actual
    public void restarStock(int cantidad) {
        this.stock -= cantidad;
    }
}
