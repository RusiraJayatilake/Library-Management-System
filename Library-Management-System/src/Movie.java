public class Movie extends LibraryItems{
    private String director;
    

    public Movie(String type, int id, String title, int year, String director) {
        super(type, id, title, year);
        setDirector(director);
        
    }

    //Getter and setter
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    
}
