package software.ulpgc.KATA2;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class FileStudentLoader implements StudentLoader{
    private final File file;

    public FileStudentLoader(File file) {
        this.file = file;
    }

    public static StudentLoader loadStudent(String file){
        return new FileStudentLoader(new File(file));
    }

    @Override
    public List<Student> load(){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            return reader.lines().skip(1).map(this::toStudent).collect(Collectors.toList());
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    private Student toStudent(String line){
        String[] student = line.split(",");
        return new Student(
                parseInt(student[0]),
                student[1],
                parseDouble(student[2]),
                parseDouble(student[3])
        );
    }
}
