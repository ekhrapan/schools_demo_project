package academy.belhard.builder;

import academy.belhard.entity.Student;
import academy.belhard.validator.StudentValidator;

public class StudentBuilder {

    public static Student build(String schoolLine) {
        String[] schoolData = schoolLine.split(CsvConstants.CSV_DELIMITER);

        int id = Integer.parseInt(schoolData[0]);
        String firstName = schoolData[1];
        String lastName = schoolData[2];
        int yearOfBirth = Integer.parseInt(schoolData[3]);
        int schoolId = Integer.parseInt(schoolData[4]);

        Student student = new Student(id, firstName, lastName, yearOfBirth, schoolId);

        StudentValidator.validate(student);

        return student;
    }
}
