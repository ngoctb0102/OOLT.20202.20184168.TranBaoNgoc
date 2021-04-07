package Lab07;
import java.util.*;

public class Book extends Media{
    private ArrayList<String> authors = new ArrayList<String>();
    
    
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
    
}