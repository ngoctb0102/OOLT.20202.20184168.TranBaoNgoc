package Lab09;

public class Track extends Object implements Comparable {
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public Track() {
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object o){
        Track t = (Track) o;
        if(t == null){
            return false;
        }
        if(t.getTitle().equals(title) == true && t.getLength() == length){
            return true;
        }else{
            return false;
        }
    }
    public int compareTo(Object obj){
        Track t = (Track)obj;
        if(t == null){
            return 0;
        }else{
            if(t.getLength() > length){
                return -1;
            }else if(t.getLength() == length){
                return 0;
            }else{
                return 1;
            }
        }
    }
}
