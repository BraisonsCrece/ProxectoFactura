/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectofactura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brais
 */
public class ArtigoFacturaTest {
    
    public ArtigoFacturaTest() {
    }


    /**
     * Test of obterPrezoTotal method, of class ArtigoFactura.
     */
    @Test
    public void testObterPrezoTotal() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura instance = new ArtigoFactura("MP4","Rato inarámico",20,10);
        double expResult = 200.0;
        double result = instance.obterPrezoTotal();
        assertEquals(expResult, result, 0.01);

    }
    
}
