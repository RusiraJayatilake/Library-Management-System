public class Book extends LibraryItems {
    private String author;
    private int numberOfPages;

   
    public Book(String type, int id, String title, int year, String author, int numberPages) {
        super(type, id, title, year);
        setAuthor(author);
        setNumberOfPages(numberPages);
        
    }

    //Getters and setters
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
}
