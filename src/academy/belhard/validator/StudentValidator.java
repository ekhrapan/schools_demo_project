package academy.belhard.validator;

import academy.belhard.entity.Student;
import academy.belhard.exception.NullFieldException;
import academy.belhard.exception.YearOfBirthFieldException;

import java.util.Calendar;

public class StudentValidator {

    public static void validate(Student student) {
        if (student.getFirstName() == null) {
            throw new NullFieldException("firstName");
        }

        if (student.getLastName() == null) {
            throw new NullFieldException("lastName");
        }

        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (student.getYearOfBirth() < 2000 || student.getYearOfBirth() > year - 6) {
            throw new YearOfBirthFieldException("yearOfBirth", student.getYearOfBirth());
        }
    }
}
