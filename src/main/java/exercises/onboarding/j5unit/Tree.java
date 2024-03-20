package exercises.onboarding.j5unit;

public class Tree {
    private String species;
    private int age;

    public Tree(String species, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a non-negative number");
        }
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String describe() {
        return "A " + age + "-year-old " + species + " tree";
    }
}
