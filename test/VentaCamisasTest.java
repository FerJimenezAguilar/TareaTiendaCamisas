/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class VentaCamisasTest {
    
    public VentaCamisasTest() {
    }

    @Test
    public void testVenta() {
        System.out.println("Prueba unitaria automatizada de venta");
        int cantidadCamisas1 = 10;
        int cantidadCamisas2 = 10;
        int cantidadCamisas3 = 10;
        VentaCamisas instance = new VentaCamisas();
        float expResult = 6716.0F;
        float result = instance.venta(cantidadCamisas1, cantidadCamisas2, cantidadCamisas3);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
