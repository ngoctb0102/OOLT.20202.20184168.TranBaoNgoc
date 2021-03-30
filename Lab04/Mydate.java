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

    private String[] strMonths    = {"January", "February", "March", "April", "May", "June"
                                    ,"July", "August", "September", "October", "November", "December"};
    private String[] strMonth     = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"
                                    ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] strNum       = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                                    "13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"
                                    ,"28","29","30","31"};
    private String[] strDay       = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", 
                                    "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", 
                                    "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", 
                                    "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third", 
                                    "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", 
                                    "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"};
    private String[] strDayPrefix = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
    private String[] strNumber    = {"one", "two", "three", "four", "five", "six", "seven", "eight", 
                                    "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
                                    "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", 
                                    "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", 
                                    "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", 
                                    "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", 
                                    "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one", 
                                    "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", 
                                    "forty-seven", "forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", 
                                    "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", 
                                    "fifty-eight", "fifty-nine", "sixty", "sixty-one", "sixty-two", "sixty-three", 
                                    "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight", 
                                    "sixty-nine", "seventy", "seventy-one", "seventy-two", "seventy-three", 
                                    "seventy-four", "seventy-five", "seventy-six", "seventy-seven", "seventy-eight", 
                                    "eventy-nine", "eighty", "eighty-one", "eighty-two", "eighty-three", "eighty-four",
                                    "eighty-five", "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety", 
                                    "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six", 
                                    "ninety-seven", "ninety-eight", "ninety-nine"};

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
    public Mydate(String day, String month, String year){
        int countd = 0;
        int countm = 0;
        int county1 = 0;
        int county2 = 0;
        int iy1,iy2,iday,imonth,iyear;
        iy1 = iy2 = iday = imonth = iyear = 0;
        for(int i = 0;i<31;i++){
            if(day.compareTo(strDay[i]) == 0){
                iday = i+1;
                countd = countd + 1;
            }
        }
        if(countd == 0){
            throw new IllegalArgumentException("Invalid day!");
        }
        for(int i = 0;i<12;i++){
            if(month.compareTo(strMonths[i]) == 0){
                imonth = i+1;
                countm = countm+1;
            }
        }
        if(countm == 0){
            throw new IllegalArgumentException("Invalid month!");
        }
        String[] yPart = year.split(" ");
        for(int i =0;i<99;i++){
            if(yPart[0].compareTo(strNumber[i]) == 0){
                iy1 = i+1;
                county1 = county1 + 1;
            }
        }
        if(county1 == 0){
            throw new IllegalArgumentException("Invalid year!");
        }
        if(yPart[1].compareTo("hundred") == 0){
            iyear = iy1 * 100;
        }else{
            for(int i =0;i<99;i++){
                if(yPart[1].compareTo(strNumber[i]) == 0){
                    iy2 = i+1;
                    county2 = county2 + 1;
                }
            }
            if(county2 == 0){
                throw new IllegalArgumentException("Invalid year!");
            }
        }
        iyear = iy1 * 100 + iy2;
        if (! isValidDate(iyear, imonth, iday)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.day = iday;
        this.month = imonth;
        this.year = iyear;
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
        int d;
        d = day % 10;
        System.out.println(strMonths[month - 1]+" " + day + strDayPrefix[d] + " " + year);
    }
    public void printForm(){
        System.out.println("Please choose your form !");
        System.out.println("1. yyyy-MM-dd\n2. d/M/yyyy\n3. dd-MMM-yyyy\n4. MMM d yyyy\n5. mm-dd-yyyy");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println(year + "-" + strNum[month -1]+ "-" + strNum[day-1]);
        }
        if(choice == 2){
            System.out.println(day + "/" + month+ "/" + year);
        }
        if(choice == 3){
            System.out.println(strNum[day- 1] + "-" + strMonth[month -1]+"-" + year);
        } 
        if(choice == 4){
            System.out.println(strMonth[month - 1] + " " + day + " " + year);
        }
        if(choice == 5){
            System.out.println(strNum[month - 1] + "-" + strNum[day - 1] + "-" + year);
        }
        sc.close();
    }

}
