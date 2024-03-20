package exercises.onboarding.j5unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea());
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.getPerimeter());
    }
}