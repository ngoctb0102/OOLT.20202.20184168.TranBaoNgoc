package Lab08;
import java.util.*;

public class Book extends Media implements Comparable{
    private ArrayList<String> authors = new ArrayList<String>();
    String content;
    List<String> contentTokens;
    Map<String,Integer> wordFrequency;
    public void processContent(){
        String []s = content.split(" ");
        for(int i = 0;i < s.length ; i++){
            contentTokens.add(s[i]);
        }
        java.util.Collections.sort(contentTokens);
        // Collections.frequency(c, o)
        for(int i = 0;i < contentTokens.size();i++){
            wordFrequency.put(contentTokens.get(i),Collections.frequency(contentTokens, contentTokens.get(i)));
        }
    }
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    public void addAuthor(String AuthorName){
        if(! authors.contains(AuthorName)){
            authors.add(AuthorName);
            System.out.println(AuthorName + "has been added");
        }else{
            System.out.println(AuthorName + "already have in list");
        }
    }
    public void removeAuthor(String AuthorName){
        if(authors.size() < 1){
            System.out.println("Dick list is empty");
        }else{
            if(authors.contains(AuthorName)){
                authors.remove(AuthorName);
                System.out.println(AuthorName + "has been remove");
            }else{
                System.out.println(AuthorName + "not have in list");
            }
        }
    }

    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }
    public Book(String title, String category, float cost, int id) {
        super(title, category, cost, id);
    }
    
    public Book(String title, String category, float cost, int id, String content) {
        super(title, category, cost, id);
        this.content = content;
    }
    public int compareTo(Object obj){
        Book t = (Book)obj;
        if(t == null){
            return 0;
        }else{
            if(t.getId() > this.getId()){
                return -1;
            }else if(t.getId() == this.getId()){
                return 0;
            }else{
                return 1;
            }
        }
    }
    @Override
    public String toString(){
        String s = "";
        s = s + this.getId() + this.getTitle() + this.getCategory() + this.getCost() + this.content;
        Set set = wordFrequency.keySet();
        for (Object key : set) {
            s = s + "\n" + key + " " + wordFrequency.get(key);
        }
        s = s + "\n" + contentTokens.size();
        return s;
    }
}