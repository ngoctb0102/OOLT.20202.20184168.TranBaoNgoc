package Lab07;

public class Dics extends Media{
    private int length;
    private String director;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Dics(String title, String category, float cost, int id, int length, String director) {
        super(title, category, cost, id);
        this.length = length;
        this.director = director;
    }
}
