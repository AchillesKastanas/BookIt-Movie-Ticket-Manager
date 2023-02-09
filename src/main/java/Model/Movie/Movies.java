package Model.Movie;

public abstract class Movies {
    public abstract String getMovieID();
    public abstract String getTitle();
    public abstract String getDescription();
    public abstract String getImageLink();


    public String toString(){
        String finalString = "{\"movieID\":\"" + this.getMovieID() + "\",\"title\":\"" + this.getTitle() + "\",\"description\":\" "+ this.getDescription() + "\",\"imageLink\":\"" + this.getImageLink() + "\"}";
        return finalString;
    }
}
