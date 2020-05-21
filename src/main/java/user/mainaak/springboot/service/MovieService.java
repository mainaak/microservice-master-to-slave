package user.mainaak.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import user.mainaak.springboot.dao.MovieDao;
import user.mainaak.springboot.model.MovieModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieDao movieDao;

    @Autowired
    public MovieService(@Qualifier("postgres") MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public MovieModel insertMovie(MovieModel movieModel) {
        return movieDao.insertMovie(movieModel);
    }

    public List<MovieModel> getAllMovies() {
        return movieDao.getAllMovies();
    }

    public Optional<MovieModel> getMovieById(String movieId) {
        return movieDao.getMovieById(movieId);
    }
}
