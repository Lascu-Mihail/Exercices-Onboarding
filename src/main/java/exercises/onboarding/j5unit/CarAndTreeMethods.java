package exercises.onboarding.j5unit;

public class CarAndTreeMethods {

    public static String processCar(Car car) {
        return "Processing car: " + car.getDescription();
    }

    public static String processTree(Tree tree) {
        return "Processing tree: " + tree.describe();
    }

    public static String processCarAndTree(Car car, Tree tree) {
        return "Processing car and tree: " + car.getDescription() + ", " + tree.describe();
    }
}
