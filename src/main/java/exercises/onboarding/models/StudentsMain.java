package exercises.onboarding.models;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsMain {

    public static class Student {
        int age;
        String name;
        String gender;

        public Student(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getGender(){
            return gender;
        }
    }

    public static class StudentsRepository {
        private List<Student> students;

        public <T> StudentsRepository(List<Student> list) {
            students = list;
        }

        //In method "Count Students by Gender:, the method has to return map with key -  Genders of Students and Count  - Value
        public Map<String, Long> countStudentsByGender() {
            return students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
            //TODO: Implement the method using students.streams()
        }
        //"Find By Name" method has to return list of students with defined as parameter Name
        public List<Student> findByName(String name) {
            //TODO: Implement the method using students.streams()
            return students.stream().filter( f -> f.name == name).collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        StudentsRepository repository = new StudentsRepository(
                Arrays.asList(
                        new Student("Robin", 16, "man"),
                        new Student("John", 15, "man"),
                        new Student("John", 17, "man"),
                        new Student("Sara", 15, "woman"),
                        new Student("Eva", 19, "woman"),
                        new Student("Alisa", 17, "woman")));

        System.out.println("Students by gender:");
        repository.countStudentsByGender()
                .forEach( (s,v)  -> System.out.printf("\b%s, -> %d\n", s, v));

        System.out.println("Students with name: John");
        repository.findByName("John")
                .forEach( (s)  -> System.out.printf("\b%s(%s), %d years\n", s.name, s.gender, s.age));
    }
}
