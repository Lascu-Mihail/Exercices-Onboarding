package exercises.onboarding.mapping;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

    public List<String> mapToFullNames(List<Graduates> graduatesList) {
        return graduatesList.stream()
                .map(graduates -> graduates.getName() + " " + graduates.getLastName())
                .collect(Collectors.toList());
    }

    public List<Integer> mapToAges (List<Graduates> graduatesList) {
        return graduatesList.stream()
                .map(Graduates::getAge)
                .collect(Collectors.toList());
    }

    public List<Integer> mapToGrades (List<Graduates>graduatesList) {
        return graduatesList.stream()
                .map(Graduates::getGrades)
                .collect(Collectors.toList());
    }

    public List<String> gradesWithLabel(List<Graduates> graduatesList) {
        return graduatesList.stream().map(
                graduates -> graduates.getName() + " " + getGraduateLabel(graduates.getGrades()))
                .collect(Collectors.toList());
    }

    public List<String> mapToAgeCategories(List<Graduates> graduatesList) {
        return graduatesList.stream()
                .map(graduates -> {
                    int age = graduates.getAge();
                    if (age < 25) {
                        return "Young";
                    } else if (age < 40) {
                        return "Middle-aged";
                    }else {
                        return "Senior";
                    }
                }).collect(Collectors.toList());
    }


 private  static  String getGraduateLabel (int grades) {
        if (grades >=90) {
            return "Excelent";
        }else if (grades >= 80) {
            return "Good";
        }else {
            return "Average";
        }
 }


}
