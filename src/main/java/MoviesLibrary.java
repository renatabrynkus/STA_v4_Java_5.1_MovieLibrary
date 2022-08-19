import java.util.ArrayList;
import java.util.Random;

public class MoviesLibrary {

    ArrayList<Movie> movies;

    MoviesLibrary() {
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public int getSize() {
        return movies.size();
    }

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

    ArrayList<String> getMoviesWithActor(ArrayList<String> actorFirstLastName) {
        ArrayList<String> moviesWithActor = new ArrayList<>();
        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (actorFirstLastName.get(0).equalsIgnoreCase(actor.getFirstName()) &&
                        (actorFirstLastName.get(1).equalsIgnoreCase(actor.getLastName()))) {
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
