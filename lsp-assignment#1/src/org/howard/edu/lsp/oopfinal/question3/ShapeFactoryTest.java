package org.howard.edu.lsp.oopfinal.question3;
import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeFactoryTest {

	    @Test
	    public void testCreateCircle() {
	        Shape circle = ShapeFactory.createShape("Circle");
	        circle.draw();
	        assertNotNull(circle);
	        assertTrue(circle instanceof Circle);
	    }

	    @Test
	    public void testCreateRectangle() {
	        Shape rectangle = ShapeFactory.createShape("Rectangle");
	        rectangle.draw();
	        assertNotNull(rectangle);
	        assertTrue(rectangle instanceof Rectangle);
	    }
}