package software.ulpgc.KATA2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentLoader loader = FileStudentLoader.loadStudent("C:/Users/rosma/OneDrive/DatosEstudiantes2EII.csv");
        List<Student> students = loader.load();

        System.out.println("\n\nHISTOGRAMA POR GENERO Y PESO DE LOS ESTUDIANTES DE LA EII");
        System.out.println("___________________________________________________________________");

        System.out.println("\nMUJERES");
        Map<String, Integer> histogramWomen = new WeightHistogramCalculator(students).calculateWomen();
        for (String key : histogramWomen.keySet().stream().sorted().toList()){
            System.out.println(String.format("%-7s %-3d", key, histogramWomen.get(key)));
        }

        System.out.println("\nHOMBRES");
        Map<String, Integer> histogramMen = new WeightHistogramCalculator(students).calculateMen();
        for (String key : histogramMen.keySet().stream().sorted().toList()){
            System.out.println(String.format("%-7s %-3d", key, histogramMen.get(key)));
        }

        System.out.println(students.get(0).toString());
    }




}
