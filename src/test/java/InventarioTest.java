import static org.junit.jupiter.api.Assertions.*;

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
    }

    // TODO: registrar con 10, vender 4 y comprobar que quedan 6.
    @Test
    void venderRestaStock() {
    }

    // TODO: registrar con 3, intentar vender 5, comprobar que vender devuelve
    // false (assertFalse) y que el stock sigue en 3 (nunca negativo).
    @Test
    void rechazaVentaMayorAlStock() {
    }
}
