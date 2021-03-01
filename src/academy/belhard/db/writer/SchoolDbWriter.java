package academy.belhard.db.writer;

import academy.belhard.db.ConnectionUtil;
import academy.belhard.entity.School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SchoolDbWriter {

    private static final String INSERT = "INSERT INTO schools (id, city, name) VALUES(?, ?, ?)";

    public static void write(List<School> schools) {
        Connection connection = ConnectionUtil.getConnection();

        for (School school : schools) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, school.getId());
                statement.setString(2, school.getCity());
                statement.setString(3, school.getName());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
