package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testCadenaVacia() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testCorchetesSimoles() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
    }
    @Test
    public void testCorchetesanidados(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{()}]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
    }
    @Test
    public void Corchetesdesbalanceadossimples(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{"));

    }
    @Test
    public void Corchetesdesbalanceadosanidados(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{)]"));
    }
    @Test
    public void Cadenaconsolocorchetes(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[]]]]]]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{{{{{{{{}}}}}}}}"));
    }
    @Test
    public void Cadenalargadesbalanceada(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("(((((())"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[[[}"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{{{{{{}}}}"));
    }
    @Test
    public void Ordenincorrectodecorchetes(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(")["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{)"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("(]"));
    }
}
