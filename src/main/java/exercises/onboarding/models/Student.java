package exercises.onboarding.models;

import java.util.Set;

public class Student {

    private String name;

    private int age;

    private boolean isInternational;

    private String discipline;

    public Student(String name, int age, boolean isInternational, String discipline) {
        this.name = name;
        this.age = age;
        this.isInternational = isInternational;
        this.discipline  = discipline;
    }

    @Override
    public String toString() {
        return "Student -> " +
                "name='" + name + '\'' +
                ", age= " + age +
                ", isInternational= " + isInternational +
                ", discipline= " + discipline +
                '}';
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }
}
