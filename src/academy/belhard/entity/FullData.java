package academy.belhard.entity;

public class FullData {
    private Integer id;
    private String firstName;
    private String lastName;
    private String schoolName;
    private String schoolCity;

    public FullData(Integer id, String firstName, String lastName, String schoolName, String schoolCity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.schoolCity = schoolCity;
    }

    @Override
    public String toString() {
        return "FullData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolCity='" + schoolCity + '\'' +
                '}';
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

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolCity() {
        return schoolCity;
    }
}
