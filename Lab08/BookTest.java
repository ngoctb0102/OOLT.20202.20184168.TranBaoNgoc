package Lab08;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("Game", "Horror", 1.5f,1,"I am iron man i man man");
        b.processContent();
        System.out.println(b.toString()); 
    }
    
}
