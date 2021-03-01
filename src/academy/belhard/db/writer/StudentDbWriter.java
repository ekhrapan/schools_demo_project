package academy.belhard.db.writer;

import academy.belhard.db.ConnectionUtil;
import academy.belhard.entity.School;
import academy.belhard.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDbWriter {

    private static final String INSERT = "INSERT INTO students (id, first_name, last_name, year_of_birth, school_id) VALUES(?, ?, ?, ?, ?)";

    public static void write(List<Student> students) {
        Connection connection = ConnectionUtil.getConnection();

        for (Student student : students) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, student.getId());
                statement.setString(2, student.getFirstName());
                statement.setString(3, student.getLastName());
                statement.setInt(4, student.getYearOfBirth());
                statement.setInt(5, student.getSchoolId());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
