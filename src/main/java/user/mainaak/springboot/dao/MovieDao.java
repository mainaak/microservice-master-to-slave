package user.mainaak.springboot.dao;

import user.mainaak.springboot.model.MovieModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MovieDao {

    MovieModel insertMovie(MovieModel movieModel);

    List<MovieModel> getAllMovies();

    Optional<MovieModel> getMovieById(String movieId);

}
