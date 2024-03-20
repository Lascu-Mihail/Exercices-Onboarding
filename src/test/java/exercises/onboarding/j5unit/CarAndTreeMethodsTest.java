package exercises.onboarding.j5unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarAndTreeMethodsTest {
    @Test
     void testProcessCar() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertEquals("Processing car: 2022 Toyota Camry", CarAndTreeMethods.processCar(car));
    }

    @Test
     void testProcessTree() {
        Tree tree = new Tree("Oak", 30);
        assertEquals("Processing tree: A 30-year-old Oak tree", CarAndTreeMethods.processTree(tree));
    }

    @Test
     void testProcessCarAndTree() {
        Car car = new Car("Honda", "Accord", 2021);
        Tree tree = new Tree("Maple", 25);
        assertEquals("Processing car and tree: 2021 Honda Accord, A 25-year-old Maple tree",
                CarAndTreeMethods.processCarAndTree(car, tree));
    }

    @Test
     void testInvalidTreeAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            Tree invalidTree = new Tree("Birch", -5);
            CarAndTreeMethods.processTree(invalidTree);
    });
}
}
