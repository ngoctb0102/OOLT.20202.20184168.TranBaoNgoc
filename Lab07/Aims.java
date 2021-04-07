package Lab07;

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        int choose;
        Orders o = new Orders();
        Scanner c = new Scanner(System.in);
        do{
            ShowMenu();
            choose = c.nextInt();
            if(choose == 1){
                o = new Orders();
                System.out.println("Orders has been create");
            }
            if(choose == 2){
                TypeMenu();
                int cho = c.nextInt();
                if(cho == 1){
                    System.out.println("Input Title of CD");
                    String title = c.next();
                    System.out.println("Input Category of CD");
                    String category = c.next();
                    System.out.println("Input cost of CD");
                    String Strcost = c.next();
                    float cost = Float.parseFloat(Strcost);
                    System.out.println("Input id of CD");
                    String Strid = c.next();
                    int id = Integer.parseInt(Strid);
                    System.out.println("Input length of CD");
                    String StrLength = c.next();
                    int length = Integer.parseInt(StrLength);
                    System.out.println("Input director of CD");
                    String director = c.next();
                    CompactDics m = new CompactDics(title,category,cost,id,length,director);
                    o.addMedia(m);
                    System.out.println("Input title for track");
                    String TrackTitle = c.next();
                    System.out.println("Input length for track");
                    String le = c.next();
                    int len = Integer.parseInt(le);
                    Track t = new Track(TrackTitle,len);
                    m.addTrack(t);
                    System.out.println("Playing track ?");
                    System.out.println("1. Yes\n2. No");
                    int p = c.nextInt();
                    if(p == 1){
                        m.play();
                    }else{
                        System.out.println("");
                    }
                }
                if(cho == 2){
                    System.out.println("Input Title of DVD");
                    String title = c.next();
                    System.out.println("Input Category of DVD");
                    String category = c.next();
                    System.out.println("Input cost of DVD");
                    String Strcost = c.next();
                    float cost = Float.parseFloat(Strcost);
                    System.out.println("Input id of DVD");
                    String Strid = c.next();
                    int id = Integer.parseInt(Strid);
                    System.out.println("Input length of DVD");
                    String StrLength = c.next();
                    int length = Integer.parseInt(StrLength);
                    System.out.println("Input director of DVD");
                    String director = c.next();
                    DigitalVideoDisc m = new DigitalVideoDisc(title,category,cost,id,length,director);
                    o.addMedia(m);
                }
                if(cho == 3){
                    System.out.println("Input Title of Book");
                    String title = c.next();
                    System.out.println("Input Category of Book");
                    String category = c.next();
                    System.out.println("Input cost of Book");
                    String Strcost = c.next();
                    float cost = Float.parseFloat(Strcost);
                    System.out.println("Input id of Book");
                    String Strid = c.next();
                    int id = Integer.parseInt(Strid);
                    Book m = new Book(title,category,cost,id);
                    o.addMedia(m);
                }
            }
            if(choose == 3){
                System.out.println("Input id to delete");
                int id = c.nextInt();
                for(int i = 0;i < o.getItemsOrdered().size();i++){
                    if(o.getItemsOrdered().get(i).getId() == id){
                        o.removeMedia(o.getItemsOrdered().get(i));
                        System.out.println(id + " has been deleted");
                    }
                }
            }
            if(choose == 4){
                o.PrintOrders();
            }
        }while(choose != 0);
        c.close();
    }
    public static void ShowMenu(){
        System.out.println("Order Management Application");
        System.out.println("----------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display item in the order");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose the number");
    }
    public static void TypeMenu(){
        System.out.println("Choose type of media");
        System.out.println("1. CD");
        System.out.println("2. DVD");
        System.out.println("3. Book");
    }
}
