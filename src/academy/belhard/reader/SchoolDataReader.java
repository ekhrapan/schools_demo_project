package academy.belhard.reader;

import academy.belhard.builder.SchoolBuilder;
import academy.belhard.entity.School;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolDataReader implements FileDataReader<School> {
    private final String fileName;

    public SchoolDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<School> read() {
        List<School> schools = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String schoolLine = null;

            while ((schoolLine = reader.readLine()) != null) {
                School school = SchoolBuilder.build(schoolLine);

                schools.add(school);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return schools;
    }
}
