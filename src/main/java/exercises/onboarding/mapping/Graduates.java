package exercises.onboarding.mapping;

public class Graduates {


    String name;
    String lastName;
    int age;
    int grades;

    public Graduates(String name, String lastName, int age, int grades) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Graduates{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
