/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brais
 */
public class ContadorAscendenteTest {
    
    public ContadorAscendenteTest() {
    }

   
    @Test
    public void testIncrementar_caixaBranca_1() {
        System.out.println("incrementar - T1");
        ContadorAscendente instance = new ContadorAscendente(500);
        int expResult = 501;
        int result = instance.incrementar();
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testIncrementar_caixaBranca_2() {
        System.out.println("incrementar - T2");
        ContadorAscendente instance = new ContadorAscendente(1500);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorMais_1() {
        System.out.println("incrementar - CaixaNegra valor++, válido");
        ContadorAscendente instance = new ContadorAscendente(-100);
        int expResult = -99;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorMais_2() {
        System.out.println("incrementar - CaixaNegra valor++, válido_2");
        ContadorAscendente instance = new ContadorAscendente(0);
        int expResult = 1;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorMais_3() {
        System.out.println("incrementar - CaixaNegra valor++, válido_3");
        ContadorAscendente instance = new ContadorAscendente(500);
        int expResult = 501;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorMais_4() {
        System.out.println("incrementar - CaixaNegra valor++, válido_4, LIM");
        ContadorAscendente instance = new ContadorAscendente(999);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorMais_5() {
        System.out.println("incrementar - CaixaNegra valor++, non valido");
        ContadorAscendente instance = new ContadorAscendente(1500);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorMais_6() {
        System.out.println("incrementar - CaixaNegra valor++, non valido_LIM");
        ContadorAscendente instance = new ContadorAscendente(1000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorActual_1() {
        System.out.println("incrementar - CaixaNegra valorActual, valido");
        ContadorAscendente instance = new ContadorAscendente(1500);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorActual_2() {
        System.out.println("incrementar - CaixaNegra valorActual, valido_LIM");
        ContadorAscendente instance = new ContadorAscendente(1000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorActual_3() {
        System.out.println("incrementar - CaixaNegra valorActual, non valido");
        ContadorAscendente instance = new ContadorAscendente(500);
        int expResult = 501;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIncrementar_caixaNegra_valorActual_4() {
        System.out.println("incrementar - CaixaNegra valorActual, non valido_LIM");
        ContadorAscendente instance = new ContadorAscendente(999);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    
    
    
    
    
    
}
