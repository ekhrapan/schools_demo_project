package academy.belhard.exception;

public class YearOfBirthFieldException extends RuntimeException {

    private final static String ERROR_MESSAGE = "Поле [%s = %s] невалидно";

    public YearOfBirthFieldException(String field, Integer value) {
        super(String.format(ERROR_MESSAGE, field, value));
    }
}
