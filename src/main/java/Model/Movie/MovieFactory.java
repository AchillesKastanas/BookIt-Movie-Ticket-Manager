package Model.Movie;

public class MovieFactory {
    public static AddMovie getMovies(MoviesAbstractFactory prod)
    {
        return prod.manipulateMovies();
    }
}
