public class Actor {

    private String firstName;
    private String lastName;

    Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Actor() {
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
