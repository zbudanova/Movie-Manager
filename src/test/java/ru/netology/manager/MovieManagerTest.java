package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    private  MovieManager movieManager = new MovieManager();
    private MoviePoster theFather = new MoviePoster(1,"theFather","drama","1.img");
    private MoviePoster intern = new MoviePoster(2,"intern","comedy","2.img");
    private MoviePoster theHoliday = new MoviePoster(3,"theHoliday","comedy","3.img");

    @BeforeEach
    public void setUp() {
        movieManager.add(theFather);
        movieManager.add(intern);
        movieManager.add(theHoliday);
    }


    @Test
    public void shouldGetOneMovie() {
        MovieManager movieManager = new MovieManager();
        MoviePoster theFather = new MoviePoster(1, "The father", "drama", "1.img");
        movieManager.add(theFather);

        MoviePoster[] actual = movieManager.getLastTen();
        MoviePoster[] expected = new MoviePoster[]{theFather};

        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldGetFiveLastMovie() {
        MovieManager movieManager = new MovieManager();
        MoviePoster theFather = new MoviePoster(1,"theFather","drama","1.img");
        MoviePoster intern = new MoviePoster(2,"intern","comedy","2.img");
        MoviePoster theHoliday = new MoviePoster(3,"theHoliday","comedy","3.img");
        MoviePoster spiderMan = new MoviePoster(4,"spiderMan","fantasy","4.img");
        MoviePoster interstellar = new MoviePoster(5,"interstellar","fantasy","5.img");
        movieManager.add(theFather);
        movieManager.add(intern);
        movieManager.add(theHoliday);
        movieManager.add(spiderMan);
        movieManager.add(interstellar);

        MoviePoster[] actual = movieManager.getLastTen();
        MoviePoster[] expected = new MoviePoster[]{interstellar, spiderMan, theHoliday, intern, theFather};

        assertArrayEquals(expected,actual);

    }
    @Test
    public void shouldGetTenLastMovie() {
        MovieManager movieManager = new MovieManager();
        MoviePoster theFather = new MoviePoster(1,"theFather","drama","1.img");
        MoviePoster intern = new MoviePoster(2,"intern","comedy","2.img");
        MoviePoster theHoliday = new MoviePoster(3,"theHoliday","comedy","3.img");
        MoviePoster spiderMan = new MoviePoster(4,"spiderMan","fantasy","4.img");
        MoviePoster interstellar = new MoviePoster(5,"interstellar","fantasy","5.img");
        MoviePoster focus = new MoviePoster(6,"focus","comedy","6.img");
        MoviePoster oneDay = new MoviePoster(7,"oneDay","drama","7.img");
        MoviePoster theNotebook = new MoviePoster(8,"theNotebook","drama","8.img");
        MoviePoster after = new MoviePoster(9,"ninth","drama","9.img");
        MoviePoster theProposal = new MoviePoster(10,"theProposal","comedy","10.img");
        movieManager.add(theFather);
        movieManager.add(intern);
        movieManager.add(theHoliday);
        movieManager.add(spiderMan);
        movieManager.add(interstellar);
        movieManager.add(focus);
        movieManager.add(oneDay);
        movieManager.add(theNotebook);
        movieManager.add(after);
        movieManager.add(theProposal);

        MoviePoster[] actual = movieManager.getLastTen();
        MoviePoster[] expected = new MoviePoster[]{theProposal, after, theNotebook, oneDay, focus, interstellar, spiderMan, theHoliday, intern, theFather};

        assertArrayEquals(expected,actual);

    }
    @Test
    public void shouldGetTenLastMovieThenOverLimit() {
        MovieManager movieManager = new MovieManager();
        MoviePoster theFather = new MoviePoster(1,"theFather","drama","1.img");
        MoviePoster intern = new MoviePoster(2,"intern","comedy","2.img");
        MoviePoster theHoliday = new MoviePoster(3,"theHoliday","comedy","3.img");
        MoviePoster spiderMan = new MoviePoster(4,"spiderMan","fantasy","4.img");
        MoviePoster interstellar = new MoviePoster(5,"interstellar","fantasy","5.img");
        MoviePoster focus = new MoviePoster(6,"focus","comedy","6.img");
        MoviePoster oneDay = new MoviePoster(7,"oneDay","drama","7.img");
        MoviePoster theNotebook = new MoviePoster(8,"theNotebook","drama","8.img");
        MoviePoster after = new MoviePoster(9,"ninth","drama","9.img");
        MoviePoster theProposal = new MoviePoster(10,"theProposal","comedy","10.img");
        MoviePoster ironMan = new MoviePoster(11, "ironMan", "fantasy", "11.img");
        movieManager.add(theFather);
        movieManager.add(intern);
        movieManager.add(theHoliday);
        movieManager.add(spiderMan);
        movieManager.add(interstellar);
        movieManager.add(focus);
        movieManager.add(oneDay);
        movieManager.add(theNotebook);
        movieManager.add(after);
        movieManager.add(theProposal);
        movieManager.add(ironMan);


        MoviePoster[] actual = movieManager.getLastTen();
        MoviePoster[] expected = new MoviePoster[]{ironMan, theProposal, after, theNotebook, oneDay, focus, interstellar, spiderMan, theHoliday, intern};

        assertArrayEquals(expected, actual);
    }
}
