package user.mainaak.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

public class MovieModel {

    @JsonProperty("movieId")
    private final String movieId;

    @JsonProperty("name")
    private final String name;

    public MovieModel(@NotNull String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }
}
