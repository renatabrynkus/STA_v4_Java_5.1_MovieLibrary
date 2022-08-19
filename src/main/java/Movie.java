import java.util.ArrayList;

public class Movie {

    private String title;
    private int year;
    private Director director;
    private String genre;
    private ArrayList<Actor> actors;

    Movie() {
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "Your movie is: " + title + " from year: " + year +
                ", director: " + director +
                ", genre: " + genre +
                ", actors playing in the movie: " + actors;
    }
}
