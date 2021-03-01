package academy.belhard.db.reader;

import academy.belhard.db.ConnectionUtil;
import academy.belhard.entity.FullData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullDataReader {

    private static final String SELECT_FULL_DATA = "SELECT st.id, st.first_name, st.last_name, sc.name, sc.city FROM students AS st INNER JOIN schools AS sc ON sc.id = st.school_id";

    public static List<FullData> read() {
        List<FullData> result = new ArrayList<>();

        Connection connection = ConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_FULL_DATA)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");

                result.add(new FullData(id, firstName, lastName, name, city));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
