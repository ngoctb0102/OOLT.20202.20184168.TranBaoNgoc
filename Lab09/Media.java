package Lab09;

public abstract class Media extends Object{
    private String title ;
    private String category;
    private float cost;
    private int id;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public Media(String title) {
        this.title = title;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public Media(String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    public Media() {
    }
    @Override
    public boolean equals(Object o){
        Media m = (Media)o;
        if(m == null){
            return false;
        }
        if(m.getId() == id){
            return true;
        }else{
            return false;
        }
    }
}
