public class DateTest {
    public static void main(String[] args) {
        // Mydate d = new Mydate();
        // d.print(); //print current date
        // d.setDay(13);
        // d.setMonth(10);
        // d.setYear(2021);
        // d.print(); // print input day
        // d.accept();
        // d.print(); // print input date by string
         // print
         //Unit1();
        // Unit2();
        //Unit3();
        Mydate d1 = new Mydate("13-2-2000");
        Mydate d2 = new Mydate("15-3-2000");
        Mydate d3 = new Mydate("31-3-2000");
        Mydate d4 = new Mydate("13-4-1999");
        Mydate [] DayList = {d2,d4,d1,d3};
        Unit4(DayList);
    }
    public static void Unit1(){
        Mydate q = new Mydate("ninth", "May", "nineteen ninety-nine");
        q.print();
        q.printForm();
        assert (q.getDay() == 9 && q.getMonth() == 5 && q.getYear() == 1999) : "Wrong date";
    }
    public static void Unit2(){
        Mydate q = new Mydate("ninth", "May", "twenty hundred");
        q.print();
        //q.printForm();
        assert (q.getDay() == 9 && q.getMonth() == 5 && q.getYear() == 2000) : "Wrong date";
    }
    public static void Unit3(){
        Mydate q = new Mydate();
        Mydate p = new Mydate("ninth", "May", "twenty hundred");
        Mydate r = new Mydate();
        Mydate s = new Mydate(2022,12,1);
        DateUtils d = new DateUtils(); 
        System.out.println(d.compare(q,p));
        System.out.println(d.compare(q,r));
        System.out.println(d.compare(q,s));
        assert (d.compare(q,p) == 1): "Wrong compare";
        assert (d.compare(q,r) == 0): "Wrong compare";
        assert (d.compare(q,s) == -1): "Wrong compare";
    }
    public static void Unit4(Mydate [] dlist){
        DateUtils d = new DateUtils();
        System.out.println("Day list sorted decrease");
        d.SortDay(dlist, 1);
        System.out.println("");
        System.out.println("Day list sorted increase");
        d.SortDay(dlist, 0);
    }
}
