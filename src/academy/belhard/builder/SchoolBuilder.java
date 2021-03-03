package academy.belhard.builder;

import academy.belhard.entity.School;

public class SchoolBuilder {

    public static School build(String schoolLine) {
        String[] schoolData = schoolLine.split(CsvConstants.CSV_DELIMITER);

        int id = Integer.parseInt(schoolData[0]);
        String name = schoolData[1];
        String city = schoolData[2];

        return new School(id, name, city);
    }
}
