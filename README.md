# Inventario Almacén

Aplicación de consola en Java para gestionar el inventario de un almacén
(Actividad 2.3 – Fundamentos de Programación Orientada a Objetos, Santo Tomás).

## Casos de uso
1. Registrar producto (si existe, suma stock)
2. Vender producto (no permite vender más del stock)
3. Ver inventario
4. Ver stock crítico (5 unidades o menos)

## Estructura
- `Producto.java`: nombre y stock.
- `Inventario.java`: administra el `ArrayList<Producto>`.
- `Main.java`: menú de consola.
- `InventarioTest.java`: pruebas JUnit 5.

## Integrantes
- Persona A: Producto e Inventario (registrar, vender)
- Persona B: reportes, Main y pruebas JUnit

## Ejecutar pruebas
```
mvn test
```
