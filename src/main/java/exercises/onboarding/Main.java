package exercises.onboarding;



import exercises.onboarding.mapping.Graduates;
import exercises.onboarding.mapping.Mapping;
import exercises.onboarding.models.Filter;
import exercises.onboarding.models.Reduce;
import exercises.onboarding.models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Filter filter = new Filter();

        Reduce reduce = new Reduce();

        Mapping gradeMapping = new Mapping();

        List<Student> students = Arrays.asList(
                new Student("Jon",21,true,"Biology"),
                new Student("Janna",10,true,"Mathematics"),
                new Student("Wolf",33,false,"Music"),
                new Student("Garen",40,false,"Robotics"),
                new Student("Arthiom",25,false,"Music"),
                new Student("Ricker" ,33,true,"History"),
                new Student("Jumbo" ,20,false,"History"));

        List<Graduates> graduatesList = Arrays.asList(
                new Graduates("John", "Doe", 25, 90),
                new Graduates("Alice", "Smith", 22, 85),
                new Graduates("Eminescu", "Borcea", 30, 60),
                new Graduates("Nicolae", "Persa", 35, 30));

        List<Integer> listNum = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer>evenNumber = filter.filterList(listNum);
        System.out.println("Even number: " + evenNumber);

        List<Integer>oddNumber = filter.filterOddNumber(listNum);
        System.out.println("Odd number: " + oddNumber);

        List<Integer> higherThanZero = filter.filterNumber(listNum);
        System.out.println("Higher than 0: " + higherThanZero);

        List<Integer> higherNumber = filter.filterAndRemoveNumber(listNum);
        System.out.println("Filter and Remove Number 5: " + higherNumber);

        Optional<Integer> maxNumber = filter.findMaxNumber(listNum);

        if (maxNumber.isPresent()) {
            System.out.println("The higher number is "  + maxNumber.map(Objects::toString).orElse("none"));
        }else {
            System.out.println("There is no max number");
        }


        ///For Students

        List<Student> filterStudents = filter.filterStudent(students);
        System.out.println("Students with age over 20: " + filterStudents);

        List <Student> filterStudentAge = filter.filterStudentAge(students);
        System.out.println("Students with age lower than 17: " + filterStudentAge);

        List<Student> studentAgeAndNameFilter =filter.filterStudentAgeAndName(students);
        System.out.println("The student with name: " + studentAgeAndNameFilter);

        List<Student> studentListFilterBetweenAge = filter.filterBetweenAge(students);
        System.out.println("Students between age 21 and 33: " + studentListFilterBetweenAge);

        List<Student> filterStudentPerDiscipline = filter.filterDisciplinePerStudent(students,"Music");
        System.out.println("Students with 'Music' discipline: " + filterStudentPerDiscipline);

        List<String> distinctDiscipline = students.stream()
                .map(student -> student.getDiscipline().split(","))
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList());
        System.out.println("Distinct Disciplines: " + distinctDiscipline);


        List<String> filterStudentByAgeAndName  = filter.filterGetAgeAndName(students);
        System.out.println("Distinct Student Names between 20 and 33: " + filterStudentByAgeAndName);

        List<Student> filterByDiscipline = filter.filterByDisciplineIfItHas(students);
        System.out.println("Students without 'History' discipline: " + filterByDiscipline);

        Optional<Integer> sumStudentAges = reduce.sumStudentAges(students);
        System.out.println("Sum of student ages: " + sumStudentAges.map(Objects::toString).orElse("None"));

        Optional<Student> oldestStudent = reduce.findOldestStudent(students);
        System.out.println("The oldest student is: " + oldestStudent.map(Object::toString).orElse("None"));

        ////Mapping

        List<String> fullName = gradeMapping.mapToFullNames(graduatesList);
        System.out.println("Full names of graduates: " + fullName);

        List<Integer> graduatesAges = gradeMapping.mapToAges(graduatesList);
        System.out.println("Ages of graduates: " + graduatesAges);

        List<Integer> showGrades = gradeMapping.mapToGrades(graduatesList);
        System.out.println("Grades of graduates: " + showGrades);

        List<String> label = gradeMapping.gradesWithLabel(graduatesList);

        String labaeledGrades = String.join(" , ", label);
        System.out.println("Grades with Labels: " + labaeledGrades);

        List<String> mapAgeToCategories = gradeMapping.mapToAgeCategories(graduatesList);
        System.out.println("Age categories of graduates: " + mapAgeToCategories);

    }
}
