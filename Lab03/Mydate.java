import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Mydate {
    private static final int MIN_YEAR  = 1;
    private static final int MAX_YEAR  = 9999;

    private static final int MIN_MONTH = 1;  
    private static final int MAX_MONTH = 12; 

    private int year;
    private int month;
    private int day;

    Scanner sc = new Scanner(System.in);

    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    Date date = calendar.getTime();

    private String[] strMonths    = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"
                                    ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private static final int[] daysInMonths            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getMonthLastDay(int year, int month) {
        return daysInMonths[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
    }

    public static boolean isValidDate(int year, int month, int day) {
        return (MIN_YEAR  <= year   && year  <= MAX_YEAR)
            && (MIN_MONTH <= month  && month <= MAX_MONTH)
            && (1         <= day    && day   <= getMonthLastDay(year, month));
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month < MIN_MONTH || month > MAX_MONTH) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (1 > day || day > getMonthLastDay(this.year, this.month)) {
            System.out.println("Invalid day!");
        }
        this.day = day;
    }

    public Mydate(){
        super();
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public Mydate(int year, int month, int day){
        if (! isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public Mydate(String date){
        String[] part = date.split("-");
        int days = Integer.parseInt(part[0]);
        int months = Integer.parseInt(part[1]);
        int years = Integer.parseInt(part[2]);
        if (! isValidDate(years, months, days)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year  = years;
        this.month = months;
        this.day   = days;
    }

    public void accept(){
        System.out.println("Enter the date (dd-mm-yyyy) :");
        String date = sc.nextLine();
        String[] part = date.split("-");
        int days = Integer.parseInt(part[0]);
        int months = Integer.parseInt(part[1]);
        int years = Integer.parseInt(part[2]);
        if (! isValidDate(years, months, days)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        year  = years;
        month = months;
        day   = days;
    }

    public void print(){
        System.out.print("Current Date is : ");
        System.out.println(day+"-"+strMonths[month - 1]+"-"+year);
    }


}
