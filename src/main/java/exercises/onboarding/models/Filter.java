package exercises.onboarding.models;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    public List<Integer> filterList (List<Integer> numbers ) {
        return numbers.stream().filter(
                n -> n % 2 == 0 )
                .collect(Collectors.toList());
    }

    public List<Integer> filterOddNumber (List<Integer> num) {
        return num.stream().filter(
                n -> n % 2 != 0 )
                .collect(Collectors.toList());
    }

    public List<Integer> filterNumber (List<Integer> number) {

        return number.stream().filter(
                n -> n > 0)
                .collect(Collectors.toList());
    }
    public List<Integer> filterAndRemoveNumber (List <Integer> numberHigher ) {
        return numberHigher.stream().filter(
                n-> n != 5
        ).collect(Collectors.toList());
    }

    public Optional<Integer>findMaxNumber (List<Integer> number ){
        return number.stream().filter(
                n-> n > 0 ).max(Integer::compareTo);
    }

    public List<Student> filterStudent(List<Student> students) {
        return students.stream().filter(
                student -> student.getAge() > 20 && student.isInternational())
                .collect(Collectors.toList());

    }

    public List<Student> filterStudentAge(List<Student> students) {
        return students.stream().filter(
                student -> student.getAge() < 17 && student.isInternational())
                .collect(Collectors.toList());
    }

    public List<Student> filterStudentAgeAndName(List<Student> students) {
        return students.stream().filter(
                student -> student.getAge() > 15 && student.getName().equals("Jon")
        ).collect(Collectors.toList());
    }

    public List<Student> filterBetweenAge (List<Student> students){
        return students.stream().filter(
                student -> student.getAge() >= 21 && student.getAge() <= 34 &&
                        student.isInternational()
        ).collect(Collectors.toList());

    }


    public List<Student> filterDisciplinePerStudent (List<Student> students,String discipline) {
        return students.stream().filter(
                student -> student.getDiscipline().contains(discipline)
        ).collect(Collectors.toList());
    }

    public List<String>filterGetAgeAndName(List<Student> students){
        return students.stream().filter(
                student -> student.getAge() >= 20 && student.getAge() <= 33
        ).map(Student::getName).limit(2).collect(Collectors.toList());
    }

   public List<Student> filterByDisciplineIfItHas (List<Student> students) {
        return students.stream().filter(
                student -> !student.getDiscipline().contains("History")
        ).distinct().limit(4).collect(Collectors.toList());
    }

}
