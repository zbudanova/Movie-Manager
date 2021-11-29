package ru.netology.manager;

import ru.netology.domain.MoviePoster;

public class MovieManager {
    private int limit;
    private MoviePoster[] items = new MoviePoster[0];

    public MovieManager(int limit) {
        this.limit = limit;
    }
    public MovieManager() {
        this.limit = 10;
    }
    public void add(MoviePoster item) {
        int length = items.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public MoviePoster[] getLastTen() {
        int resultLength;
        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        MoviePoster[] result = new MoviePoster[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}