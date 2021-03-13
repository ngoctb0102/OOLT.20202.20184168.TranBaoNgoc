public class DateTest {
    public static void main(String[] args) {
        Mydate d = new Mydate();
        d.print(); //print current date
        d.setDay(13);
        d.setMonth(10);
        d.setYear(2021);
        d.print(); // print input day
        d.accept();
        d.print(); // print input date by string
    }
}
