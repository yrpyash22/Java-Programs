

// --------------------    JAVA COLLECTION FRAMEWORK  ==>> { Time and Date Segment }    ---------------------//



/*


import java.util.Date;                    // Class 
import java.util.Calendar;                // Interface
import java.util.TimeZone;                // Interface
import java.util.GregorianCalendar;       // Class


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


*/

public class Assignment_15 {
    

    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        //System.out.println(System.currentTimeMillis()/ 1000 / 3600 / 24 / 365); // take year since (1970 to then)




        // Java store a date 
        // Date d = new Date();
        // System.out.println(d);

        // System.out.println(d.getTime());
        // System.out.println(d.getDate());



        // Calender class 
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTime());
        // System.out.println(c.getTimeZone().getID());

        // System.out.println(Calendar.SECOND);
        // System.out.println(Calendar.HOUR);
        // System.out.println(Calendar.MINUTE);
        // System.out.println(Calendar.HOUR_OF_DAY);
        

        // Timezone 
        // Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/India"));
        // System.out.println(c1.getTimeZone());
        

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 0; i < n; i++)
        // {
        //     System.out.println(TimeZone.getAvailableIDs()[i]);
        // }





        // GregorianCalendar class
        // GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.isLeapYear(2026));
        




/*
        // java.time packages
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_mm_yyyy");
        String str = dt.format(dtf);
        System.out.println(str);
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dtf2);
*/


        
    }

}
