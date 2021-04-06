package Lab06;
public class DigitalVideoDisc extends Media{
    private String directory;
    private int length;
    public String getDirectory() {
        return directory;
    }
    public void setDirectory(String directory) {
        this.directory = directory;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public DigitalVideoDisc(String title){
        super(title);
    }
    public DigitalVideoDisc(String category, String title){
        super(title,category);
    }
    public DigitalVideoDisc(String directory,String title,String category){
        super(title,category);
        this.directory = directory;
    }
    public DigitalVideoDisc(int length,float cost,String directory,String title,String category){
        super(title,category,cost);
        this.directory = directory;
        this.length = length;
    }
}
