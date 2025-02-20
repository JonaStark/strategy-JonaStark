/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package miTiendita.init;

import org.junit.Test;

import miTiendita.productos.CatProductos;
import miTiendita.productos.Producto;
import miTiendita.venta.Venta;

import static org.junit.Assert.*;

import org.junit.Before;

public class AppTest {
    Venta v;
    CatProductos cp;
    @Before public void initVenta()
    {
        cp = new CatProductos();
    }

    private void loadMandando()
    {
        Producto p;

        p = cp.getProducto(0);
        v.addProducto(p,10);

        p = cp.getProducto(1);
        v.addProducto(p,0.5);

        p = cp.getProducto(2);
        v.addProducto(p,0.25);

        p = cp.getProducto(4);
        v.addProducto(p,0.5);

        p = cp.getProducto(5);
        v.addProducto(p,1);

        p = cp.getProducto(6);
        v.addProducto(p,2);
    }

    @Test public void testLunes() {
        v = new Venta(1, true);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Lunes");
        assertTrue((v.getTotal() >= 276.72) && (v.getTotal() <= 276.76));
//      assertTrue(v.getTotal() == 276.73975);
    }

    @Test public void testMartes() {
        v = new Venta(2, false);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Martes");
        assertTrue((v.getTotal() >= 291.28) && (v.getTotal() <= 291.32));
//      assertTrue(v.getTotal() == 291.305);
    }

    @Test public void testMiercoles() {
        v = new Venta(3, false);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Miercoles");
        assertTrue((v.getTotal() >= 266.79) && (v.getTotal() <= 266.83));
//      assertTrue(v.getTotal() == 266.8145);
    }

    @Test public void testJueves() {
        v = new Venta(4, false);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Jueves");
        assertTrue((v.getTotal() >= 284.32) && (v.getTotal() <= 284.36));
//      assertTrue(v.getTotal() == 284.345);
    }

    @Test public void testViernes() {
        v = new Venta(5, false);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Viernes");
        assertTrue(v.getTotal() >= 254.55 && v.getTotal() <= 254.59);
//      assertTrue(v.getTotal() == 254.57);
    }

    @Test public void testSabado() {
        v = new Venta(6, false);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Sabado");
        assertTrue((v.getTotal() >= 291.28) && (v.getTotal() <= 291.33));
//      assertTrue(v.getTotal() == 291.305);
    }

    @Test public void testDomingo() {
        v = new Venta(7, true);
        loadMandando();
        System.out.println(v.getTotal()+ " total de dia Domingo");
        assertTrue((v.getTotal() >= 276.72) && (v.getTotal() <= 276.76));
//      assertTrue(v.getTotal() == 276.73975);
    }
}
