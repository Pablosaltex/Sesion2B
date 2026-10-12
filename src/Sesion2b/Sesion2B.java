package Sesion2b;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


class Sesion2B {

    empleado emp = new empleado();

    // PRUEBAS DE NOMINA BRUTA

    @Test
    void testVendedorVentas999() {
        assertEquals(2000f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.vendedor, 999f, 0f), 0.01f);
    }

    @Test
    void testVendedorVentas1000() {
        assertEquals(2100f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.vendedor, 1000f, 0f), 0.01f);
    }

    @Test
    void testVendedorVentas1499() {
        assertEquals(2100f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.vendedor, 1499f, 0f), 0.01f);
    }

    @Test
    void testVendedorVentas1500() {
        assertEquals(2200f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.vendedor, 1500f, 0f), 0.01f);
    }

    @Test
    void testEncargadoVentas999() {
        assertEquals(2500f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.encargado, 999f, 0f), 0.01f);
    }

    @Test
    void testEncargadoVentas1000() {
        assertEquals(2600f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.encargado, 1000f, 0f), 0.01f);
    }

    @Test
    void testEncargadoVentas1500() {
        assertEquals(2700f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.encargado, 1500f, 0f), 0.01f);
    }

    @Test
    void testHorasExtra() {
        assertEquals(2030f,
                emp.calculoNominaBruta(
                        empleado.tipoEmpleado.vendedor, 999f, 1f), 0.01f);
    }

    // PRUEBAS DE NOMINA NETA

    @Test
    void testNomina2099() {
        assertEquals(2099f,
                emp.calculoNominaNeta(2099f), 0.01f);
    }

    @Test
    void testNomina2100() {
        assertEquals(2100f,
                emp.calculoNominaNeta(2100f), 0.01f);
    }

    @Test
    void testNomina2101() {
        assertEquals(1785.85f,
                emp.calculoNominaNeta(2101f), 0.01f);
    }

    @Test
    void testNomina2499() {
        assertEquals(2124.15f,
                emp.calculoNominaNeta(2499f), 0.01f);
    }

    @Test
    void testNomina2500() {
        assertEquals(2050f,
                emp.calculoNominaNeta(2500f), 0.01f);
    }

    @Test
    void testNomina2501() {
        assertEquals(2050.82f,
                emp.calculoNominaNeta(2501f), 0.01f);
    }
}