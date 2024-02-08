package exercises.streams.mapping;

import exercises.onboarding.mapping.Graduates;
import exercises.onboarding.mapping.Mapping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class MappingTest {

    private Mapping mapping;

    private List<Graduates> graduatesList;

    @BeforeEach
    void setUp() {
        mapping = new Mapping();
        graduatesList = Arrays.asList(
                new Graduates("John", "Doe", 25, 90),
                new Graduates("Alice", "Smith", 22, 85),
                new Graduates("Eminescu", "Borcea", 30, 60),
                new Graduates("Nicolae", "Persa", 35, 30));
    }
    @Test
    void mapToFullNames_Success() {
        List<String> fullName = mapping.mapToFullNames(graduatesList);
        assertEquals(Arrays.asList("John Doe", "Alice Smith","Eminescu Borcea","Nicolae Persa"), fullName);
        assertNotNull(fullName);
    }

    @Test
    void mapToAges_Success() {
        List<Integer>ages = mapping.mapToAges(graduatesList);
        assertEquals(Arrays.asList(25,22,30,35),ages);
        assertNotNull(ages);
    }

    @Test
    void mapToGrades_Success() {
        List<Integer> grades =mapping.mapToGrades(graduatesList);
        assertNotNull(grades);
        assertEquals(Arrays.asList(90,85,60,30),grades);
    }

    @Test
    void gradesWithLabel_Success() {
        List<String> label = mapping.gradesWithLabel(graduatesList);
        assertNotNull(label);
        assertEquals(Arrays.asList("John Excelent","Alice Good",
                "Eminescu Average","Nicolae Average"),label);
    }

    @Test
    void mapToAgeCategories_Success() {
        List<String> ageToCategories = mapping.mapToAgeCategories(graduatesList);
        assertNotNull(ageToCategories);
        assertEquals(Arrays.asList("Middle-aged","Young","Middle-aged","Middle-aged"),ageToCategories);
    }
}