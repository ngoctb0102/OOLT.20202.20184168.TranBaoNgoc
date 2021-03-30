public class DigitalVideoDisc {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
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
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    } 
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title){
        super();
        this.title = title;
        this.category = category;
    }
    public DigitalVideoDisc(String directory,String title,String category){
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
    }
    public DigitalVideoDisc(int length,float cost,String directory,String title,String category){
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.cost = cost;
        this.length = length;
    }
    public boolean search(){
        String temp = title.toLowerCase();
        if(temp.contains("harry") == true || temp.contains("potter") == true){
            return true;
        }else{
            return false;
        }
    }
}
