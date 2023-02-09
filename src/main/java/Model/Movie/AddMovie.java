package Model.Movie;

public class AddMovie implements MoviesAbstractFactory{

    private String movieID;
    private String title;
    private String description;
    private String imageLink;
    public AddMovie(String movieID,String title,String description,String imageLink)
    {
        this.movieID=movieID;
        this.title=title;
        this.description=description;
        this.imageLink=imageLink;
    }


    @Override
    public AddMovie manipulateMovies() {
        return new AddMovie(movieID,title,description,imageLink);
    }
}
