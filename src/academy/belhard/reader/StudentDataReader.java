package academy.belhard.reader;

import academy.belhard.builder.StudentBuilder;
import academy.belhard.entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDataReader implements FileDataReader<Student> {
    private final String fileName;

    public StudentDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> read() {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String studentLine;

            while ((studentLine = reader.readLine()) != null) {
                Student student = StudentBuilder.build(studentLine);

                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
