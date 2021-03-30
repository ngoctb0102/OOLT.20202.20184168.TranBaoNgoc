public class Aims{
    public static void main(String[] args) {
        // Orders anOrder = new Orders();
        // DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        // dvd1.setCategory("Animation");
        // dvd1.setCost(19.95f);
        // dvd1.setDirectory("Roger Allers");
        // dvd1.setLength(87);
        // anOrder.addDigitalVideoDisc(dvd1);
        

        // DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
        // dvd2.setCategory("Science Fiction");
        // dvd2.setCost(24.95f);
        // dvd2.setDirectory("George Lucas");
        // dvd2.setLength(124);
        // anOrder.addDigitalVideoDisc(dvd2);
        
        
        // DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        // dvd3.setCategory("Animation");
        // dvd3.setCost(18.99f);
        // dvd3.setDirectory("John Musker");
        // dvd3.setLength(90);
        // anOrder.addDigitalVideoDisc(dvd3);
        
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(14, 7.22f,"Ngoc","LOL", "Comedy");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(99, 3.23f, "ABC","aaa","Horror");
        DigitalVideoDisc dvd6 = new DigitalVideoDisc(11, 11.11f,"aae", "aed","Legend");
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(13, 12.22f, "wtf", "aef", "aeea");
        DigitalVideoDisc dvd8 = new DigitalVideoDisc(13, 11.33f, "aawfw", "faw", "fwafwa");
        DigitalVideoDisc dvd9 = new DigitalVideoDisc(44, 44.1f, "faae", "ewawa", "category");
        DigitalVideoDisc dvd10 = new DigitalVideoDisc(21, 21.21f,"aera","Aaf","araewrf");
        DigitalVideoDisc dvd11 = new DigitalVideoDisc(13, 14.22f,"fwa","awer","grv");

        // System.out.print("Total cost is : ");
        // System.out.println(anOrder.totalCost());
        DigitalVideoDisc [] dvdlist = {dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11};
        //UnitTest1(dvdlist);
        //UnitTest2(dvdlist, anOrder);
        //UnitTest3(anOrder, dvd10, dvd11);
       //UnitTest4(dvdlist,anOrder);
        UnitTest4(dvdlist);
    }
    public static void UnitTest1(DigitalVideoDisc [] dvdList){
        Orders o = new Orders(); 
        o.addDigitalVideoDisc(dvdList);
        o.PrintOrders();
        assert (o.getQtyOrdered() != dvdList.length) : "not add enough";
    }
    public static void UnitTest2(DigitalVideoDisc [] dvdList, Orders o){
        o.addDigitalVideoDisc(dvdList);
        o.PrintOrders();
        assert (o.getQtyOrdered() == 9) : "disc add wrong";
    }
    public static void UnitTest3(Orders o, DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        o.addDigitalVideoDisc(dvd1,dvd2);
        assert (o.getQtyOrdered() == 9) : "dics still added";
    }
    public static void UnitTest4(DigitalVideoDisc [] dvdList){
        Orders o =new Orders();
        for(int i=0;i<dvdList.length;i++){
            o.addDigitalVideoDisc(dvdList[i]);
        }
    }
}