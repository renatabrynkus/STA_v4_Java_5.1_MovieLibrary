import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        int selectedOption = UserInputHandler.startMenu();

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            MoviesLibrary moviesLibrary = objectMapper.readValue(new File("src/main/resources/MoviesLibrary.json"),
                    MoviesLibrary.class);

            switch (selectedOption) {
                case 1 -> System.out.println(moviesLibrary.getMoviesBetweenDates(UserInputHandler.enterDates()));
                case 2 -> System.out.println(moviesLibrary.getInformationAboutRandomMovie(moviesLibrary.getSize()));
                case 3 -> System.out.println(moviesLibrary.getMoviesWithActor(UserInputHandler.enterActor()));
                default -> System.exit(0);
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
