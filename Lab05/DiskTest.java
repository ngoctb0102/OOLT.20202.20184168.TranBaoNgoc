public class DiskTest {
    public static void main(String[] args) {
        Orders o = new Orders();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(14, 7.22f,"Ngoc","LOL", "Comedy");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(99, 3.23f, "ABC","HaRry11","Horror");
        DigitalVideoDisc dvd6 = new DigitalVideoDisc(11, 11.11f,"aae", "12 potTer","Legend");
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(13, 12.22f, "wtf", "aef Harry potter", "aeea");
        DigitalVideoDisc dvd8 = new DigitalVideoDisc(13, 11.33f, "aawfw", "faw", "fwafwa");
        DigitalVideoDisc dvd9 = new DigitalVideoDisc(44, 44.1f, "faae", "ewawa", "category");
        DigitalVideoDisc dvd10 = new DigitalVideoDisc(21, 21.21f,"aera","Aaf","araewrf");
        DigitalVideoDisc dvd11 = new DigitalVideoDisc(13, 14.22f,"fwa","awer","grv");
        DigitalVideoDisc [] dvdlist = {dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10, dvd11};
        o.addDigitalVideoDisc(dvdlist);
        for(int i = 0;i < dvdlist.length;i++){
            test1(dvdlist[i]);
        }
        test2(o);
    }
    public static void test1(DigitalVideoDisc dics){   
        boolean b = dics.search();
        if(b == true){
            System.out.println("have harry or potter on title");
        }else{
            System.out.println("not have harry or potter on title");
        }
    }
    public static void test2(Orders s){
        DigitalVideoDisc d = s.getALuckyItem();
        System.out.println(d.getTitle());
        System.out.println("Total cost is " + s.totalCost());
        assert (s.totalCost() < 124.64f) :"No dics have been free";
    }
}
