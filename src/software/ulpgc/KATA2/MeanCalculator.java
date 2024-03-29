package software.ulpgc.KATA2;

import java.util.List;
import java.util.Map;

public class MeanCalculator {
    public Map<String, Double> calculate(List<Student> students){
        return Map.of("Altura: ", meanHeight(students), "Peso: ", meanWeight(students));
    }

    private double meanHeight(List<Student> students){
        return students.stream().mapToDouble(Student::getHeight).average().orElse(0);
    }

    private double meanWeight(List<Student> students){
        return students.stream().mapToDouble(Student::getWeight).average().orElse(0);
    }

}
