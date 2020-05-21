package user.mainaak.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.mainaak.springboot.model.MovieModel;
import user.mainaak.springboot.service.MovieService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieModel> getMovieInfo() {
        return movieService.getAllMovies();
    }

    @GetMapping(path = "/{movieId}")
    public Optional<MovieModel> getMovieById(@PathVariable("movieId") String movieId) {
        return movieService.getMovieById(movieId);
    }

    @PostMapping
    public MovieModel insertMovie(@RequestBody MovieModel movieModel) {
        return movieService.insertMovie(movieModel);
    }
}
