import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryItems {
    private String type;
    private int Id;
    private String title;
    private int year;
    private ArrayList<LibraryItems> arrayList = new ArrayList<LibraryItems>();
    private LibraryItems libraryItems;
    private Book books;
    private Movie movies;
    private Journal journals;

    
    public LibraryItems(){
    }

    public LibraryItems(String type, int id, String title, int year) {
        setType(type);
        setId(id);
        setTitle(title);
        setYear(year);
    }


    //Methods 
    public void DisplyaItems(){
        System.out.println("------ List of all items in the library ------");
        try{
             // pass the path to the file as a parameter
            File file = new File("items.txt");
            Scanner fileScanner = new Scanner(file);
        
            while (fileScanner.hasNextLine()){
                String dataFile = fileScanner.nextLine();
                String[] row = dataFile.split(",");
                String type = row[0];

                if(type.equals("Movie")){
                    String movieType = row[0];
                    Integer movieID = Integer.parseInt(row[1]);
                    String movieTitle = row[2];
                    Integer movieYear = Integer.parseInt(row[3]);
                    String movieDirector = row[4];

                    Movie movie = new Movie(movieType, movieID, movieTitle, movieYear, movieDirector);
                    System.out.println("ID: " + movieID + "\t Type: " + movieType + "\t Title: " + movieTitle);

                    arrayList.add(movie);

                }
                if(type.equals("Book")){
                    String bookType = row[0];
                    Integer bookID = Integer.parseInt(row[1]);
                    String bookTitle = row[2];
                    Integer bookYear = Integer.parseInt(row[3]);
                    String author = row[4];
                    Integer bookPages = Integer.parseInt(row[5]);

                    Book book = new Book(bookType, bookID, bookTitle, bookYear, author, bookPages);
                    System.out.println("ID: " + bookID + "\t Type: " + bookType + "\t Title: " + bookTitle);

                    arrayList.add(book);

                }
                if(type.equals("Journal")){
                    String journalType = row[0];
                    Integer journalID = Integer.parseInt(row[1]);
                    String journalTitle = row[2];
                    Integer journalYear = Integer.parseInt(row[3]);
                    Integer journalVolume = Integer.parseInt(row[4]);
                    Integer journalNumber = Integer.parseInt(row[5]);

                    Journal journal = new Journal(journalType, journalID, journalTitle, journalYear, journalVolume, journalNumber);
                    System.out.println("ID: " + journalID + "\t Type: " + journalType + "\t Title: " + journalTitle);

                    arrayList.add(journal);
                }


            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
       
        
    }

    //Search methods
	//Search by ID method
	public void searchItemById(int input) {
		for(LibraryItems items: arrayList) {
			if(input == items.Id) {
				this.libraryItems = items;
				
				if(items.type.equals("Book")) {
					Book book = (Book) items;
					this.books = book;
				}
				else if(items.type.equals("Movie")) {
					Movie movie = (Movie) items;
                    this.movies = movie;
				}
				else if(items.type.equals("Journal")) {
					Journal journal = (Journal) items;
                    this.journals = journal;
				}
				
				System.out.println("ID: " + items.Id + " Type: " + items.type + " Title: " + items.title);
			}
		}
		
	}
	
	//Search by Title method
	public void searchItemByTitle(String input) {
		for(LibraryItems items: arrayList) {
			if(items.title.contains(input)) {
				System.out.println("ID: " + items.Id + " Type: " + items.type + " Title: " + items.title);
			}
		}
		
	}

    //Method to select the item
    public void printSelectedObject(){
        System.out.println("----- Selected item -----");
		System.out.println("Type: " + libraryItems.type);
		System.out.println("Title: " + libraryItems.title);
		System.out.println("ID: " + libraryItems.Id);
		System.out.println("Year: " + libraryItems.year);
		
		
		if(libraryItems.type.equals("Book")) {
			System.out.println("Author: " + books.getAuthor());
			System.out.println("Number of pages: " + books.getNumberOfPages());
		}
		else if(libraryItems.type.equals("Movie")) {
			System.out.println("Director: " + movies.getDirector());
		}
		else if(libraryItems.type.equals("Journal")) {
			System.out.println("Volume: " + journals.getVolume());
			System.out.println("Number: " + journals.getNumber());
		}
    }


    //Getters and Setters
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
}
