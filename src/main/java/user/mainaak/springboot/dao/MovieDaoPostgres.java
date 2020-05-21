package user.mainaak.springboot.dao;

import org.springframework.stereotype.Repository;
import user.mainaak.springboot.model.MovieModel;

import java.util.*;

@Repository("postgres")
public class MovieDaoPostgres implements MovieDao {
    private final List<MovieModel> fakeDataList = new LinkedList<>();


    @Override
    public MovieModel insertMovie(MovieModel movieModel) {
        fakeDataList.add(movieModel);
        return fakeDataList.get(fakeDataList.size() - 1);
    }

    @Override
    public List<MovieModel> getAllMovies() {
        return fakeDataList;
    }

    @Override
    public Optional<MovieModel> getMovieById(String movieId) {
        return fakeDataList.stream().
                filter(movieModel -> movieModel.getMovieId().equals(movieId)).findFirst();
    }
}
