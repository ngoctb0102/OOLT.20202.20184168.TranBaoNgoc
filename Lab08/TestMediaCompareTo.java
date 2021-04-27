package Lab08;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        Orders o = new Orders();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("LOL", "Comedy", 7.22f,1,14,"Ngoc");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("harry11","Horror", 3.23f,2,99, "ABC");
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("12 potter","Legend", 11.11f,3,11,"aae");
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("aef harry potter", "aeea", 12.22f,4,21, "wtf" );
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("faw", "fwafwa", 11.33f,5,12,"aawfw");
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("ewawa", "category", 44.1f,6,23,"faae");
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Aaf","araewrf",21.21f,8,23,"aera");
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("awer","grv", 14.22f,9,22,"fwa");
        java.util.Collection c = new java.util.ArrayList();
        c.add(dvd4);
        c.add(dvd5);
        c.add(dvd6);
        c.add(dvd7);
        c.add(dvd8);
        c.add(dvd9);
        c.add(dvd10);
        c.add(dvd11);
        java.util.Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            o.addMedia(((DigitalVideoDisc)iterator.next()));
        }
        System.out.println("---------------------------------------------");
        System.out.println("The DVDs current in order are :");
        // while(iterator.hasNext()){
        //     // System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        // }
        o.PrintOrders();
        java.util.Collections.sort((java.util.List)c);
        iterator = c.iterator();
        System.out.println("---------------------------------------------");
        System.out.println("The DVDs is srorted order are :");
        while(iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }
        System.out.println("---------------------------------------------");
    }
}
