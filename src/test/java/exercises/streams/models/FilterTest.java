package exercises.streams.models;

import exercises.onboarding.models.Filter;
import exercises.onboarding.models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FilterTest {


    private Filter filter;
    private List<Integer> listNum;

    private List<Student> students;

    @BeforeEach
    void setUp() {
        filter = new Filter();
        listNum = Arrays.asList(1,2,3,4,5,6,7,8);
        students = Arrays.asList(
                new Student("Jon",21,true,"Biology"),
                new Student("Janna",10,true,"Mathematics"),
                new Student("Wolf",33,false,"Music"),
                new Student("Garen",40,false,"Robotics"),
                new Student("Arthiom",25,false,"Music"),
                new Student("Ricker" ,33,true,"History"),
                new Student("Jumbo" ,20,false,"History"));
    }
    @Test
    void filterList_Success() {
        List<Integer> num = filter.filterList(listNum);
        assertEquals(Arrays.asList(2,4,6,8),num);
        assertNotNull(num);
    }

    @Test
    void filterOddNumber_Success() {
        List<Integer> filterOddNumber = filter.filterOddNumber(listNum);
        assertNotNull(filterOddNumber);
        assertEquals(Arrays.asList(1,3,5,7),filterOddNumber);
    }

    @Test
    void filterNumber_Success() {
        List<Integer> higherThanZero = filter.filterNumber(listNum);
        assertNotNull(higherThanZero);
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8),higherThanZero);
    }

    @Test
    void filterAndRemoveNumber_Success() {
        List<Integer> removeFive = filter.filterAndRemoveNumber(listNum);
        assertNotNull(removeFive);
        assertEquals(Arrays.asList(1,2,3,4,6,7,8),removeFive);
    }

    @Test
    void findMaxNumber_Success() {
        Integer maxNumber = Filter.findMaxNumber(listNum);
        assertNotNull(maxNumber);
        assertEquals(8,maxNumber);

    }

    @Test
    void filterStudent_Success() {
        List<Student> studentList = filter.filterStudent(students);
        assertNotNull(studentList);
        assertEquals(2,studentList.size());
    }

    @Test
    void filterStudentAge_Success() {
        List<Student> filterStudentAge = filter.filterStudentAge(students);
        assertNotNull(filterStudentAge);
        assertEquals(1,filterStudentAge.size());
    }

    @Test
    void filterStudentAgeAndName_Success() {
        List<Student> filteredStudents = filter.filterStudentAgeAndName(students);
        assertNotNull(filteredStudents);
        assertEquals(1, filteredStudents.size());
    }

    @Test
    void filterBetweenAge_Success() {
        List<Student> filteredStudents = filter.filterBetweenAge(students);
        assertNotNull(filteredStudents);
        assertEquals(2, filteredStudents.size());
    }

    @Test
    void filterDisciplinePerStudent_Success() {
        List<Student> filteredStudents = filter.filterDisciplinePerStudent(students, "Music");
        assertNotNull(filteredStudents);
        assertEquals(2, filteredStudents.size());
    }

    @Test
    void filterGetAgeAndName_Success() {
        List<String> filteredInfo = filter.filterGetAgeAndName(students);
        assertNotNull(filteredInfo);
        assertEquals(2, filteredInfo.size());
    }

    @Test
    void filterByDisciplineIfItHas_Success() {
        List<Student> filteredDisciplines = filter.filterByDisciplineIfItHas(students);
        assertNotNull(filteredDisciplines);
        assertEquals(2, filteredDisciplines.size());
    }
}