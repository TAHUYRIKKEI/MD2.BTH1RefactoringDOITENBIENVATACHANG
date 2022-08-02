package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sun.awt.geom.AreaOp;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        AreaOp Calculator = null;
        Vector result = Calculator.calculate(a ,b , o);
        assertEquals(expected , result);
    }
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        AreaOp Calculator = null;
        Vector result = Calculator.calculate(a ,b , o);
        assertEquals(expected , result);
    }
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        AreaOp Calculator = null;
        Vector result = Calculator.calculate(a ,b , o);
        assertEquals(expected , result);
    }
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        AreaOp Calculator = null;
        Vector result = Calculator.calculate(a ,b , o);
        assertEquals(expected , result);
    }
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a = 2;
        int b = 0;
        char o = '/';

    assertThrows(RuntimeException.class,()->{Calculator.calculate(a,b,o);});


    }
}
