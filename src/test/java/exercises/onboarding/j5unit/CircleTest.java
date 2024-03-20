package exercises.onboarding.j5unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(3);
        assertEquals(Math.PI * 9, circle.getArea(), 0.0001);
    }

    @Test
    public void testCircleCircumference() {
        Circle circle = new Circle(3);
        assertEquals(Math.PI * 6, circle.getCircumference(), 0.0001);
    }
}