package Model.Movie;

public class MoviesRegister extends Movies{

    private final String movieID;
    private final String title;
    private final String description;
    private final String imageLink;

    public MoviesRegister(String movieID,String title,String description,String imageLink)
    {
        this.movieID=movieID;
        this.title=title;
        this.description=description;
        this.imageLink=imageLink;
    }

    @Override
    public String getMovieID() {
        return movieID;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getImageLink() {
        return imageLink;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
