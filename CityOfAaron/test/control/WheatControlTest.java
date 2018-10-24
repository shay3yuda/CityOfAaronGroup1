/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brenda
 */
public class WheatControlTest {
    
    public WheatControlTest() {
    }

    /**
     * Test of calculateLossToRats method, of class WheatControl.
     */
    @Test
    public void testCalculateLossToRatscase1() {
        System.out.println("calculateLossToRats");
        int tithesPercent = 10;
        int wheatInStorage = 105;
        int expResult = 5;
        int result = WheatControl.calculateLossToRats(tithesPercent, wheatInStorage);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCalculateLossToRatscase2() {
        int result = WheatControl.calculateLossToRats(11, -1);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCalculateLossToRatscase3() {
        int result = WheatControl.calculateLossToRats(110, 350);
        assertEquals(-2, result);
    }
    
    @Test
    public void testCalculateLossToRatscase4() {
        int result = WheatControl.calculateLossToRats(-1, 1500);
        assertEquals(-2, result);
    }
    
    @Test
    public void testCalculateLossToRatscase5() {
        int result = WheatControl.calculateLossToRats(0, 1);
        assertEquals(0, result);
    }
    
    @Test
    public void testCalculateLossToRatscase6() {
        int result = WheatControl.calculateLossToRats(13, 5000);
        assertEquals(250, result);
    }
}
