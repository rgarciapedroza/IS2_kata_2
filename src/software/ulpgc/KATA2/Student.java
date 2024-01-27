package software.ulpgc.KATA2;

import java.io.File;
import java.util.Objects;

public class Student {
    private final int age;
    private final String gender;
    private final double height;
    private final double weight;

    public Student(int age, String gender, double weight, double height) {
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o){
        return o != null && getClass() == o.getClass() && (this == o || equals((Student)o));
    }

    @Override
    public int hashCode(){
        return Objects.hash(age, gender, height, weight);
    }


    @Override
    public String toString(){
        return "Estudiante{ " +
                "Edad: " + age +
                "Altura: " + height +
                "Peso: " + weight +
                "Género: " + gender + "}";
    }
}
