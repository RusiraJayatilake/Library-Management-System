import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryItems libraryitems = new LibraryItems();
        libraryitems.DisplyaItems();
        Scanner userInput = new Scanner(System.in);
        while(true){
            System.out.println("\ntEnter 'q' to exit\nEnter 'i' to search by id\nEnter 't' to seach by title");
            System.out.print("Enter your choice: ");
            char choice = userInput.next().charAt(0);

            switch(choice){
                case 'q':
                    System.exit(0);
                    break;
                case 'i':
                    System.out.print("\nEnter the id to search what you want: ");
                    int searchId = userInput.nextInt();
                    libraryitems.searchItemById(searchId);
                    
                    System.out.print("\nEnter the 's' to select the item: ");
                    char selectItemId = userInput.next().charAt(0);
                    if(selectItemId == 's'){
                        libraryitems.printSelectedObject();
                    }
                    else{
                        System.out.println("Your command is wrong!");
                    }
                    break;
                case 't':
                    System.out.print("\nEnter the title to search what you want: ");
                    String searchTitle = userInput.next();
                    libraryitems.searchItemByTitle(searchTitle);

                    // System.out.print("\nEnter the 's' to select the item: ");
                    // char selectItemTitle = userInput.next().charAt(0);
                    // if(selectItemTitle == 's'){
                    //     libraryitems.printSelectedObject();
                    // }
                    // else{
                    //     System.out.println("Your command is wrong!");
                    // }
                    break;
                
                default:
                        System.out.println("Wrong Command!!");
                        break;
            }
            

        }
        
       
    }

} 