package Lab09;
//import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

//import jdk.internal.platform.Container;

import java.awt.event.*;
public class Aims extends JFrame{
    JLabel statusLabel = new JLabel();
    JTextPane statusText = new JTextPane();
    Orders o = new Orders();
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Aims();
            }
        });
    }
    // public static void main(String[] args) {
    //     int choose;
    //     Orders o = new Orders();
    //     Scanner c = new Scanner(System.in);
    //     do{
    //         ShowMenu();
    //         choose = c.nextInt();
    //         if(choose == 1){
    //             o = new Orders();
    //             System.out.println("Orders has been create");
    //         }
    //         if(choose == 2){
    //             TypeMenu();
    //             int cho = c.nextInt();
    //             if(cho == 1){
    //                 System.out.println("Input Title of CD");
    //                 String title = c.next();
    //                 System.out.println("Input Category of CD");
    //                 String category = c.next();
    //                 System.out.println("Input cost of CD");
    //                 String Strcost = c.next();
    //                 float cost = Float.parseFloat(Strcost);
    //                 System.out.println("Input id of CD");
    //                 String Strid = c.next();
    //                 int id = Integer.parseInt(Strid);
    //                 System.out.println("Input length of CD");
    //                 String StrLength = c.next();
    //                 int length = Integer.parseInt(StrLength);
    //                 System.out.println("Input director of CD");
    //                 String director = c.next();
    //                 CompactDics m = new CompactDics(title,category,cost,id,length,director);
    //                 o.addMedia(m);
    //                 System.out.println("Input title for track");
    //                 String TrackTitle = c.next();
    //                 System.out.println("Input length for track");
    //                 String le = c.next();
    //                 int len = Integer.parseInt(le);
    //                 Track t = new Track(TrackTitle,len);
    //                 m.addTrack(t);
    //                 System.out.println("Playing track ?");
    //                 System.out.println("1. Yes\n2. No");
    //                 int p = c.nextInt();
    //                 if(p == 1){
    //                     m.play();
    //                 }else{
    //                     System.out.println("");
    //                 }
    //             }
    //             if(cho == 2){
    //                 System.out.println("Input Title of DVD");
    //                 String title = c.next();
    //                 System.out.println("Input Category of DVD");
    //                 String category = c.next();
    //                 System.out.println("Input cost of DVD");
    //                 String Strcost = c.next();
    //                 float cost = Float.parseFloat(Strcost);
    //                 System.out.println("Input id of DVD");
    //                 String Strid = c.next();
    //                 int id = Integer.parseInt(Strid);
    //                 System.out.println("Input length of DVD");
    //                 String StrLength = c.next();
    //                 int length = Integer.parseInt(StrLength);
    //                 System.out.println("Input director of DVD");
    //                 String director = c.next();
    //                 DigitalVideoDisc m = new DigitalVideoDisc(title,category,cost,id,length,director);
    //                 o.addMedia(m);
    //             }
    //             if(cho == 3){
    //                 System.out.println("Input Title of Book");
    //                 String title = c.next();
    //                 System.out.println("Input Category of Book");
    //                 String category = c.next();
    //                 System.out.println("Input cost of Book");
    //                 String Strcost = c.next();
    //                 float cost = Float.parseFloat(Strcost);
    //                 System.out.println("Input id of Book");
    //                 String Strid = c.next();
    //                 int id = Integer.parseInt(Strid);
    //                 Book m = new Book(title,category,cost,id);
    //                 o.addMedia(m);
    //             }
    //         }
    //         if(choose == 3){
    //             System.out.println("Input id to delete");
    //             int id = c.nextInt();
    //             for(int i = 0;i < o.getItemsOrdered().size();i++){
    //                 if(o.getItemsOrdered().get(i).getId() == id){
    //                     o.removeMedia(o.getItemsOrdered().get(i));
    //                     System.out.println(id + " has been deleted");
    //                 }
    //             }
    //         }
    //         if(choose == 4){
    //             o.PrintOrders();
    //         }
    //     }while(choose != 0);
    //     c.close();
    // }
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
    public Aims(){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout()); 
        //Create Menu
        JMenuBar jmenu = new JMenuBar();
        JMenu m1 = new JMenu("Create new order");
        JMenu m2 = new JMenu("Add item to order");
        JMenu m3 = new JMenu("Delete item by id");
        JMenu m4 = new JMenu("Display item in the order");
        //creat new order
        JMenuItem create = new JMenuItem("Create");
        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                o = new Orders();
                statusLabel.setText("Order has been created");
            }
        });
        //add a cd
        JMenuItem cd = new JMenuItem("Add CD");
        
        JMenuItem dvd = new JMenuItem("Add DVD");
        JMenuItem book = new JMenuItem("Add Book");
        JMenuItem del = new JMenuItem("Delete a media");
        //play media
        JMenuItem play = new JMenuItem("Play");
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                statusText.setText(o.PrintOrders());
            }
        });
        m3.add(del);
        m4.add(play);
        m2.add(cd);
        m2.add(dvd);
        m2.add(book);
        m1.add(create);
        jmenu.add(m1);
        jmenu.add(m2);
        jmenu.add(m3);
        jmenu.add(m4);
        cp.add(jmenu);
        cp.add(statusLabel);
        cp.add(statusText);
        cd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JLabel title = new JLabel();
                title.setText("Input Title of CD");
                JTextArea t = new JTextArea("title");
                cp.add(title);
                cp.add(t);
                JLabel category = new JLabel("Input Category of CD: ");
                category.setText("Input Category of CD");
                JTextArea c = new JTextArea("category");
                cp.add(category);
                cp.add(c);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Aims");
        setSize(500,500);
        setVisible(true);
    }
   
}
