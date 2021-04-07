package Lab07;
public class DigitalVideoDisc extends Dics implements Playable{

    public DigitalVideoDisc(String title, String category, float cost, int id, int length, String director) {
        super(title, category, cost, id, length, director);
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
