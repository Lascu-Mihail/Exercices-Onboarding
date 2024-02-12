package exercises.onboarding.models;

import java.util.List;
import java.util.Optional;

public class Reduce {

    public Optional<Integer> sumStudentAges(List<Student> students) {
        return students.stream()
                .map(Student::getAge)
                .reduce(Integer::sum);
    }

    public Optional<Student> findOldestStudent(List<Student> students) {
        return students.stream()
                .reduce((student1, student2) -> student1.getAge() >= student2.getAge() ? student1 : student2);

    }
}
