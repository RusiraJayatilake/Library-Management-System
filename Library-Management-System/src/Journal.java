public class Journal extends LibraryItems {
    private int volume;
    private int number;


    public Journal(String type, int id, String title, int year, int volume, int number) {
        super(type, id, title, year);
        setVolume(volume);
        setNumber(number);
    }

    //Getters and setters
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    
}
