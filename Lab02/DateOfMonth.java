import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// Prompt user to enter the month an year
		
        int month = 0;
        do{
            System.out.print("Enter the month: ");
		    String strMonth = input.next();
            if(strMonth.compareTo("January") == 0 || strMonth.compareTo("Jan.")==0|| strMonth.compareTo("1")==0 || strMonth.compareTo("Jan")==0){
                month = 1;
            }
            if(strMonth.compareTo("February")==0 || strMonth.compareTo("Feb.")==0 || strMonth.compareTo("2")==0 || strMonth.compareTo("Feb")==0){
                month = 2;
            }
            if(strMonth.compareTo("March") == 0 || strMonth.compareTo("Mar.")==0 || strMonth.compareTo("3")==0 || strMonth.compareTo("Mar")==0){
                month = 3;
            }
            if(strMonth.compareTo("April")== 0 || strMonth.compareTo("Apr.")==0 || strMonth.compareTo("4")==0 || strMonth.compareTo("Apr")==0){
                month = 4;
            }
            if(strMonth.compareTo("May") == 0 || strMonth.compareTo("5")==0 || strMonth.compareTo("May")==0){
                month = 5;
            }
            if(strMonth.compareTo("June") == 0 ||  strMonth.compareTo("6")==0 || strMonth.compareTo("Jun")==0){
                month = 6;
            }
            if(strMonth.compareTo("July") == 0 ||  strMonth.compareTo("7")==0 || strMonth.compareTo("Jul")==0){
                month = 7;
            }
            if(strMonth.compareTo("August") == 0 || strMonth.compareTo("Aug.")==0 || strMonth.compareTo("8")==0 || strMonth.compareTo("Aug")==0){
                month = 8;
            }
            if(strMonth.compareTo("September") == 0 || strMonth.compareTo("Sept.")==0 || strMonth.compareTo("9")==0 || strMonth.compareTo("Sep")==0){
                month = 9;
            }
            if(strMonth.compareTo("October") == 0 || strMonth.compareTo("Oct.")==0 || strMonth.compareTo("10")==0 || strMonth.compareTo("Oct")==0){
                month = 10;
            }
            if(strMonth.compareTo("November") == 0 || strMonth.compareTo("Nov.")==0 || strMonth.compareTo("11")==0 || strMonth.compareTo("Nov")==0){
                month = 11;
            }
            if(strMonth.compareTo("December") == 0 || strMonth.compareTo("Dec.")==0 || strMonth.compareTo("12")==0 || strMonth.compareTo("Dec")==0){
                month = 12;
            }
            if(month == 0){
                System.out.println("Invalid value! Try again");
            }
        }while(month == 0);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		switch (month)
		{
			case 1: System.out.println(
					 "January " + year + " had 31 days"); break;
			case 2: System.out.println("February " + year + " had" +
					  ((leapYear) ? " 29 days" : " 28 days")); break;
			case 3: System.out.println(
					 "March " + year + " had 31 days"); break;
			case 4: System.out.println(
					 "April " + year + " had 30 days"); break;
			case 5: System.out.println(
					 "May " + year + " had 31 days"); break;
			case 6: System.out.println(
					 "June " + year + " had 30 days"); break;
			case 7: System.out.println(
					 "July " + year + " had 31 days"); break;
			case 8: System.out.println(
					 "August " + year + " had 31 days"); break;
			case 9: System.out.println(
					 "September " + year + " had 30 days"); break;
			case 10: System.out.println(
					 "October " + year + " had 31 days"); break;
			case 11: System.out.println(
					 "November " + year + " had 30 days"); break;
			case 12: System.out.println(
					 "December " + year + " had 31 days");
		}
        input.close();
	}
}
