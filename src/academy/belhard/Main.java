package academy.belhard;

import academy.belhard.db.reader.FullDataReader;
import academy.belhard.db.writer.SchoolDbWriter;
import academy.belhard.db.writer.StudentDbWriter;
import academy.belhard.entity.FullData;
import academy.belhard.entity.School;
import academy.belhard.entity.Student;
import academy.belhard.reader.FileDataReader;
import academy.belhard.reader.SchoolDataReader;
import academy.belhard.reader.StudentDataReader;
import academy.belhard.writer.JoinedDataWriter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        SchoolDataReader schoolDataReader = new SchoolDataReader("data\\schools.csv");
//        List<School> schools = schoolDataReader.read();
//
//        SchoolDbWriter.write(schools);
//
//        schools.forEach(System.out::println);
//
//        FileDataReader<Student> studentDataReader = new StudentDataReader("data\\students.csv");
//        List<Student> students = studentDataReader.read();
//        StudentDbWriter.write(students);
//
//        schools.forEach(System.out::println);

        List<FullData> joinedData = FullDataReader.read();

        JoinedDataWriter.write("result\\result.csv", joinedData);
    }
}
