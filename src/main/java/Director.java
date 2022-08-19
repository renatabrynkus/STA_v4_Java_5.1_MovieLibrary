public class Director {

    private String firstName;
    private String lastName;

    Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Director() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
