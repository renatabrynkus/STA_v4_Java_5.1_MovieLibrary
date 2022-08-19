import java.util.ArrayList;
import java.util.Scanner;

public class UserInputHandler {

    static int startMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(displayMenuText());
        int selectedOption = scanner.nextInt();
        return selectedOption;
    }

    public static String displayMenuText() {
        return """
                Please choose one of the options:
                1. Enter two dates to print movies released between them.
                2. Print all information about a random movie.
                3. Enter first name and last name of an actor to print movies he played in.
                """;
    }

    static int[] enterDates() {
        int[] dates = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date no 1:");
        dates[0] = scanner.nextInt();
        System.out.println("Please enter date no 2:");
        dates[1] = scanner.nextInt();

        return dates;
    }

    static ArrayList<String> enterActor() {
        ArrayList<String> actorFirstLastName = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        actorFirstLastName.add(firstName);
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        actorFirstLastName.add(lastName);

        return actorFirstLastName;
    }
}
