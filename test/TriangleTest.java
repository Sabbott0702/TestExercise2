/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sean
 */
public class TriangleTest {
    
    public TriangleTest() {
        
    }
    
    @Test
    public void calcEquilateral()
    {
        float side1 = 3;
        float side2 = 3;
        float side3 = 3;
        
        Triangle instance = new Triangle(side1, side2, side3);
        
        String expected = "Triangle is Equilateral";
        
        String result = instance.isRightTriangle();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void calcIsosceles()
    {
        float side1 = 3;
        float side2 = 3;
        float side3 = 5;
        
        Triangle instance = new Triangle(side1, side2, side3);
        
        String expected = "Triangle is Isosceles";
        
        String result = instance.isRightTriangle();
        
        assertEquals(expected, result);
    }
    
    @Test public void calcScalene()
    {
        float side1 = 3;
        float side2 = 4;
        float side3 = 5;
        
        Triangle instance = new Triangle(side1, side2, side3);
        
        String expected = "Triangle is Scalene";
        
        String result = instance.isRightTriangle();
        
        assertEquals(expected, result);
    }
    @Test public void calcNotTriangleFail()
    {
        float side1 = 50;
        float side2 = 4;
        float side3 = 4;
        
        Triangle instance = new Triangle(side1, side2, side3);
        
        String expected = "Not a Trianle A";
        
        String result = instance.isRightTriangle();
        
        assertEquals(expected, result);
    }
    
    @Test public void calcValueFail()
    {
        float side1 = 1;
        float side2 = 4;
        float side3 = 4;
        
        Triangle instance = new Triangle(side1, side2, side3);
        
        String expected = "Value of A is not in the range of permitted values";
        
        String result = instance.isRightTriangle();
        
        assertEquals(expected, result);
    }
    
    
}
