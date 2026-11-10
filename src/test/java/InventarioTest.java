import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias JUnit 5.
 * RESPONSABLE: Persona B (Persona A revisa que entienda qué valida cada una).
 */
public class InventarioTest {

    // TODO: registrar "Bebida 3L" con 10, volver a registrar con 5 y comprobar
    // que el stock queda en 15 (assertEquals).
    @Test
void agregarStockSumaAlExistente() {
    Inventario inv = new Inventario();
    inv.registrar("Bebida 3L", 10);
    inv.registrar("Bebida 3L", 5);
    assertEquals(15, inv.buscarProducto("Bebida 3L").getStock());
}

@Test
void venderRestaStock() {
    Inventario inv = new Inventario();
    inv.registrar("Bebida 3L", 10);
    assertTrue(inv.vender("Bebida 3L", 4));
    assertEquals(6, inv.buscarProducto("Bebida 3L").getStock());
}

@Test
void rechazaVentaMayorAlStock() {
    Inventario inv = new Inventario();
    inv.registrar("Bebida 3L", 3);
    assertFalse(inv.vender("Bebida 3L", 5));
    assertEquals(3, inv.buscarProducto("Bebida 3L").getStock());
  }
}
