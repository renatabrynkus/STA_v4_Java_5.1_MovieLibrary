import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MoviesLibrary {

    ArrayList<Movie> movies;

    MoviesLibrary() {
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public int getSize() { return movies.size(); }

    ArrayList<String> getMoviesBetweenDates(int[] dates) {
        ArrayList<String> moviesBetweenDates = new ArrayList<>();
        for (Movie movie : movies) {
            if ((movie.getYear() >= dates[0]) && (movie.getYear() <= dates[1])) {
                moviesBetweenDates.add(movie.getTitle());
            }
        }
        return moviesBetweenDates;
    }

    Movie getInformationAboutRandomMovie(int bound) {
        return movies.get(new Random().nextInt(bound));
    }

    ArrayList<String> getMoviesWithActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();

        ArrayList<String> moviesWithActor = new ArrayList<>();
        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (firstName.equalsIgnoreCase(actor.getFirstName()) && (lastName.equalsIgnoreCase(actor.getLastName()))) {
                    moviesWithActor.add(movie.getTitle());
                }
            }
        }
        if (moviesWithActor.size() == 0) {
            System.out.println("Sorry, there are no movies with this actor in our library");
        }
        return moviesWithActor;
    }

    @Override
    public String toString() {
        return "Your movies are:\n" + movies;
    }
}
