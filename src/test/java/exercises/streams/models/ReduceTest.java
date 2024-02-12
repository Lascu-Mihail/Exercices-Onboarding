package exercises.streams.models;

import exercises.onboarding.models.Reduce;
import exercises.onboarding.models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReduceTest {

    private Reduce reduce;

    private List<Student> students;

    @BeforeEach
    void setUp() {
        reduce = new Reduce();
        students = Arrays.asList(
                new Student("Jon",21,true,"Biology"),
                new Student("Janna",10,true,"Mathematics"),
                new Student("Wolf",33,false,"Music"),
                new Student("Garen",40,false,"Robotics"));

    }

    @Test
    void testSumStudentAges() {
        Optional<Integer> sumAges = reduce.sumStudentAges(students);

        assertTrue(sumAges.isPresent());
        assertEquals(21 + 10 + 33 + 40, sumAges.get());
    }

    @Test
    void testSumStudentAgesEmptyList() {
        List<Student> emptyStudents = List.of();
        Optional<Integer> sumAges = reduce.sumStudentAges(emptyStudents);

        assertTrue(sumAges.isEmpty());
    }

    @Test
    void testFindOldestStudent() {
        Optional<Student> oldestStudent = reduce.findOldestStudent(students);

        assertTrue(oldestStudent.isPresent());
        assertEquals("Garen", oldestStudent.get().getName());
    }

    @Test
    void testFindOldestStudentEmptyList() {
        List<Student> emptyStudents = List.of();
        Optional<Student> oldestStudent = reduce.findOldestStudent(emptyStudents);

        assertTrue(oldestStudent.isEmpty());
    }
}