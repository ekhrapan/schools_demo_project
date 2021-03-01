package academy.belhard.entity;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer yearOfBirth;
    private Integer schoolId;

    public Student(Integer id, String firstName, String lastName, Integer yearOfBirth, Integer schoolId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.schoolId = schoolId;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", schoolId=" + schoolId +
                '}';
    }
}
