package academy.belhard.builder;

import academy.belhard.entity.FullData;

public class FullDataBuilder {

    public static String objectToString(FullData item) {
        return String.join(CsvConstants.CSV_DELIMITER,
                Integer.toString(item.getId()),
                item.getFirstName(),
                item.getLastName(),
                item.getSchoolName(),
                item.getSchoolCity());
    }
}
